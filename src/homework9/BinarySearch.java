package homework9;

/**
 * Created by Dim on 26.03.2016.
 */
public class BinarySearch {

    public boolean search(int[] array, int element) {
        if (array.length == 0) {
            return false;
        }
        if (array.length == 1) {
            return array[0] == element;
        }
        int start = 0;
        int end = array.length - 1;
        return seek(array, element, start, end);
    }

    private boolean seek(int[] array, int element, int start, int end) {
        if (end < start) {
            return false;
        }

        int index = (start + end) / 2;

        if (element == array[index]) {
            return true;
        }

        if (element < array[index]) {
            end = index - 1;
        } else {
            start = index + 1;
        }

        return seek(array, element, start, end);
    }
}
