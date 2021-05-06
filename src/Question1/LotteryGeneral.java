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
public class LotteryGeneral extends Lottery {

    public LotteryGeneral(int lotteryNumber, double lotteryAmount) {
        super(lotteryNumber, lotteryAmount, 20);
    }

    @Override
    public double calculateLotteryTax() {
        return Math.round(super.getLotteryAmount() * super.getLotteryTax())
                / 100.0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}

