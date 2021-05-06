/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author S542040
 */
public class BiscuitDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("Question 6 by Rahul Dasari");
        System.out.println("Checking for file biscuit.txt");
        Scanner scanner = new Scanner(new File("biscuit.txt"));
    }

}
