/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author S542040
 */
public class WatchDriver {

    private String name;
    private int price;

    public WatchDriver(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
        if (price <= 0) {
            throw new IllegalArgumentException("their is no Watch with price"
                    + " less than 0");
        }
        this.price = price;

    }

    @Override
    public String toString() {
        return "Watch" + " " + "name=" + name + ", price=" + price;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 9 by Rahul Dasari");
        WatchDriver m1 = new WatchDriver("Iphone");
        WatchDriver m2 = new WatchDriver("Samsung");
        m1.setPrice(5000);
        System.out.println(m1);
        m2.setPrice(0);
    }

}

