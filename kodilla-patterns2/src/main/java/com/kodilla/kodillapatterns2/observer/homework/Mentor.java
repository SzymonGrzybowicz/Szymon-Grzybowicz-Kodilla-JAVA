package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements Observer {

    private final String name;
    private int notificationNumber;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void onNext(HomeworkQueue homeworkQueue) {
        System.out.println("Mentor: " + name + ":user: " + homeworkQueue.getUsername() +
                " added homework. Number of homework: " + homeworkQueue.getHomeworkList().size());
        notificationNumber++;

    }

    public String getName() {
        return name;
    }

    public int getNotificationNumber() {
        return notificationNumber;
    }
}
