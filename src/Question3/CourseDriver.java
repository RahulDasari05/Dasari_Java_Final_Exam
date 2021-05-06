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
public class CourseDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 3 by Rahul Dasari");
        System.out.println("**************************************");
//        Up casting or widening
        Course course = new Java("4431 course", 6);
        System.out.println("Up Casting");
        System.out.println("**************************************");
        Java java = new Java("54372", 5);
//      Up casting or Wideneing
        Course course1 = java;
        System.out.println(course1);
//      Down casting or narrowing
        System.out.println("**************************************");
        System.out.println("Down Casting ");
        System.out.println("**************************************");
        Java java1 = (Java) course1;
        System.out.println(java1);

    }

}
