package com.kodilla.testing.shape;

public class Square implements Shape {
    String name;
    double field;

    public Square(String name, double field) {
        this.name = name;
        this.field = field;
    }


    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", field=" + field +
                '}';
    }

    @Override
    public int hashCode() {
        return (int) field;
    }

    @Override
    public boolean equals(Object o) {
        Square square = (Square) o;
        return this.name.equals(square.name) && this.field == square.field;
    }


}
