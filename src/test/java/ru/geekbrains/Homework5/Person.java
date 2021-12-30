package ru.geekbrains.Homework5;

public class Person {
    String name;
    String post;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Person(String name, String post, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void displayInfo(){
        System.out.printf("ФИО: %s\tДолжность: %s\temail: %s\tТелефон: %s\tЗарплата: %d\tВозраст: %d\n", name, post, email, phoneNumber, salary, age);
    }

}
