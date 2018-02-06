/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Christopher
 */
public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000.0;
        this.volume = 0.0;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        double freeSpace = capacity - volume;
        return freeSpace;
    }

    public void addToTank(double amount) {
        if (amount < 0) {
            return;
        }
        if(amount<=howMuchFreeSpace()){
            volume+=amount;
        }
        else{
            volume = capacity;
        }
    }

    public double getFromTank(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > volume) {
            double everything = volume;
            volume = 0.0;
            return everything;
        }

        volume = volume - amount;

        return amount;

    }

    @Override
    public String toString() {

        String s = String.format("%.1f/%.1f", Math.ceil(getVolume()), Math.ceil(getCapacity()));
        return s;
    }
}
