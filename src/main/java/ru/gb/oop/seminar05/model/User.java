package ru.gb.oop.seminar05.model;

public abstract class User {
    protected String name;
    protected String lastName;
    protected Integer age;

    public User(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

}
