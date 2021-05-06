/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author S542040
 */
public class VehicleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 11 by Rahul Dasari");
        
        Vehicle v1 = new Vehicle(54445,"Pontiac");
        Vehicle v2 = new Vehicle(54445,"Pontiac");
        Vehicle v3 = new Vehicle(1929485,"Toyota");
        System.out.println("********************************");
        System.out.println("HASH CODE");
        System.out.println("********************************");
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
       System.out.println(v3.hashCode()+" This have a Different value");
       System.out.println("********************************");
        System.out.println("Equals");
        System.out.println("********************************");
        System.out.println(v2.equals(v3));
        System.out.println(v3.equals(v1));
        System.out.println(v1.equals(v2));
        System.out.println(v2.equals(v2));
        
    }
    
}
