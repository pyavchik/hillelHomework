package homework7;

import homework7.figures.*;
import homework7.paints.*;

/**
 * Created by Dim on 14.03.2016.
 */
public class ColoredFiguresMain {
    public static void main(String[] args) {
        circleCallingPainting();
        System.out.println();

        oilPaintingRectangle();
        System.out.println();

        triangleTriesThemAll();
        System.out.println();

    }

    private static void triangleTriesThemAll() {
        Triangle triangle = new Triangle(8, 17, 15);

        System.out.println("To paint triangle:");
        triangle.paintIt(new Oil("White"));
        System.out.println(triangle.paintUsed() + "L Oil used");
        triangle.paintIt(new Acrylic("White"));
        System.out.println(triangle.paintUsed() + "L Acrylic used");
        triangle.paintIt(new Emulsion("White"));
        System.out.println(triangle.paintUsed() + "L Emulsion used");
    }

    private static void oilPaintingRectangle() {
        Rectangle rectangle = new Rectangle(15, 7);
        Oil blueOil = new Oil("Blue");
        blueOil.paint(rectangle);

        System.out.println("To paint Rectangle:");
        System.out.println(rectangle.paintUsed() + "L of " + rectangle.getColor() + " Oil color used");
    }

    private static void circleCallingPainting() {
        Circle circle = new Circle(7);
        circle.paintIt(new Acrylic("Red"));

        System.out.println("To paint Circle:");
        System.out.println(circle.paintUsed() + "L of " + circle.getColor() + " Acrylic color used");
    }
}
