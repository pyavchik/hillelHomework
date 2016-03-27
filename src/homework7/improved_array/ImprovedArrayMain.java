package homework7.improved_array;

import homework7.animals.Dog;

/**
 * Created by Dim on 12.03.2016.
 */
public class ImprovedArrayMain {
    public static void main(String[] args) {
        System.out.println("===ImprovedArray Example===");
        ImprovedArray firstArray = new ImprovedArray();
        firstArray.add(new Dog(2));
        firstArray.add("Two");
        firstArray.add("Three");
        firstArray.add("Four");
        firstArray.add("Five");
        firstArray.add(true);

        firstArray.remove(2);
        firstArray.remove("Five");
        System.out.println("firstArray: " + firstArray);
        System.out.println("firstArray contains Two: " + firstArray.contains("Two"));
        System.out.println("firstArray element with Index=2 : " + firstArray.get(2));
        System.out.println("firstArray size: " + firstArray.size());

        ImprovedArray secondArray = new ImprovedArray();
        secondArray.add(new Dog(2));
        secondArray.add("Two");
        secondArray.add("Four");
        secondArray.add(true);
        System.out.println("firstArray equals secondArray: " + firstArray.equals(secondArray));
    }
}
