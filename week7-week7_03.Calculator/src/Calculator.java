/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christopher
 */
public class Calculator {

    private Reader reader;
    private int operations;

    public Calculator() {
        reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                operations++;
            } else if (command.equals("difference")) {
                difference();
                operations++;
            } else if (command.equals("product")) {
                product();
                operations++;
            }
        }

        statistics();
    }

    private void sum() {

        /*  System.out.print("value1: ");
        int value1 = reader.readInteger();

        System.out.print("value2: ");
        int value2 = reader.readInteger();*/
        int[] input = input();
        int value1 = input[0];
        int value2 = input[1];
        System.out.println("sum of the values " + (value1 + value2));

    }

    private void difference() {
        /* System.out.print("value1: ");
        int value1 = reader.readInteger();

        System.out.print("value2: ");
        int value2 = reader.readInteger();*/
        int[] input = input();
        int value1 = input[0];
        int value2 = input[1];
        System.out.println("difference of the values" + (value1 - value2));
    }

    private void product() {
        /*    System.out.print("value1: ");
        int value1 = reader.readInteger();

        System.out.print("value2: ");
        int value2 = reader.readInteger();*/

        int[] input = input();
        int value1 = input[0];
        int value2 = input[1];
        System.out.println("product of the values" + (value1 * value2));
    }

    private void statistics() {
        System.out.println("Calculations done " + operations);
    }

    public int[] input() {
        int[] test = new int[2];
        System.out.print("value1: ");
        test[0] = reader.readInteger();

        System.out.print("value2: ");
        test[1] = reader.readInteger();
        return test;
    }
}
