package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String ID_DRIVING_TASK = "DRIVING";
    public static final String ID_PAINTING_TASK = "PAINTING";
    public static final String ID_SHOPPING_TASK = "SHOPPING";

    public static final Task makeTask(String taskID) {

        switch (taskID) {
            case (ID_DRIVING_TASK):
                return new DrivingTask("DrivingTask", "Wroclaw", "Car");
            case (ID_PAINTING_TASK):
                return new PaintingTask("PaintingTask", "colorful", "house");
            case (ID_SHOPPING_TASK):
                return new ShoppingTask("Shoppingtask", "bread", 2.5);
            default:
                return null;
        }
    }
}
