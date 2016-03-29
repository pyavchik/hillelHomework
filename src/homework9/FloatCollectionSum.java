package homework9;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Dim on 26.03.2016.
 */
public class FloatCollectionSum {
    public static void main(String[] args) {
        ArrayList<Float> array = new ArrayList<>();
        array.add(1f);
        array.add(1f);
        array.add(1f);
        array.add(1f);
        array.add(1f);

        sum(array);
    }


    public static float sum(Collection<Float> collection) {
        float sum = 0;
        int deviation = 0;
        for (Float o : collection) {
            if (sum + o == sum + o + 1){
                if(sum + (o+2) == sum + o + 3){
                    deviation +=1;
                }
            }
            sum+=o;
        }
        return sum + deviation;
    }
}
