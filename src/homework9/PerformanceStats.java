package homework9;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by Dim on 27.03.2016.
 */
public class PerformanceStats {

    public static void main(String[] args) {
        int size = 100_000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        fillUp(arrayList, size);
        fillUp(linkedList, size);
        fillUp(treeSet, size);

    }

    public static void fillUp(Collection<Integer> collection, int size){
        for (int i = 0; i < size; i++) {
            collection.add(i);
        }
    }
}
