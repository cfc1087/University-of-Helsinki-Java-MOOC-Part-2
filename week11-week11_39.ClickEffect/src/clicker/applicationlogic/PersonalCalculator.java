/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.applicationlogic;

/**
 *
 * @author Christopher
 */
public class PersonalCalculator implements Calculator {

    private int value;

    public PersonalCalculator() {
        this.value = 0;
    }

    @Override
    public int giveValue() {
        if (value == 0) {
            return 0;
        }
        return value;

    }

    @Override
    public void increase() {
        value++;
    }

}
