package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {

    @NotNull
    @Size(min=3, max=25)
    private String firstName;

    @NotNull
    @Size(min=3, max=25)
    private String lastName;

    @NotNull
    @Size(min=3, max=25)
    private String favoriteFood;

    public Person() {
        firstName = null;
        lastName = null;
        favoriteFood = null;
    }

    public Person(String firstName, String lastName, String favoriteFood) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteFood = favoriteFood;
    }
}