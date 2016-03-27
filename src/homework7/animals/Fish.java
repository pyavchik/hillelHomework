package homework7.animals;

/**
 * Created by Dim on 11.03.2016.
 */
public class Fish extends Pet {
    public Fish(int id) {
        super(id);
    }

    public Fish(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, isVactinated);
    }

    public String getType(){
        return "Fish";
    }

    @Override
    public String giveVoice() {
        return "....";
    }
}
