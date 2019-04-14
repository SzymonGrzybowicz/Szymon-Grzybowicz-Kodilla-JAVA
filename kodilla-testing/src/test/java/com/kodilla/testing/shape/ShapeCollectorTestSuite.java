package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int i;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Testing ShapeCollection Starting!");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("Testing ShapeCollection Finished!");
    }

    @Before
    public void beforeEveryTest() {
        System.out.println("Testing no: " + i + " Starting!");
        i++;
    }

    @Test
    public void testAddFigure() {

        //Given
        Triangle triangle = new Triangle("triangleOne", 10);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);

        //When
        Shape result = collector.getShape(0);
        int resultNumber = collector.getNumberOfElement();

        //Then
        Assert.assertEquals(1, resultNumber);
        Assert.assertEquals(triangle, result);

    }

    @Test
    public void testRemoveFigureWithOneElement() {

        //Given
        Triangle triangle = new Triangle("triangleOne", 10);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);
        collector.removeFigure(triangle);

        //When
        String result = collector.showFigures();
        int resultNumber = collector.getNumberOfElement();

        //Then
        Assert.assertEquals(0, resultNumber);
        Assert.assertEquals("There is no Figures!", result);

    }

    @Test
    public void testRemoveFigure() {

        //Given
        Triangle triangle = new Triangle("triangleOne", 10);
        Square square = new Square("squareOne0", 2.0);
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(triangle);
        collector.addFigure(square);
        collector.removeFigure(triangle);

        //When
        Shape result = collector.getShape(0);
        int resultNumber = collector.getNumberOfElement();

        //Then
        Assert.assertEquals(1, resultNumber);
        Assert.assertEquals(square, result);

    }

    @Test
    public void testGetShapeWithNoElement() {
        //Given
        ShapeCollector collector = new ShapeCollector();

        //When
        Shape result = collector.getShape(0);

        //Then
        Assert.assertEquals(null, result);

    }

    @Test
    public void testGetShape() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square("squareOne", 2);
        collector.addFigure(square);

        //When
        Shape result = collector.getShape(0);

        //Then
        Assert.assertEquals(square, result);
    }

    @Test
    public void testGetShapeWithIndexOutOfBound(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square("squareOne", 2);
        collector.addFigure(square);

        //When
        Shape result = collector.getShape(5);

        //Then
        Assert.assertEquals(null, result);
    }

    @Test
    public void testGetShapeWithNegativeIndex(){
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square("squareOne", 2);
        collector.addFigure(square);

        //When
        Shape result = collector.getShape(-3);

        //Then
        Assert.assertEquals(null, result);
    }



    @Test
    public void testShowFiguresWithoutFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        String expected = "There is no Figures!";

        //When
        String result = collector.showFigures();

        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square("SquareOne", 2.0);
        collector.addFigure(square);
        String exepected = "Shape{" +
                "name='" + square.getShapeName() + '\'' +
                ", field=" + square.getField() +
                '}';
        //When
        String result = collector.showFigures();

        //Then
        Assert.assertEquals(exepected, result);
    }

}
