package homework7.animals;

/**
 * Created by Dim on 11.03.2016.
 */
public class Lion extends Wild {
    public Lion(int id) {
        super(id);
        setPredator(true);
    }

    public Lion(int id, String name, int age, int weight, String color) {
        super(id, name, age, weight, color);
        setPredator(true);
    }

    public String getType(){
        return "Lion";
    }
}
