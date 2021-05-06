/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

import java.util.Scanner;

/**
 *
 * @author S542040
 */
public class Accessories {

    private String model;
    private int weight;

    public Accessories(String model) {
        this.model = model;
    }

    public void setGrams(int grams) {
        if (grams <= 0) {
            throw new ArithmeticException("Weight cannot be less than or equal to"
                    + "zero");
        }
        this.weight=weight;
    }

           
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Question 8 by Rahul Dasari");
        System.out.print("Enter Accesory name:");
        String model = scan.next();
        Accessories a = new Accessories(model);
        System.out.println("Enter Accessroy Weight: ");
        int weight = scan.nextInt();
        a.setGrams(weight);
    }

}