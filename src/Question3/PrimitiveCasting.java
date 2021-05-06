/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author S542040
 */
public class PrimitiveCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int a = 10;
        double high = 124.20;

//      Up casting or Widening
        double z = a;
        long x = a;
        System.out.println("Up Casting x: "+ x);
//      Down casting or narrow casting
        int b = (int) high;
        long c = (int) high;
        System.out.println("Down Casting a: " + a);
        System.out.println("Down Casting b: " + b);
    }

}

