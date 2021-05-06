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
public class Palindrome {

 

    /**
     * @param args the command line arguments
     */

 

    public static int palindrome(int num,int temp)
    {
        if (num == 0)
        return temp;

 

    temp = (temp * 10) + (num % 10);
 
    return palindrome(num / 10, temp);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 10 by Rahul Dasari");
        System.out.print("Enter a number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    int temp = palindrome(n, 0);
     
    if (temp == n)
        System.out.println(n+" is a palindorme number");
    else
        System.out.println(n+" is not a palindrome number" );
    }
    
}