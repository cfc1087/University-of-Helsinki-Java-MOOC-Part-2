/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Christopher
 */
public class MaxWeightBox extends Box {

    private int maxWeight;
    private Collection<Thing> things = new ArrayList<Thing>();

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        
    }

    @Override
    public void add(Thing thing) {
        int current =0;
        for(Thing t:things){
            current+=t.getWeight();
        }
        if (thing.getWeight() + current <= maxWeight) {
            
            things.add(thing);

        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }

}
