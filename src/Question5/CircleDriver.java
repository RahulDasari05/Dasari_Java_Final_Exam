/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author S542040
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Question 5 by Rahul Dasari");
        System.out.println("***************************************");
        //ComparableCircle circle1 = new ComparableCircle(12.5);
        //ComparableCircle circle2 = new ComparableCircle(11.4);
        ComparableCircle circle1 = new ComparableCircle(7.4);
        ComparableCircle circle2 = new ComparableCircle(7.4);
        
        System.out.println("Area of first circle is "+circle1.area());
        System.out.println("***************************************");
        System.out.println("Area of second circle is "+circle2.area());
        System.out.println("***************************************");
        if (circle1.compareTo(circle2) > 0) 
        {
            System.out.println("Area of first circle is larger.");
            System.out.println("***************************************");
        } 
        else if (circle1.compareTo(circle2) < 0)
        {
            System.out.println("Area of second circle is larger");
            System.out.println("***************************************");
        }
        else
        {
            System.out.println("Area of ​​the two circles are same");
            System.out.println("***************************************");
        }
    }

}