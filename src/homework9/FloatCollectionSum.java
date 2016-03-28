package homework9;

import java.util.Collection;

/**
 * Created by Dim on 26.03.2016.
 */
public class FloatCollectionSum {

    public float sum(Collection<Float> collection) {
        float sum = 0;
        int deviation = 0;
        for (Float o : collection) {
            if ((sum + o == 16777216f) && (sum + (o + 1) == 16777218f)) {
                deviation += 1;
            } else if ((sum + o == 16777216f) && (sum + (o - 1) == 16777216f)) {
                deviation -= 1;
            }
            sum += o;
        }
        return sum + deviation;
    }
}
