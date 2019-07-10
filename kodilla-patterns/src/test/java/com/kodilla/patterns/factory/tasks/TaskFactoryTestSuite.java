package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testPaintintgTask(){
        //Given
        PaintingTask task = (PaintingTask)TaskFactory.makeTask(TaskFactory.ID_PAINTING_TASK);



        //When & Then
        Assert.assertEquals("PaintingTask", task.getTaskName());
        Assert.assertEquals("colorful", task.getColor());
        Assert.assertEquals("house", task.getWhatToPaint());
        Assert.assertEquals(false, task.isTaskExecuted());

        task.executeTask();

        Assert.assertEquals(true, task.isTaskExecuted());

    }

    @Test
    public void testDrivingTask(){
        //Given
        DrivingTask task = (DrivingTask)TaskFactory.makeTask(TaskFactory.ID_DRIVING_TASK);



        //When & Then
        Assert.assertEquals("DrivingTask", task.getTaskName());
        Assert.assertEquals("Wroclaw", task.getWhere());
        Assert.assertEquals("Car", task.getUsing());
        Assert.assertEquals(false, task.isTaskExecuted());

        task.executeTask();

        Assert.assertEquals(true, task.isTaskExecuted());
    }

    @Test
    public void testShoppingTask(){
        //Given
        ShoppingTask task = (ShoppingTask) TaskFactory.makeTask(TaskFactory.ID_SHOPPING_TASK);



        //When & Then
        Assert.assertEquals("Shoppingtask", task.getTaskName());
        Assert.assertEquals("bread", task.getWhatToBuy());
        Assert.assertEquals(2.5, task.getQuality(), 0.1);
        Assert.assertEquals(false, task.isTaskExecuted());

        task.executeTask();

        Assert.assertEquals(true, task.isTaskExecuted());
    }
}
