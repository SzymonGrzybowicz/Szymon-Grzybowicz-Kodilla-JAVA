package com.kodilla.testing.shape;

import java.util.LinkedList;
import java.util.List;

public class ShapeCollector {

    List<Shape> list = new LinkedList<>();

    public void addFigure(Shape shape) {
        list.add(list.size(), shape);
    }

    public void removeFigure(Shape shape) {
        list.remove(shape);
    }

    public Shape getShape(int n) {
        if (list.isEmpty()|| n < 0 || n > list.size()) {
            return null;
        } else {
            return list.get(n);
        }


    }

    public String showFigures() {
        if (list.isEmpty()) {
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
        return list.size();
    }
}
