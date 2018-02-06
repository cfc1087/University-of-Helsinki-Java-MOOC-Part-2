
import java.util.ArrayList;


public class Container {

    private int maximumWeightLimit;
    private ArrayList<Suitcase> suitcase;

    public Container(int maximumWeightLimit) {
        suitcase = new ArrayList<Suitcase>();
        this.maximumWeightLimit = maximumWeightLimit;
    }

    public void addSuitcase(Suitcase suitcase) {
        int currentWeight = 0;
        for(Suitcase sc:this.suitcase){
            currentWeight+=sc.totalWeight();
        }
        if ( currentWeight+ suitcase.totalWeight()<=this.maximumWeightLimit) {
            this.suitcase.add(suitcase);
        }
    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for (Suitcase suitcase : this.suitcase) {
            totalWeight += suitcase.totalWeight();
        }
        String s = String.format("%d suitcases (%d kg)", suitcase.size(), totalWeight);

        return s;
    }
    public void printThings(){
        for(Suitcase sc:this.suitcase){
           sc.printThings();
        }
    }
}
