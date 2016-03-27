package homework7.animals;

/**
 * Created by Dim on 11.03.2016.
 */
public class Cat extends Pet {
    public Cat(int id) {
        super(id);
    }

    public Cat(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color, isVactinated);
    }

    public String getType(){
        return "Cat";
    }

    @Override
    public String giveVoice() {
        return super.giveVoice() + " *Meow!*";
    }
}
