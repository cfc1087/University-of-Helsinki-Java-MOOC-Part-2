
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Christopher
 */
public class Storehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    public Storehouse() {
        this.products = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stocks.put(product, stock);
        

    }

    public int price(String product) {
        if (products.containsKey(product)) {
            return products.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        }
        this.stocks.put(product, 0);
        return this.stocks.get(product);
    }

    public boolean take(String product) {
        if (stocks.containsKey(product) && stocks.get(product) > 0) {
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }
        stocks.put(product, 0);
        return false;
    }

    public Set<String> products() {
        Set<String> names = this.stocks.keySet();
        return names;
    }

}
