/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;

/**
 *
 * @author Christopher
 */
public class ContainerHistory {

    private ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.history.add(situation);
    }

    public void reset() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double max = this.history.get(0);
        for (double d : this.history) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double min = this.history.get(0);
        for (double d : this.history) {
            if (d <= min) {
                min = d;
            }
        }
        return min;

    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }

        double sum = 0.0;
        for (double d : this.history) {
            sum += d;
        }
        double average = sum / this.history.size();
        return average;

    }

    public double greatestFluctuation() {
        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0;
        }
        double max = 0.0;
        for (int i=0;i<this.history.size();i++) {
            if(i+1==this.history.size()){
                return max;
            }
            double dif = Math.abs(this.history.get(i)-(this.history.get(i+1)));
            if (dif > max) {
                max = dif;
            }
        }
        return max;

    }

    public double variance() {
        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0;
        }
        double avg = average();
        double var = 0.0;
        for (double d : this.history) {
            var += Math.pow((d - avg), 2);
        }
        var = var / ((this.history.size() - 1));
        return var;

    }

    @Override
    public String toString() {
        return this.history.toString();
    }

}
