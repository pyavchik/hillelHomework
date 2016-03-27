package homework7.animals;

/**
 * Created by Dim on 11.03.2016.
 */
public abstract class Wild extends Animal {
    private boolean isPredator;

    @Deprecated
    public Wild() {
        super();
    }

    public Wild(int id) {
        super(id);
    }

    public Wild(int id, String name, int age, int weight, String color) {
        super(id, name, age, weight, color);
    }

    @Override
    public String giveVoice() {
        String result = super.giveVoice() + ", I am a wild animal";
        if (isPredator()) {
            result = result + ", and I am angry!";
        }
        return result;
    }

    public boolean isPredator() {
        return isPredator;
    }

    protected void setPredator(boolean predator) {
        isPredator = predator;
    }
}
