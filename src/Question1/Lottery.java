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
public abstract class Lottery {

    private int lotteryNumber;
    private double lotteryAmount;
    private double lotteryTax;

    public Lottery(int lotteryNumber, double lotteryAmount, double lotteryTax) {
        this.lotteryNumber = lotteryNumber;
        this.lotteryAmount = lotteryAmount;
        this.lotteryTax = lotteryTax;
    }

    public int getLotteryNumber() {
        return lotteryNumber;
    }

    public double getLotteryAmount() {
        return lotteryAmount;
    }

    public double getLotteryTax() {
        return lotteryTax;
    }

    public void setLotteryTax(double lotteryTax) {
        this.lotteryTax = lotteryTax;
    }

// Abstract method
    public abstract double calculateLotteryTax();

    @Override
    public String toString() {
        return "LotteryNumber: " + lotteryNumber
                + "\nLotteryAmount=" + lotteryAmount
                + "\nLotteryTax=" + lotteryTax + "\n*************************";
    }

}

