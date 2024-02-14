package com.andersenlab.lecture3.homework3;

public class EmployeeDataPrinter {

    public static void employeeDataPrinter(Employee employee) {

        System.out.println(
                "Employee: \n" +
                        "   Name: " + employee.getName() + " \n" +
                        "   Surname: " + employee.getLastName() + " \n" +
                        "   Job title" + employee.getJobTitle() + " \n" +
                        "   Email: " + employee.getEmail() + " \n" +
                        "   Phone number: " + employee.getPhone() + " \n" +
                        "   Salary: " + employee.getSalary() + " \n" +
                        "   Age: " + employee.getAge() + " \n"
        );
    }
}
