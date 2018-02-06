
import java.util.ArrayList;


public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        int currentWeight = 0;
        for (Thing things : things) {
            currentWeight += things.getWeight();
        }

        if (currentWeight + thing.getWeight() <= maxWeight) {
            this.things.add(thing);
        }
    }

    @Override
    public String toString() {
        int currentWeight = 0;
        for (Thing things : things) {
            currentWeight += things.getWeight();
        }
        String s = String.format("%d things (%d kg)", things.size(), currentWeight);
        if (this.things.isEmpty()) {
            s = String.format("empty (%d kg)", currentWeight);
        } else if (this.things.size() == 1) {
            s = String.format("%d thing (%d kg)", things.size(), currentWeight);

        }

        return s;
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getWeight();
        }

        return totalWeight;
    }

    public Thing heaviestThing() {
        int heaviestThing = 0;
        if(this.things.isEmpty()) return null;
        Thing item = new Thing(things.get(0).getName(), things.get(0).getWeight());
        for (Thing thing : things) {

            if (thing.getWeight() >= heaviestThing) {
                heaviestThing = thing.getWeight();
                item = thing;

            }
        }
        return item;
    }

}
