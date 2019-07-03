package com.kodilla.good.patterns;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static long getCountEmptyStringUsingJava8(List<String> strings) {
        return strings.stream()
                .filter(String::isEmpty)
                .count();

    }

    public static long getCountLength3UsingJava8(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() == 3)
                .count();

    }

    public static List<String> deleteEmptyStringsUsingJava8(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() != 0)
                .collect(Collectors.toList());
    }

    public static String getMergedStringUsingJava8(List<String> strings, String delimiter) {
        return strings.stream()
                .filter(s -> s.length() != 0)
                .collect(Collectors.joining(delimiter));
    }

    public static List<Integer> getSquaresJava8(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .map(i -> i * i)
                .collect(Collectors.toList());
    }

    public static Integer getMaxJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(Integer.MIN_VALUE);

    }

    public static Integer getMinJava8(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(Integer.MAX_VALUE);

    }

    public static Integer getSumJava8(List<Integer> numbers) {

        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

    }

    public static Integer getAverageJava8(List<Integer> numbers) {

        return (int)numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }
}
