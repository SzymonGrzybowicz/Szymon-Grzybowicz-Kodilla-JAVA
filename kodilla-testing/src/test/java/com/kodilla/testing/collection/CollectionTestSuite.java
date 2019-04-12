package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Testing Case: Start");
    }
    @After
    public void after(){
        System.out.println("Testing Case: End");
    }

    @Test
    public void testEmptyList(){

        //Given
        ArrayList<Integer> list = new ArrayList<Integer>();
        //When
        List<Integer> result = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(result, list);

    }

    @Test
    public void testListWithContent(){

        //Given
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        //When
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        even.add(0);
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(8);

        List<Integer> result = OddNumbersExterminator.exterminate(list);

        System.out.println("Testing list with content");

        //Then
        Assert.assertEquals(result, even);

    }
}
