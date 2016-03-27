package homework7.animals;

/**
 * Created by Dim on 11.03.2016.
 */
public abstract class Pet extends Animal {
    private boolean isVactinated;

    @Deprecated
    public Pet() {
        super();
    }

    public Pet(int id) {
        super(id);
    }

    public Pet(int id, String name, int age, int weight, String color, boolean isVactinated) {
        super(id, name, age, weight, color);
        this.isVactinated = isVactinated;
    }

    public boolean isVactinated() {
        return isVactinated;
    }
}
