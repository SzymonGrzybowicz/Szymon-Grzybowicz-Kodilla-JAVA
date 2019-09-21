package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {

    @Test
    public void homeworkQueueTestSuite() {
        //Given
        HomeworkQueue homeworkQueue1 = new HomeworkQueue("user1");
        HomeworkQueue homeworkQueue2 = new HomeworkQueue("user2");
        HomeworkQueue homeworkQueue3 = new HomeworkQueue("user3");
        HomeworkQueue homeworkQueue4 = new HomeworkQueue("user4");
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");
        homeworkQueue1.subscribe(mentor2);
        homeworkQueue4.subscribe(mentor2);
        homeworkQueue2.subscribe(mentor1);
        homeworkQueue3.subscribe(mentor1);
        //When
        homeworkQueue1.addHomework("one");
        homeworkQueue2.addHomework("two");
        homeworkQueue2.addHomework("three");
        homeworkQueue3.addHomework("four");
        homeworkQueue3.addHomework("five");
        homeworkQueue3.addHomework("six");
        homeworkQueue4.addHomework("seven");
        homeworkQueue4.addHomework("eight");
        homeworkQueue4.addHomework("nine");
        homeworkQueue4.addHomework("ten");
        //Then
        Assert.assertEquals(5, mentor1.getNotificationNumber());
        Assert.assertEquals(5, mentor2.getNotificationNumber());
    }
}
