
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Christopher
 */
public class phoneBook {

    private HashMap<String, Information> book;

    public phoneBook() {
        this.book = new HashMap<>();
    }

    public void addNumber(String name, String number) {
        if (!this.book.containsKey(name)) {
            Information i = new Information();
            i.addNumber(number);
            this.book.put(name, i);

        } else {
            this.book.get(name).addNumber(number);
        }
    }

    public void addAddress(String name, String street, String city) {
        if (!this.book.containsKey(name)) {
            Information i = new Information();
            i.addAddress(street, city);
            this.book.put(name, i);
            return;
        } else {
            this.book.get(name).addAddress(street, city);
        }

    }

    //search for a number
    public void searchByName(String name) {
        if (!this.book.containsKey(name)) {
            System.out.println("not found");
            return;
        } else {
            for (String number : this.book.get(name).getNumbers()) {
                System.out.println(number);
            }

        }
    }
//search for a person by phone number

    public void searchByNumber(String number) {

        for (String name : this.book.keySet()) {
            if (this.book.get(name).getNumbers().contains(number)) {
                System.out.println(name);
                return;
            }

        }
        System.out.println("not found");

    }

    public void searchInformation(String name) {
        if (!this.book.containsKey(name)) {
            System.out.println("not found");

        } else {

            System.out.print(this.book.get(name).toString());
        }
    }

    public void deleteInformation(String name) {
        if (book.containsKey(name)) {
            book.remove(name);
            return;
        }
        System.out.println("not found");
    }

    public void filteredSearch(String keyword) {
        ArrayList<String> names = new ArrayList<String>();

        for (String name : this.book.keySet()) {
            if (name.contains(keyword)) {
                names.add(name);

            } else if (this.book.get(name).toString().contains(keyword)) {
                names.add(name);

            }
        }
        if (names.isEmpty()) {
            System.out.println("not found");
            return;
        }
        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
            searchInformation(name);
        }

    }
}
