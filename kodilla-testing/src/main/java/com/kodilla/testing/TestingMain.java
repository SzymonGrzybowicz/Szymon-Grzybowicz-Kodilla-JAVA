package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {

        System.out.println("Test metody add:");
        if(Calculator.add(2 ,3 ) == 5){
            System.out.println("Test zakończony poprawnie!");
        }
        else{
            System.out.println("Test zakończony negatywnie!");
        }


        System.out.println("Test metody subtract:");
        if(Calculator.subtract(2 ,3 ) == -1){
            System.out.println("Test zakończony poprawnie!");
        }
        else{
            System.out.println("Test zakończony negatywnie!");
        }

    }
}
