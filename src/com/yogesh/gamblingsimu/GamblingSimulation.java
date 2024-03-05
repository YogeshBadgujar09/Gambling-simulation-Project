package com.yogesh.gamblingsimu;

import java.util.Random;

public class GamblingSimulation {
		
	private static final int EVERY_DAY_STACK = 100 ;
	private static final int PER_GAME_STACK = 1 ;
	
	public static void gameStatus()
	{
		System.out.println("Every Day Stack :" + EVERY_DAY_STACK );
		System.out.println("Stack Per Game :" + PER_GAME_STACK );
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Gambling Simulating Project");
		
		gameStatus();
		
}
	
}

