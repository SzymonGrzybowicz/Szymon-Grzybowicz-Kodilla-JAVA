package com.kodilla;

public class BinaryIntToDecimal {

    public static void main(String args[]) {
        int one = 1011110;
        int two = 10;
        int three = 11;

        char[] arrayOne = intToCharArray(one);
        char[] arrayTwo = intToCharArray(two);
        char[] arrayThree = intToCharArray(three);

        System.out.println("Liczba dwójkowa: " + one + " to: " + charArrayToDecimalInt(arrayOne) + " dziesiętnie");
        System.out.println("Liczba dwójkowa: " + two + " to: " + charArrayToDecimalInt(arrayTwo) + " dziesiętnie");
        System.out.println("Liczba dwójkowa: " + three + " to: " + charArrayToDecimalInt(arrayThree) + " dziesiętnie");

    }


    public static int charArrayToDecimalInt(char[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 49) {
                result = result + (int) Math.pow(2.0, array.length - (i + 1));
            }
        }
        return result;
    }

    public static char[] intToCharArray(int i) {
        Integer k = i;
        String integerAsString = k.toString();
        return integerAsString.toCharArray();
    }


}
