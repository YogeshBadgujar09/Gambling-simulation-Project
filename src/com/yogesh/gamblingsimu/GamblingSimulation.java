package com.yogesh.gamblingsimu;

import java.util.Random;

public class GamblingSimulation {
		
	private static final int EVERY_DAY_STACK = 100 ;
	private static final int PER_GAME_STACK = 1 ;
	
	private static final int LOOSE = 0;
	private static final int WIN = 1 ;
	private static final int MONTHLY_DAYS = 20 ;
	private static int[] perDay_Winning_Amount = new int[20] ;
	private static int[] perDay_Loosing_Amount = new int[20] ;
	 
	
	public static void gameStatus()
	{
		System.out.println("Every Day Stack :" + EVERY_DAY_STACK );
		System.out.println("Stack Per Game :" + PER_GAME_STACK );	
		
	}
	 
		public static void gamePlay(){
			
			for(int i = 0 ; i < MONTHLY_DAYS ; i++ ) {
				
				System.out.println("Day :" + (i+1));
				gameStatus();
				
				int winStack = 0;
				int looseStack = 0;
		
					while(true) {

						Random random =  new Random();
						int make_bet = random.nextInt(9)%2;
					
						if(make_bet == LOOSE){
							 looseStack += 1 ; 
						}
						else{
							winStack += 1;
						}
						if(winStack == 50) {
							break ;
						}
						if(looseStack == 50) {
							break ;
						}
					
					
				}
					perDay_Winning_Amount[i] = winStack ;
					perDay_Loosing_Amount[i] = looseStack ;
					System.out.println("Win stack :" + winStack);
					System.out.println("Loose stack :" + looseStack);
					System.out.println("----------------------------------");
			}
		  
		}
		
		 
			
	public static void main(String[] args) {
		
		System.out.println("Welcome to Gambling Simulating Project");
		gamePlay();
	 
	}
	
}

