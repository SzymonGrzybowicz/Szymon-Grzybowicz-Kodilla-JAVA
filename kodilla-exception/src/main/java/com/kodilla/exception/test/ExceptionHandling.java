package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {


        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(2.5, 3));
        } catch (Exception e) {
            System.out.println("Exception one");

        }

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(1, 3));
        } catch (Exception e) {
            System.out.println("Exception two");

        }

    }
}
