package com.kodilla.stream.animal;

public class Dog implements Animal {

    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}
