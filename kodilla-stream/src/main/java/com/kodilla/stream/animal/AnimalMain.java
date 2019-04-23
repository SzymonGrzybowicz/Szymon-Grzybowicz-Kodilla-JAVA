package com.kodilla.stream.animal;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalMain {


    public static void main(String[] args) {
        List<Animal> list = getDefaultAnimals();
        List<String> conditions = Arrays.asList("breed2", "breed3", "breed5");

        List<Animal> collect = list.stream()
                .filter(animal -> {
                    if (animal instanceof Dog) {
                        return conditions.contains(((Dog) animal).getBreed());
                    }
                    if (animal instanceof Cat) {
                        return ((Cat) animal).getHair().equals("hair1");
                    }

                    return false;

                })
                .collect(Collectors.toList());


        System.out.println(collect);

    }


    private static List<Animal> getDefaultAnimals() {

        List<Animal> list = new LinkedList<>();


        for (int i = 0; i < 5; i++) {
            list.add(new Cat("name" + i, "hair" + i));
            list.add(new Dog("name" + i, "breed" + i));
        }

        return list;

    }
}
