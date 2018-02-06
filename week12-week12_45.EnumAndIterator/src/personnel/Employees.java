/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;

/**
 *
 * @author Christopher
 */
public class Employees {

    ArrayList<Person> list;

    public Employees() {
        this.list = new ArrayList<Person>();
    }

    public void add(Person person) {
        list.add(person);
    }

    public void add(List<Person> person) {
        for (Person p : person) {
            list.add(p);
        }
    }

    public void print() {
        for (Person p : list) {
            System.out.println(p.toString());
        }
    }

    public void print(Education education) {
        
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person nextPerson =  iterator.next();
            if (nextPerson.getEducation() == education) {
                
                System.out.println(nextPerson.toString());

            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
