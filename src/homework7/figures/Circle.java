package homework7.figures;

/**
 * Created by Dim on 14.03.2016.
 */
public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }
}
