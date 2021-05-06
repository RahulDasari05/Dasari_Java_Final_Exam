/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author S542040
 */
public class CheckingIOException {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException,IOException {
        // TODO code application logic here
        System.out.println("Question 8 by Rahul Dasari");
        try {
            Scanner scan = new Scanner(new File("tempFile.txt"));

        } catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        }
        try{
        Scanner scan1 = new Scanner(System.in);
        int nmbr = scan1.nextInt();
        System.out.println(nmbr/0);
        }catch(ArithmeticException ae){
            System.out.println(""+ae);
        }
    }

}