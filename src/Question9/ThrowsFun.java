/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9;

/**
 *
 * @author S542040
 */
public class ThrowsFun {

    public int donateOney(int money) throws ArithmeticException {
        return 10000 / money;
    }
/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 9 by Rahul Dasari");
         try{
            ThrowsFun td=new ThrowsFun();
        
        int amount=110;
//        int amount=1;
        if(amount>10){
            throw new IllegalArgumentException("Money cannot be greater than 110");
        }else{
            System.out.println(td.donateOney(0));
        }
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        catch(RuntimeException ae){
            System.out.println(ae.getMessage());
        }
    }
    
}

