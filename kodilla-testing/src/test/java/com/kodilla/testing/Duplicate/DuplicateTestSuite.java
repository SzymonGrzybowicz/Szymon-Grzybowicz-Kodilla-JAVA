package com.kodilla.testing.Duplicate;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DuplicateTestSuite {

    static int i;


    @Before
    public void setUp() throws Exception {
        System.out.println("Test " + i + " Started!");
        i++;
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test Finished!");
    }

    @Test
    public void getDuplicateValue() {
        //Given
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9);
        Duplicate duplicate = new Duplicate();


        //When
        int result = duplicate.getDuplicateValue(list);


        //Then
        Assert.assertEquals(6, result);

    }

    @Test
    public void getDouplicateValueWhenRepeatedNumbersOccursAtDifferentPositions() {
        //Given
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 2);
        Duplicate duplicate = new Duplicate();


        //When
        int result = duplicate.getDuplicateValue(list);


        //Then
        Assert.assertEquals(2, result);
    }

    @Test
    public void getDuplicateValueWhenRepeatedNumbersExistAtStartOfList() {
        //Given
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Duplicate duplicate = new Duplicate();


        //When
        int result = duplicate.getDuplicateValue(list);


        //Then
        Assert.assertEquals(1, result);
    }

    @Test
    public void getDuplicateValueWhenRepeatedNumbersExistAtEndOfList() {
        //Given
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9);
        Duplicate duplicate = new Duplicate();


        //When
        int result = duplicate.getDuplicateValue(list);


        //Then
        Assert.assertEquals(9, result);
    }
}