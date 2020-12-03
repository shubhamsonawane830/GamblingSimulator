package com.GamblingSimulation;

import java.util.Random;

public class GamblingSimulation {
	
	public static final int bet =0;
	public static final int stake=0;
	public  int stake=0;
	
	public int winOrLoss() {
		Random random = new Random();
		int value = random.nextInt(2);
		if(value == 1) {
			System.out.println("*GAMBLER WON*");
			stake++;
		}else {
			System.out.println("*GAMBLER LOST*");
			stake--;
		}
		return stake;
	}
	public static void main(String [] args)
	{
		System.out.println("*Welcome to Gambling Simulation Problem");
		GamblingSimulation gambling = new GamblingSimulation();
		System.out.println("Remaining Stake: "+gambling.winOrLoss());
	}

}
