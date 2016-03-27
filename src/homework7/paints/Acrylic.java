package homework7.paints;

/**
 * Created by Dim on 14.03.2016.
 */
public class Acrylic extends Paint {

    public Acrylic(String color) {
        super(color);
    }

    @Override
    public double consumption() {
        return 0.115;
    }
}
