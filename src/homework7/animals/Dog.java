package homework7.animals;

/**
 * Created by Dim on 11.03.2016.
 */
public class Dog extends Pet {
    public Dog(int id) {
        super(id);
    }

    public Dog(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, isVactinated);
    }

    public String getType(){
        return "Dog";
    }

    @Override
    public String giveVoice() {
        return super.giveVoice() + " *Woof!*";
    }
}
