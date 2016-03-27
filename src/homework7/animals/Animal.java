package homework7.animals;

/**
 * Created by Dim on 11.03.2016.
 */
public abstract class Animal {
    private int id;
    private String name;
    private int age;
    private int weight;
    private String color;

    @Deprecated
    public Animal() {

    }

    public Animal(int id) {
        this.id = id;
    }

    public Animal(int id, String name, int age, int weight, String color) {
        this(id);
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String giveVoice() {
        String result = "Hello";
        if (getName() != null && !getName().isEmpty()) {
            result = result + ", my name is " + getName();
        }
        return result;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public abstract String getType();

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal other = (Animal) o;
        return getId() == other.getId() && getClass().equals(other.getClass());
    }

    @Override
    public String toString() {
        return getType() + " ID:" + id;
    }
}
