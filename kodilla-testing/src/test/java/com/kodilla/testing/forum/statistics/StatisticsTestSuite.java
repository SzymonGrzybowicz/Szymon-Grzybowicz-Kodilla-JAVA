package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsTestSuite {

    static int i;

    @Before
    public void beforeEveryTest() {
        System.out.println("Starting Test no: " + i + "!");
        i++;
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting testing statistic.Calculation class");
    }

    @Test
    public void testStatisticCalculationWhenAllParametersAreZero() {


        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);

        Calculation calculation = new Calculation();
        calculation.calculateAdvStatistics(statisticsMock);
        //When


        int userAmount = calculation.userAmount;
        int postsAmount = calculation.postsAmount;
        int commentsAmount = calculation.commentsAmount;
        double postsAveragePerUser = calculation.postsAveragePerUser;
        double commentsAveragePerUser = calculation.commentsAveragePerUser;
        double commentsAveragePerPost = calculation.commentsAveragePerPost;


        //Then

        Assert.assertEquals(0, userAmount);
        Assert.assertEquals(0, postsAmount);
        Assert.assertEquals(0, commentsAmount);
        Assert.assertEquals(0, postsAveragePerUser, 0);
        Assert.assertEquals(0, commentsAveragePerUser, 0);
        Assert.assertEquals(0, commentsAveragePerPost, 0);
    }

    @Test
    public void testStatisticCalculationWhenOneHundredUsers() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add(Integer.toString(i));
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);

        Calculation calculation = new Calculation();
        calculation.calculateAdvStatistics(statisticsMock);
        //When


        int userAmount = calculation.userAmount;
        int postsAmount = calculation.postsAmount;
        int commentsAmount = calculation.commentsAmount;
        double postsAveragePerUser = calculation.postsAveragePerUser;
        double commentsAveragePerUser = calculation.commentsAveragePerUser;
        double commentsAveragePerPost = calculation.commentsAveragePerPost;


        //Then

        Assert.assertEquals(100, userAmount);
        Assert.assertEquals(0, postsAmount);
        Assert.assertEquals(0, commentsAmount);
        Assert.assertEquals(0, postsAveragePerUser, 0);
        Assert.assertEquals(0, commentsAveragePerUser, 0);
        Assert.assertEquals(0, commentsAveragePerPost, 0);
    }

    @Test
    public void testStatisticCalculationWhenOneThousandPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add(Integer.toString(i));
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);

        Calculation calculation = new Calculation();
        calculation.calculateAdvStatistics(statisticsMock);
        //When


        int userAmount = calculation.userAmount;
        int postsAmount = calculation.postsAmount;
        int commentsAmount = calculation.commentsAmount;
        double postsAveragePerUser = calculation.postsAveragePerUser;
        double commentsAveragePerUser = calculation.commentsAveragePerUser;
        double commentsAveragePerPost = calculation.commentsAveragePerPost;


        //Then

        Assert.assertEquals(100, userAmount);
        Assert.assertEquals(1000, postsAmount);
        Assert.assertEquals(0, commentsAmount);
        Assert.assertEquals(10, postsAveragePerUser, 0);
        Assert.assertEquals(0, commentsAveragePerUser, 0);
        Assert.assertEquals(0, commentsAveragePerPost, 0);
    }


    @Test
    public void testStatisticCalculationWhenCommentsAmountIsHigher() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add(Integer.toString(i));
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);

        Calculation calculation = new Calculation();
        calculation.calculateAdvStatistics(statisticsMock);
        //When


        int userAmount = calculation.userAmount;
        int postsAmount = calculation.postsAmount;
        int commentsAmount = calculation.commentsAmount;
        double postsAveragePerUser = calculation.postsAveragePerUser;
        double commentsAveragePerUser = calculation.commentsAveragePerUser;
        double commentsAveragePerPost = calculation.commentsAveragePerPost;


        //Then

        Assert.assertEquals(100, userAmount);
        Assert.assertEquals(100, postsAmount);
        Assert.assertEquals(1000, commentsAmount);
        Assert.assertEquals(1, postsAveragePerUser, 0);
        Assert.assertEquals(10, commentsAveragePerUser, 0);
        Assert.assertEquals(10, commentsAveragePerPost, 0);
    }

}
