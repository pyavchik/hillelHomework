package homework4;

import homework4.geometry.MyRectangle;

/**
 * Created by Dim on 24.02.2016.
 */
public class RectangleTask {
    double area;
    double perimeter;

    public MyRectangle calculateSides() {
        MyRectangle rectangle = new MyRectangle();

        if (area < Math.pow(perimeter, 2) / 16) {
            rectangle.setLength((perimeter + Math.sqrt(Math.pow(perimeter, 2) - 16 * area)) / 4);
            rectangle.setWidth((perimeter - Math.sqrt(Math.pow(perimeter, 2) - 16 * area)) / 4);
        } else {
            System.out.println("Such rectangle doesn't exist! Area:" + area + " Perimeter:" + perimeter);
            rectangle.setWidth(0);
            rectangle.setLength(0);
        }
        return rectangle;
    }
}
