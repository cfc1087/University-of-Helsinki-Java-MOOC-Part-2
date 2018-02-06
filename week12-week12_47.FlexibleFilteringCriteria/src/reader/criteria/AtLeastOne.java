/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christopher
 */
public class AtLeastOne implements Criterion {

    private List<Criterion> criterionList;

    public AtLeastOne(Criterion... c) {
        this.criterionList = new ArrayList<Criterion>();
        for (Criterion parameter : c) {
            this.criterionList.add(parameter);
        }
    }

    @Override
    public boolean complies(String line) {
        for (Criterion c : criterionList) {
            if (c.complies(line)) {
                return true;
            }
        }
        return false;
    }

}
