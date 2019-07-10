package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quality;
    private boolean executed = false;

    public ShoppingTask(String taskName, String whatToBuy, double quality) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quality = quality;
    }

    @Override
    public void executeTask() {
        executed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuality() {
        return quality;
    }
}
