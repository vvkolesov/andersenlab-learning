package com.andersenlab.lecture4.homework4.catsAndPlates;

public class Cat {

    private String name;
    private int appetite;

    //● Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
    // Если коту удалось покушать (хватило еды), сытость = true.
    private boolean isHungry = true;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) throws Exception {
        if (isHungry) {
            plate.decreaseFood(appetite);
            isHungry = false;
        } else System.out.println("Cat is already full");
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}
