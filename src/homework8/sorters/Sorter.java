package homework8.sorters;

import homework7.improved_array.ImprovedArray;
import homework8.comparison_keys.ComparableObjects;
import homework8.comparison_keys.ComparisonKeys;

/**
 * Created by Dim on 17.03.2016.
 */
public abstract class Sorter {

    ComparisonKeys key = new ComparableObjects();

    public abstract void sort(Object[] obj);

    public abstract void sort(ImprovedArray array);

    public int compare(Object firstObject, Object secondObject) {
        return key.compare(firstObject, secondObject);
    }

    public void setKey(ComparisonKeys key) {
        this.key = key;
    }
}
