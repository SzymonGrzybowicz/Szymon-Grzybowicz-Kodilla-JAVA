package com.kodilla;

public class BinaryIntToDecimal {

    public static void main(String args[]) {

        long start = System.nanoTime();
        int one = 1011110;

        char[] arrayOne = intToCharArray(one);
        charArrayToDecimalInt(arrayOne);

        long end = System.nanoTime();

        System.out.println(end - start);


        start = System.nanoTime();
        getDecimalFromBinary(1011110);
        end = System.nanoTime();

        System.out.println(end - start);
    }


    public static int getDecimalFromBinary(int binary) {
        int result = 0;
        int i = 0;

        while (binary > 0) {

            result = result + (binary % 10 * (int) Math.pow(2.0, i));
            binary = binary / 10;
            i++;
        }
        return result;
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
