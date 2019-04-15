package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String name;
    double field;

    public Triangle(String name, double field) {
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
    public boolean equals(Object o) {
        Triangle triangle = (Triangle) o;
        return this.name.equals(triangle.name) && this.field == triangle.field;
    }

    @Override
    public int hashCode(){
        return (int)field;
    }


}


