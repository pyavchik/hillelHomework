package homework7.figures;

import homework7.paints.Colorable;
import homework7.paints.Paint;

/**
 * Created by Dim on 13.03.2016.
 */
public abstract class Figure implements Colorable {

    private String color;
    private double colorConsumption;

    public abstract double area();

    public abstract double perimeter();

    @Override
    public void paintIt(Paint paint) {
        color = paint.getColor();
        colorConsumption = paint.consumption();
    }

    public double paintUsed() {
        return area() * colorConsumption;
    }

    public String getColor() {
        return color;
    }
}
