/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Christopher
 */
public class Cow implements Milkable, Alive {

    private String name;
    private double capacity;
    private double amount;

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this.capacity = 15 + new Random().nextInt(25);
        this.amount = 0.0;
        this.name = NAMES[0 + new Random().nextInt(NAMES.length - 1)];
    }

    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + new Random().nextInt(25);
        this.amount = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        String s = String.format("%s %.1f/%.1f ", name, Math.ceil(amount), capacity);
        return s;
    }

    @Override
    public double milk() {
        if (amount > 0) {
            double milk = amount;
            amount = 0.0;
            return milk;
        }
        return amount;
    }

    @Override
    public void liveHour() {
        double min = 0.7;
        double max = 2.0;
        double diff = max - min;
        if (amount <= capacity) {
            amount += min + Math.random() * diff;
        } if(amount>capacity){
            amount=capacity;
        }
    }

}
