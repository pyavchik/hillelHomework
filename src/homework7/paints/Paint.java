package homework7.paints;

/**
 * Created by Dim on 13.03.2016.
 */
public abstract class Paint {
    protected String color;

    public Paint(String color) {
        this.color = color;
    }

    public abstract double consumption();

    public String getColor() {
        return color;
    }

    public void paint(Colorable toColor) {
        toColor.paintIt(this);
    }
}
