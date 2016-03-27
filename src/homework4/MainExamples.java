package homework4;

import homework4.geometry.MyCircle;
import homework4.geometry.MyRectangle;
import homework4.geometry.MyTriangle;

/**
 * Created by Dim on 25.02.2016.
 */
public class MainExamples {
    public static void main(String[] args) {

        rectangleExample();

        triangleExample();

        circleExample();

    }

    private static void rectangleExample() {
        System.out.println("===RECTANGLE EXAMPLE===");
        System.out.println("Rectangle Task with area=30, perimeter=22");
        RectangleTask firstTask = new RectangleTask();
        firstTask.area = 30;
        firstTask.perimeter = 22;
        MyRectangle firstRectangle = firstTask.calculateSides();
        System.out.println("Parameters of firstRectangle: " + firstRectangle.getLength() + " x " + firstRectangle.getWidth());
        RectangleTask secondTask = new RectangleTask();
        secondTask.area = 2051;
        secondTask.perimeter = 22;
        MyRectangle secondRectangle = secondTask.calculateSides();
        System.out.println("Parameters of secondRectangle: " + secondRectangle.getLength() + " x " + secondRectangle.getWidth());

        MyRectangle rectangleObject = new MyRectangle(6, 10);
        System.out.println("Area of rectangleObject: " + rectangleObject.area());
        System.out.println("Perimeter of rectangleObject: " + rectangleObject.perimeter());
    }

    private static void triangleExample() {
        System.out.println("===TRIANGLE EXAMPLE===");
        MyTriangle firstTriangle = new MyTriangle(8, 17, 15);
        MyTriangle secondTriangle = new MyTriangle(17, 15, 8);
        System.out.println("firstTriangle equals secondTriangle: " + firstTriangle.equals(secondTriangle));
        System.out.println("Perimeter of firstTriangle: " + firstTriangle.perimeter());
        System.out.println("Area of firstTriangle: " + firstTriangle.area());
    }

    private static void circleExample() {
        System.out.println("===CIRCLE EXAMPLE===");
        MyCircle circleObject = new MyCircle(15);
        System.out.println("Area of circleObject: " + circleObject.area());
        System.out.println("Length of circleObject: " + circleObject.length());
    }
}