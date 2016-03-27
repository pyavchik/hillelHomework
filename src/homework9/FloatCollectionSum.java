package homework9;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Dim on 26.03.2016.
 */
public class FloatCollectionSum {

    public float sum(Collection<Float> collection){
        float sum = 0;
        for (Float o : collection){
            sum += o;
            }
        return sum;
    }
}
