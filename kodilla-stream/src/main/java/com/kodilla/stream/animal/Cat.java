package com.kodilla.stream.animal;

public class Cat implements Animal {

    private String name;
    private String hair;


    public Cat(String name, String hair) {
        this.name = name;
        this.hair = hair;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getHair(){
        return hair;
    }
}
