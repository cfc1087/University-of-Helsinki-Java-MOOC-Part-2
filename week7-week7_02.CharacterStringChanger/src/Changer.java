
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Christopher
 */
public class Changer {

    private ArrayList<Change> changes;

    public Changer() {
        changes = new ArrayList<Change>();
    }

    public void addChange(Change change) {
        changes.add(change);
    }

    public String change(String characterString) {
        for (Change chan:changes ) {
            characterString =chan.change(characterString);
        }
        return characterString;
    }

}
