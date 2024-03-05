package com.yogesh.gamblingsimu;

import java.util.Random;

public class GamblingSimulation {
		
	private static final int EVERY_DAY_STACK = 100 ;
	private static final int PER_GAME_STACK = 1 ;
	
	private static final int LOOSE = 0;
	private static final int WIN = 1 ;
	
	private static int winStack = 0;
	private static int looseStack = 0;
 

	
	public static void gameStatus()
	{
		System.out.println("Every Day Stack :" + EVERY_DAY_STACK );
		System.out.println("Stack Per Game :" + PER_GAME_STACK );
		System.out.println("Win stack :" + winStack);
		System.out.println("Loose stack :" + looseStack);
		
		System.out.println("----------------------------------");
	}
	
	public static void gamePlay()
	{
		Random random =  new Random();
		int make_bet = random.nextInt(9)%2;
		
		if(make_bet == LOOSE)
		{
			System.out.println("Loose");
			looseStack += 1 ; 
		}
		else
		{
			System.out.println("Win");
			winStack += 1;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Gambling Simulating Project");
		gameStatus();
		gamePlay();
		gameStatus();
		
}
	
}

