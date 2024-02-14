package com.andersenlab.lecture3.homework3;

public class Employee {

    private final String name;
    private final String lastName;
    private final String jobTitle;
    private final String email;
    private final long phone;
    private final long salary;
    private final int age;

    public Employee(String name, String lastName, String jobTitle, String email, long phone, long salary, int age) {
        this.name = name;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() { return name; }

    public String getLastName() {
        return lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public long getPhone() {
        return phone;
    }

    public long getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

}
