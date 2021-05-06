/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author S542040
 */
public class LotteryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LotteryPrime lotPrime = new LotteryPrime(102, 5000);
        LotteryGeneral lotGen = new LotteryGeneral(897, 600);    
        Lottery lot = new LotteryPrime(657, 10000);
        
        System.out.println("Question 1 by Rahul Dasari");
        
        lotPrime.setLotteryTax(lotPrime.calculateLotteryTax());
        lotGen.setLotteryTax(lotGen.calculateLotteryTax());
        lot.setLotteryTax(lot.calculateLotteryTax());

        System.out.println(lotPrime);
        System.out.println(lotGen);
        System.out.println(lot);

    }

}

