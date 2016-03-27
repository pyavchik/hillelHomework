package homework7.animals;

/**
 * Created by Dim on 11.03.2016.
 */
public class Hamster extends Pet {
    public Hamster(int id) {
        super(id);
    }

    public Hamster(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, isVactinated);
    }

    public String getType(){
        return "Hamster";
    }
}
