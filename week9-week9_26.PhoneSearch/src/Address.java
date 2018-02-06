/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christopher
 */
public class Address {

    private String street = "";
    private String city = "";

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        String address = "";
        address = String.format("address: %s %s\n", this.street, this.city);
        return address;

    }

}
