package homework9;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Dim on 27.03.2016.
 */
public class FloatCollectionSumTest {

    @Test
    public void sumShouldReturnZeroInEmptyCollection() {
        FloatCollectionSum example = new FloatCollectionSum();
        ArrayList<Float> arrayList = new ArrayList<>();
        float expected = 0f;
        float result = example.sum(arrayList);

        Assert.assertEquals(result, expected, 0);
    }

    @Test
    public void sumShouldReturnCorrectResult() {
        FloatCollectionSum example = new FloatCollectionSum();
        ArrayList<Float> arrayList = new ArrayList<>();
        arrayList.add(10f);
        arrayList.add(25f);
        arrayList.add(40f);
        float expected = 75f;
        float result = example.sum(arrayList);
        Assert.assertEquals(result, expected, 0);
    }

    @Test
    public void sumWithPossibleOverflow() {
        FloatCollectionSum example = new FloatCollectionSum();
        ArrayList<Float> arrayList = new ArrayList<>();

        arrayList.add(16777216f);

        for (int i = 0; i < 16778000; i++) {
            arrayList.add(1f);
        }

        System.out.println(example.sum(arrayList));
    }
}
