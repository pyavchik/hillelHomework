package homework7.improved_array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Dim on 27.03.2016.
 */
public class ImprovedArrayTest {

    @Test
    public void searchSortedShouldReturnCorrectResults() {
        ImprovedArray array = new ImprovedArray();
        array.add(1f);
        array.add(2f);
        array.add(3f);
        array.add(4f);
        array.add(5f);

        boolean[] expected = new boolean[8];
        Arrays.fill(expected, true);
        expected[0] = false;
        expected[1] = false;
        expected[7] = false;

        boolean[] results = new boolean[8];
        results[0] = array.containsSorted(-1f);
        results[1] = array.containsSorted(0f);
        results[2] = array.containsSorted(1f);
        results[3] = array.containsSorted(2f);
        results[4] = array.containsSorted(3f);
        results[5] = array.containsSorted(4f);
        results[6] = array.containsSorted(5f);
        results[7] = array.containsSorted(6f);

        Assert.assertArrayEquals(expected, results);
    }
}
