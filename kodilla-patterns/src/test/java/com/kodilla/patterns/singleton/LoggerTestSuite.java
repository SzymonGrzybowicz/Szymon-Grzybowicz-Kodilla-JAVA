package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void beforeClass() {
        Logger.getInstance().log("log numero uno");
    }

    @Test
    public void testGetLastLog() {
        //Given

        //When
        String result = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("log numero uno", Logger.getInstance().getLastLog());
    }
}
