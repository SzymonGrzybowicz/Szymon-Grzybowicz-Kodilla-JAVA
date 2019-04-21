package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        if(numbers.length == 0){
            return  0;
        }


        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        double result = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();

        System.out.println("Average: " + result);

        return result;

    }
}
