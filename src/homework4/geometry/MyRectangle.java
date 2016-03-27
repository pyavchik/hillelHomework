package homework4.geometry;

/**
 * Created by Dim on 24.02.2016.
 */
public class MyRectangle {

    private double length;
    private double width;

    public MyRectangle() {

    }

    public MyRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (width + length);
    }

    public boolean equals(MyRectangle rectangle) {
        boolean result = false;
        if (width == rectangle.width && length == rectangle.length) {
            result = true;
        }
        if (width == rectangle.length && length == rectangle.width) {
            result = true;
        }
        return result;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

