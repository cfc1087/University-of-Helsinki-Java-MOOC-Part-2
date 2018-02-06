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
public class OneThingBox extends Box {

  private Collection< Thing> thing = new ArrayList<Thing>();

    public OneThingBox() {

    }

    @Override
    public void add(Thing thing) {
        if (this.thing.size() == 1) {
            return;
        }
        this.thing.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.thing.contains(thing);
    }
}
