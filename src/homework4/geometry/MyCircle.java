package homework4.geometry;

/**
 * Created by Dim on 24.02.2016.
 */
public class MyCircle {

    private double radius;

    public MyCircle() {

    }

    public MyCircle(double radius) {
        this.radius = radius;
    }

    public double length() {
        return Math.PI * 2 * radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean equals(MyCircle circle) {
        return (radius == circle.radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
