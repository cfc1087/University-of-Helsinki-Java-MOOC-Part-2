
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Christopher
 */
public class RingingCentre {

    private Map<Bird, List<String>> places;

    public RingingCentre() {
        places = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {

        if (!places.containsKey(bird)) {
            List<String> list = new ArrayList<String>();
            list.add(place);
            places.put(bird, list);

        } else if (places.containsKey(bird)) {
            for (Bird item : places.keySet()) {
                if (item.equals(bird)) {
                    places.get(bird).add(place);
                }
            }
        }

    }

    public void observations(Bird bird) {
        if (!places.containsKey(bird)) {
            List<String> list = new ArrayList<String>();
            places.put(bird, list);
            System.out.println(bird + " observations: " + places.get(bird).size());
        } else if (places.containsKey(bird)) {
            for (Bird item : places.keySet()) {
                if (item.equals(bird)) {
                    System.out.println(item + " observations: " + places.get(item).size());
                    for(String s:places.get(item)){
                        System.out.println(s);
                    }
                }
            }
        }

    }

}
