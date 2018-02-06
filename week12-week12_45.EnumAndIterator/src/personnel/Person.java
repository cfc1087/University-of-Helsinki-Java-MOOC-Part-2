/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

/**
 *
 * @author Christopher
 */
public class Person {

    private String name;
    private Education title;

    public Person(String name, Education title) {
        this.name = name;
        this.title = title;
    }

    public Education getEducation() {
        return this.title;
    }

    @Override
    public String toString() {
        String s = String.format("%s, %s", name, getEducation());
        return s;
    }

}
