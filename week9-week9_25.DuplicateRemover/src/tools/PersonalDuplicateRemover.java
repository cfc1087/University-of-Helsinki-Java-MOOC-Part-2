/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Christopher
 */
public class PersonalDuplicateRemover implements DuplicateRemover {

    private int duplicates;
    private ArrayList<String> list = new ArrayList<String>();

    @Override
    public void add(String characterString) {
        if (!list.contains(characterString)) {
            this.list.add(characterString);
        } else {
            this.duplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        Set<String> unique = new HashSet<String>();
        if (this.list.isEmpty()) {
            return unique;
        } else {
            for (String s : list) {
                unique.add(s);
            }
            return unique;
        }
    }

    @Override
    public void empty() {
        this.list.clear();
        this.duplicates = 0;

    }

}
