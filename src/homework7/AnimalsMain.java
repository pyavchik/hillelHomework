package homework7;

import homework7.animals.*;

/**
 * Created by Dim on 12.03.2016.
 */
public class AnimalsMain {

    public static void main(String[] args) {
        Cat cat = new Cat(1);
        Crocodile croco = new Crocodile(2);
        Dog dog = new Dog(3);
        DogGuide anotherDog = new DogGuide(4, true);
        Fish fish = new Fish(5);
        Giraffe giraffe = new Giraffe(6);
        Hamster hamster = new Hamster(7, "Robert De Niro", 72, 9000, "Black", true);
        Lion lion = new Lion(8, "Sam", 12, 300, "Orange");
        Wolf wolf = new Wolf(9);

        System.out.println("\tCAT");
        introduce(cat);
        System.out.println("\tCROCODILE");
        introduce(croco);
        System.out.println("\tDOG");
        introduce(dog);
        System.out.println("\tDOG GUIDE");
        introduce(anotherDog);
        System.out.println("\tFISH");
        introduce(fish);
        System.out.println("\tGIRAFFE");
        introduce(giraffe);
        System.out.println("\tHAMSTER");
        introduce(hamster);
        System.out.println("\tLION");
        introduce(lion);
        System.out.println("\tWOLF");
        introduce(wolf);
    }

    public static void introduce(Animal animal) {
        System.out.println(animal.giveVoice());
    }
}
