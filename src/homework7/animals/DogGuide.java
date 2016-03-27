package homework7.animals;

/**
 * Created by Dim on 11.03.2016.
 */
public class DogGuide extends Dog {
    private boolean isTrained;

    public DogGuide(int id, boolean isTrained) {
        super(id);
        this.isTrained = isTrained;
    }

    public DogGuide(int id, String name, int age, int weight, String color, boolean isVactinated, boolean isTrained) {
        super(id, name, age, weight, color, isVactinated);
        this.isTrained = isTrained;
    }

    public void takeHome() {
        if (isTrained()) {
            System.out.println("This way!");
        } else {
            System.out.println("I'm not trained.");
        }
    }

    public String getType(){
        return "DogGuide";
    }

    @Override
    public String giveVoice() {
        if (isTrained()) {
            return super.giveVoice() + " I can take you home.";
        }
        return super.giveVoice();
    }

    public boolean isTrained() {
        return isTrained;
    }
}
