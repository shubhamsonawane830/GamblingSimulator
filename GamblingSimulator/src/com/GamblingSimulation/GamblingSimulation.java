package com.GamblingSimulation;

import java.util.Random;

public class GamblingSimulation {
	
	public static final int STAKE = 100;
	public static final int BET = 1;
	public static final float STAKE_VALUE = 0.5f;
	public static int stake=100;
	public int loosingAmount;
	public int winningAmount;
	public int totalAmountEarned = 0;
	public int LostDays=0,WonDays=0;
	
	public int winOrLoss() {
		Random random = new Random();
		int value = random.nextInt(2);
		if(value == 1) {
			stake++;
		}else {
			stake--;
		}
		return stake;
	  }
	
	public Integer resignStake(int day) {
		loosingAmount = (int)Math.round(STAKE * STAKE_VALUE);
		winningAmount = (int)Math.round(STAKE + (STAKE * STAKE_VALUE));
		boolean stop = true;
		stake = STAKE;
		while(stop == true) {
			winOrLoss();
			if(stake == loosingAmount) {
				LostDays++;
				stop = false;
			}
			if(stake == winningAmount){
				WonDays++;
				stop = false;
			}
		}
		return stake;
	  }
	
	public int getTotalAmountWonOrLoss(){
        int day_stake=0;
        for(int day=1;day<=20;day++) {
            day_stake=resignStake(day);
            System.out.println("Day: "+day+" amount: "+day_stake);
            totalAmountEarned=totalAmountEarned+day_stake;
        }
        System.out.println("Total Amount Earned or Loss by Gambler at End of given period:- " + totalAmountEarned);
        return totalAmountEarned;
       }
	
	public int calculateForMonth() {
        getTotalAmountWonOrLoss();
        System.out.println("Days Won in  month:"+WonDays);
        System.out.println("Days Loss in  month:"+LostDays);
        return totalAmountEarned;
    }
	
	public static void main(String[] args) {
		System.out.println("*WELCOME TO GAMBLING SIMULATION PROBLEM*");
		GamblingSimulation gambling = new GamblingSimulation();
		gambling.calculateForMonth();
	}
}
