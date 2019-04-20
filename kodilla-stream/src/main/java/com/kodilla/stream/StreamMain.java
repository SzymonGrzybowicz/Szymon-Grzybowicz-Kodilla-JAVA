package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Text one!", (text) -> System.out.println("ABCD" + text +"ABCD\n"));
        poemBeautifier.beautify("Text two!", (text) -> System.out.println("*************\n**" + text +"**\n*************\n"));
        poemBeautifier.beautify("Text Three!", (text) -> System.out.println(text.toUpperCase()));
    }
}