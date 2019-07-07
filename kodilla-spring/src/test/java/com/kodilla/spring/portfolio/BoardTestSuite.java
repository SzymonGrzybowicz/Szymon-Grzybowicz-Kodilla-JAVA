package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.getDoneList().addTask("Done Task1");
        board.getInProgressList().addTask("In Progress Task1");
        board.getToDoList().addTask("To Do Task1");

        //Then

        Assert.assertEquals("Done Task1", board.getDoneList().getTasks().get(0));
        Assert.assertEquals("In Progress Task1", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("To Do Task1", board.getToDoList().getTasks().get(0));


    }
}
