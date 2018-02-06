
import java.util.HashMap;
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
public class ShoppingBasket {

    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        this.purchases = new HashMap<String, Purchase>();
        //this.products = new Purchase();

    }

    public void add(String product, int price) {

        if (purchases.containsKey(product)) {
            purchases.get(product).increaseAmount();

            return;
        }

        purchases.put(product, new Purchase(product, 1, price));
    }

    public int price() {
        int total = 0;
        for (Purchase item : purchases.values()) {
            total += item.price();
        }
        return total;
    }

    public void print() {
        for (Purchase item : purchases.values()) {
            System.out.println(item.toString());
        }
    }

}
