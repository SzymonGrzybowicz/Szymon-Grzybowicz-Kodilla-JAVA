package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ShapeCollector {

    int numberOfElement;
    List<Shape> list = new LinkedList<>();

    public void addFigure(Shape shape) {
        list.add(numberOfElement, shape);
        numberOfElement++;
    }

    public void removeFigure(Shape shape) {
        list.remove(shape);
        if (numberOfElement > 0) {
            numberOfElement--;
        }

    }

    public Shape getShape(int n) {
        if (numberOfElement == 0 || n < 0 || n > numberOfElement) {
            return null;
        } else {
            return list.get(n);
        }



    }

    public String showFigures() {
        if (numberOfElement == 0) {
            return "There is no Figures!";
        } else {
            String result = "";
            for (Shape shape : list) {
                result = result + shape.toString();
            }
            return result;
        }
    }

    public int getNumberOfElement() {
        return numberOfElement;
    }
}
