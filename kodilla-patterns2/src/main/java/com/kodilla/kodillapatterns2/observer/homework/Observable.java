package com.kodilla.kodillapatterns2.observer.homework;

interface Observable {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
