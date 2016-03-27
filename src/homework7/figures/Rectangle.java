package homework7.figures;

/**
 * Created by Dim on 14.03.2016.
 */
public class Rectangle extends Figure {

    private double width;
    private double heights;

    public Rectangle(double width, double heights) {
        this.width = width;
        this.heights = heights;
    }

    @Override
    public double area() {
        return width * heights;
    }

    @Override
    public double perimeter() {
        return 2 * (width + heights);
    }
}
