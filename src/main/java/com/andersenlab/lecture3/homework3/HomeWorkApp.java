package com.andersenlab.lecture3.homework3;

import static com.andersenlab.lecture3.homework3.EmployeeDataPrinter.employeeDataPrinter;

public class HomeWorkApp {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee(
                "Alexey", "ALexeev", "Engineer", "alexeev.a@email.com",
                346123456789L, 30000, 23);
        employees[1] = new Employee(
                "Ivan", "Ivanov", "Designer", "ivanov.i@email.com",
                3462345678901L, 33000,33);
        employees[2] = new Employee("Andrei", "Andreev", "IT support", "andreev.a@email.com",
                3463456789012L, 90000, 43);
        employees[3] = new Employee("Arianna", "Arianova", "Product manager",
                "arianna.a@email.com", 3464567890123L, 30000, 46);
        employees[4] = new Employee("Elena", "Elenova", "Engineer", "elenova.e@email.com",
                3465678901234L, 37000, 40);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employeeDataPrinter(employee);
            }
        }
    }
}
