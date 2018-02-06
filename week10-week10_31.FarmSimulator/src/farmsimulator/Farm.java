/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Christopher
 */
public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private Collection<Cow> cows = new ArrayList<Cow>();

    public Farm() {

    }

    public void addCow(Cow cow) {
        cows.add(cow);

    }

    public Farm(String owner, Barn barn) {
        this.barn = barn;
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public void manageCows() {
        if (cows.isEmpty()) {
            System.out.println("No cows.");
        }
        barn.takeCareOf(cows);
    }
    public void installMilkingRobot(MilkingRobot milkingRobot){
        barn.installMilkingRobot(milkingRobot);
    }

    public String getCows() {
        if (cows.isEmpty()) {
            return "No cows.";
        }
        String a = "";
        for (Cow c : cows) {
            a+=c.toString()+"\n";
        }
        String s = String.format("Animals:\n%8s", a);
        return s;
    }

    @Override
    public String toString() {
     String a="";
        
        for (Cow c : cows) {
            a+=c.toString()+"\n        ";
        }
        String s = String.format("Farm owner: %s\nBarn bulk tank: %s\nAnimals: \n        %s\n", owner, barn.toString(), a);
        return s;
    }

    @Override
    public void liveHour() {
        for (Cow c : cows) {
            c.liveHour();
        }
    }

}
