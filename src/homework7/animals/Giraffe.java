package homework7.animals;

/**
 * Created by Dim on 11.03.2016.
 */
public class Giraffe extends Wild {
    public Giraffe(int id) {
        super(id);
        setPredator(false);
    }

    public Giraffe(int id, String name, int age, int weight, String color) {
        super(id, name, age, weight, color);
        setPredator(false);
    }

    public String getType(){
        return "Giraffe";
    }
}
