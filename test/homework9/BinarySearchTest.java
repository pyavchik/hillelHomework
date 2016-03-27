package homework9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Dim on 27.03.2016.
 */
public class BinarySearchTest {

    @Test
    public void searchShouldReturnCorrectResults() {
        BinarySearch example = new BinarySearch();
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7};

        boolean[] expected = new boolean[10];
        Arrays.fill(expected, true);
        expected[0] = false;
        expected[9] = false;

        boolean[] results = new boolean[10];
        results[0] = example.search(array, -1);
        results[1] = example.search(array, 0);
        results[2] = example.search(array, 1);
        results[3] = example.search(array, 2);
        results[4] = example.search(array, 3);
        results[5] = example.search(array, 4);
        results[6] = example.search(array, 5);
        results[7] = example.search(array, 6);
        results[8] = example.search(array, 7);
        results[9] = example.search(array, 8);

        Assert.assertArrayEquals(results, expected);
    }
}
