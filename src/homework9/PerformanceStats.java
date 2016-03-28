package homework9;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

/**
 * Created by Dim on 27.03.2016.
 */
public class PerformanceStats {

    public static void main(String[] args) {
        int size = 8_000_000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        System.out.print("ArrayList: ");
        fillUp(arrayList, size);
        System.out.print("LinkedList: ");
        fillUp(linkedList, size);
        System.out.print("TreeSet: ");
        fillUp(treeSet, size);
        System.out.println();

        insertElementTest(arrayList, linkedList, treeSet, size);
        System.out.println();

        searchElementTest(arrayList, linkedList, treeSet);
        System.out.println();

        removeElementTest(arrayList, linkedList, treeSet);
        System.out.println();
    }

    private static void insertElementTest(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList, TreeSet<Integer> treeSet, int size) {
        System.out.println("===INSERT ELEMENT STATS===");
        System.out.println("ArrayList's time taken to insert element in first position: " + insertStat(arrayList, 0, -1));
        System.out.println("LinkedList's time taken to insert element in first position: " + insertStat(linkedList, 0, -1));
        System.out.println("TreeSet's time taken to add the smallest element: " + insertStat(treeSet, -1));

        int lastIndex = size - 1;
        int lastElement = 8_000_001;
        System.out.println("ArrayList's time taken to insert element in last position: " + insertStat(arrayList, lastIndex, lastElement));
        System.out.println("LinkedList's time taken to insert element in last position: " + insertStat(linkedList, lastIndex, lastElement));
        System.out.println("TreeSet's time taken to add the biggest element: " + insertStat(treeSet, lastElement));
    }

    private static void searchElementTest(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList, TreeSet<Integer> treeSet) {
        System.out.println("===SEARCH ELEMENT STATS===");
        System.out.println("ArrayList's time taken to find element by value: " + containsStat(arrayList, 4_000_000));
        System.out.println("LinkedList's time taken to find element by value: " + containsStat(linkedList, 4_000_000));
        System.out.println("TreeSet's time taken to find element by value: " + containsStat(treeSet, 4_000_000));

        System.out.println("ArrayList's time taken to find element at index: " + indexSearchStat(arrayList, 4_000_000));
        System.out.println("LinkedList's time taken to find element at index: " + indexSearchStat(linkedList, 4_000_000));
    }

    private static void removeElementTest(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList, TreeSet<Integer> treeSet) {
        System.out.println("===REMOVE ELEMENT STATS===");
        System.out.println("ArrayList's time taken to remove element by value: " + removeByValueStat(arrayList, 4_000_000));
        System.out.println("LinkedList's time taken to remove element by value: " + removeByValueStat(linkedList, 4_000_000));
        System.out.println("TreeSet's time taken to remove element by value: " + removeByValueStat(treeSet, 4_000_000));

        System.out.println("ArrayList's time taken to remove element at index: " + removeAtIndexStat(arrayList, 4_000_000));
        System.out.println("LinkedList's time taken to remove element at index: " + removeAtIndexStat(linkedList, 4_000_000));
    }

    public static void fillUp(Collection<Integer> collection, int size) {
        Instant begin = Instant.now();
        for (int i = 0; i < size; i++) {
            collection.add(i);
        }
        Instant end = Instant.now();
        System.out.println("Time to fill up with " + size + " elements: " + Duration.between(begin, end).toMillis());
    }

    public static long insertStat(List<Integer> list, int index, int element) {
        Instant begin = Instant.now();
        list.add(index, element);
        Instant end = Instant.now();
        return Duration.between(begin, end).toMillis();
    }

    public static long insertStat(Set<Integer> set, int element) {
        Instant begin = Instant.now();
        set.add(element);
        Instant end = Instant.now();
        return Duration.between(begin, end).toMillis();
    }

    public static long containsStat(Collection<Integer> collection, int element) {
        Instant begin = Instant.now();
        collection.contains(element);
        Instant end = Instant.now();
        return Duration.between(begin, end).toMillis();
    }

    public static long indexSearchStat(List<Integer> list, int index) {
        Instant begin = Instant.now();
        list.get(index);
        Instant end = Instant.now();
        return Duration.between(begin, end).toMillis();
    }

    public static long removeByValueStat(Collection<Integer> collection, Integer element) {
        Instant begin = Instant.now();
        collection.remove(element);
        Instant end = Instant.now();
        return Duration.between(begin, end).toMillis();
    }

    public static long removeAtIndexStat(List<Integer> list, int index) {
        Instant begin = Instant.now();
        list.remove(index);
        Instant end = Instant.now();
        return Duration.between(begin, end).toMillis();
    }
}
