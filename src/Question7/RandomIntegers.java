/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author S542040
 */
public class RandomIntegers {

    /**
     * @param args the command line arguments
     */
public static void randomValue(int number){
        int array[] = new int[100];
        Random rd = new Random();
        for(int i=0;i<100;i++)
        {
            array[i]=(int)Math.floor(rd.nextInt());
        } 
        if(number>-1 && number<100)
        {
            System.out.print("The value at the position "+number+" is ");
            System.out.println(array[number]);
            
        }
        else
        {
            System.out.println("Out Of Bounds");
        }
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 7 by Rahul Dasari");
        System.out.println("Enter the index to display the element in the array :- ");
        randomValue(sc.nextInt());
    }
    
}
