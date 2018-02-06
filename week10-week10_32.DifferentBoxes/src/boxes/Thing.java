package boxes;

import java.util.Collection;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) throws IllegalArgumentException {

        if (weight < 0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        Thing compared = (Thing) obj;
        if (this.getName().equals(compared.getName())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (name == null) {
            return 7;
        }
        return this.name.hashCode();
    }

}
