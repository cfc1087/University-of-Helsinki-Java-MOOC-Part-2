
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
public class Information {

    private ArrayList<String> numbers = new ArrayList<String>();
    ;
    private Address address;

    public void addNumber(String number) {
        this.numbers.add(number);
    }

    public void addAddress(String street, String city) {
        this.address = new Address(street, city);
    }

    public ArrayList<String> getNumbers() {
        return this.numbers;
    }

    public Address getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        String a = "";
        if (this.address == null) {
            a = "address unknown\n";

        } else {
            a = this.address.toString();
        }
        String s = "";
        if (!this.numbers.isEmpty()) {

            for (String num : this.numbers) {
                s += num + "\n";
            }
            a += "phonen numbers:\n" + s;
            return a;
        } else {
            s = "phone number not found";
            a += s;
            return a;
        }
    }

}
