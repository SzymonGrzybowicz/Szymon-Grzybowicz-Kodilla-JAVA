package com.kodilla.stream.array;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;
import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    private static int i;
    @Before
    public void before(){
        System.out.println("Test #" + i + " started!");
    }

    @Test
    public void testGetAverage(){

        //Given
        int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};


        //When

        double result = ArrayOperations.getAverage(array);

        //Then

        Assert.assertEquals(9.5, result, 0.001);
    }

    @Test
    public void testGetAverageEmptyArray(){

        //Given
        int[] array = new int[0];


        //When

        double result =  ArrayOperations.getAverage(array);

        //Then
        Assert.assertEquals(0, result, 0);
    }
}
