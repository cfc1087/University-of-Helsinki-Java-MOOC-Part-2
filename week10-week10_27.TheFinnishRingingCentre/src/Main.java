/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christopher
 */
public class Main {

    public static void main(String[] args) {

        RingingCentre rt = new RingingCentre();
        rt.observe(new Bird("Nebelkrähe", "Corvus corone cornix", 2000), "Berlin");
        rt.observe(new Bird("Harmaalokki", "Larus argentatus", 2012), "Kumpula");
        rt.observations(new Bird("Harmaalokki", "Larus argentatus", 2012));

    }
}
