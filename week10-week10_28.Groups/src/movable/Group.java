/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christopher
 */
public class Group implements Movable {

    private List<Organism> list = new ArrayList<Organism>();

    public String toString() {
        String s = "";
        for (Organism o : list) {
            s += o.toString()+"\n";
        }
        return s;
    }

    public void addToGroup(Movable movable) {
        list.add((Organism) movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Organism o : list) {
            o.move(dx, dy);
        }
    }

}
