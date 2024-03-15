package lecture13.homework13.tests.end2end;

import lecture13.homework13.base.BaseTest;
import lecture13.homework13.pages.end2end.GooglePage;
import lecture13.homework13.pages.end2end.GuinnessPage;
import lecture13.homework13.pages.end2end.HyrtutorialsPage;
import lecture13.homework13.pages.end2end.W3schoolPage;
import lecture13.homework13.utils.FakerUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

public class End2EndTest extends BaseTest {

    private final String googleURL = "https://www.google.com/search";
    private final String guinnessURL = "https://www.guinnessworldrecords.com/account/register?";
    private final String hyrtutorialsURL = "https://www.hyrtutorials.com/p/alertsdemo.html";
    private final String w3schoolURL = "https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit";
    private final String w3schoolNoteText = "Note: This tutorial will not teach you how servers are processing input." +
            " Processing input is explained in our PHP tutorial.";
    private final String errorMessageText = "'Confirm password' and 'Password' do not match.";
    private final String promt = "Final step of this task";
    private final String alertBoxOutput = "You selected alert popup";
    private final String confirmBoxOutput = "You pressed Cancel in confirmation popup";
    private final String promptBoxOutput = "You entered text Final step of this task in propmt popup";


    //2.	Необходимо автоматизировать сценарий, который показан на видео “Сценарий для автоматизации Лекция 12.mp4”.q
    @Test
    public void automationScenarioOne() throws InterruptedException {
        List<String> urlsList =
                Stream.of(guinnessURL, hyrtutorialsURL, w3schoolURL).toList();
        FakerUtils fakerUtils = new FakerUtils();

        GooglePage googlePage = new GooglePage(getDriver());
        W3schoolPage w3schoolPage = new W3schoolPage(getDriver());
        GuinnessPage guinnessPage = new GuinnessPage(getDriver());
        HyrtutorialsPage hyrtutorialsPage = new HyrtutorialsPage(getDriver());

        googlePage
                .load(googleURL)
                .openTabs(urlsList)
                .openW3schoolPage(urlsList)
                .login(fakerUtils.generateRegistrationData());
        Assert.assertEquals(w3schoolPage.getNoteText(), w3schoolNoteText);

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        googlePage.switchToTab(googlePage.getTabs(), 1);

        guinnessPage.guinnessRegistration(fakerUtils.generateRegistrationData());
        Assert.assertEquals(guinnessPage.getErrorMessageText(), errorMessageText);

        googlePage.switchToTab(googlePage.getTabs(), 2);

        hyrtutorialsPage.alertBoxButton();
        Assert.assertEquals(hyrtutorialsPage.getOutputText(), alertBoxOutput);
        hyrtutorialsPage.confirmBoxButton();
        Assert.assertEquals(hyrtutorialsPage.getOutputText(), confirmBoxOutput);
        hyrtutorialsPage.promptBoxButton(promt);
        Assert.assertEquals(hyrtutorialsPage.getOutputText(), promptBoxOutput);

        Thread.sleep(700);
    }
}
