
public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    public String getName() {
        return this.name;

    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        String s = String.format("%s (%d kg)", this.name, this.weight);
        return s;
    }

}
