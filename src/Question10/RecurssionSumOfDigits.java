/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author S542040
 */
public class RecurssionSumOfDigits {
     static int sum=0;
    /**
     * @param args the command line arguments
     */
    
    public static int sumOfDigits(int num)
    {
        return sum = num% 10 + sumOfDigits(num / 10);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 10 by Rahul Dasari");
        System.out.println("Enter a number ");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumOfDigits(num));
    }
    
}
