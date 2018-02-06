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
public class ProductContainerRecorder extends ProductContainer {

   
    private ContainerHistory ch;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        ch = new ContainerHistory();
        ch.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }

    public String history() {
        return ch.toString();
    }
    @Override
    public void addToTheContainer(double amount){
       super.addToTheContainer(amount);
       ch.add(getVolume());
    }
    @Override
    public double takeFromTheContainer(double amount){
        
        double d = super.takeFromTheContainer(amount);
        ch.add(getVolume());
        return d;
    }
    public void printAnalysis(){
        System.out.println("Product: "+this.getName());
        System.out.println("History: "+ch.toString());
        System.out.println("Greatest product amount: "+ch.maxValue());
        System.out.println("Smallest product amount: "+ch.minValue());
        System.out.println("Average: "+ch.average());
        System.out.println("Greatest change: "+ ch.greatestFluctuation());
        System.out.println("Variance: "+ch.variance());
    }
}
