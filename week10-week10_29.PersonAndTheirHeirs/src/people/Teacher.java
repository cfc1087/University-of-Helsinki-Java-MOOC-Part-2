/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Christopher
 */
public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address,int salary) {
        super(name, address);
        this.salary = salary;
    }
    @Override
    public String toString(){
        String a = super.toString();
        String b = a+String.format("\n  salary %d euros/month",this.salary);
        return b;
    }
    
}
