package homework7.paints;

/**
 * Created by Dim on 14.03.2016.
 */
public class Oil extends Paint {

    public Oil(String color) {
        super(color);
    }

    @Override
    public double consumption() {
        return 0.13;
    }
}
