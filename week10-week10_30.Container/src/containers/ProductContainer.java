/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Christopher
 */
public class ProductContainer extends Container {

    private String productName;
    
    public ProductContainer(double capacity) {
        super(capacity);
    }

    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public void setName(String newName) {
        this.productName = newName;
    }

    public String getName() {
        return this.productName;
    }

    @Override
    public String toString() {
        String s = String.format("%s: volume = %.1f, free space %.1f", getName(), super.getVolume(), super.getCurrentCapacity());
        return s;
    }

}
