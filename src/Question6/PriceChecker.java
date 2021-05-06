/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author S542040
 */
public class PriceChecker {
    
    public int checkPrice(int price){
        if(price>500){
            throw new IllegalArgumentException("Price cannot be greater than 500");
        }else{
            return price*(101/100);
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 6 by Rahul Dasari");
        System.out.println("Checked Exceptions");
        PriceChecker pc=new PriceChecker();
        System.out.println("Price after discount "+ pc.checkPrice(100));
        
        try{
            System.out.println(pc.checkPrice(1000));
        }
        catch(IllegalArgumentException ie){
            System.out.println(ie.getMessage());
        }
    }
    
}
