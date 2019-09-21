package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements Observable{

    private final List<Observer> observers;
    private final List<String> homeworkList;
    private final String username;

    public HomeworkQueue(String username) {
        this.username = username;
        this.observers = new ArrayList<>();
        this.homeworkList = new ArrayList<>();
    }

    public void addHomework(String homework) {
        homeworkList.add(homework);
        notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.onNext(this);
        }
    }

    public List<String> getHomeworkList() {
        return homeworkList;
    }

    public String getUsername() {
        return username;
    }
}
