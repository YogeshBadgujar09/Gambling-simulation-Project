package com.yogesh.gamblingsimu;

import java.util.Random;
import java.util.Scanner;

public class GamblingSimulation {
		
	private static final int EVERY_DAY_STACK = 100 ;
	private static final int PER_GAME_STACK = 1 ;
	private static final int LOOSE = 0;
	private static final int WIN = 1 ;
	private static final int MONTHLY_DAYS = 20 ;
	
	
	private static int[] perDay_Winning_Amount = new int[20] ;
	private static int[] perDay_Loosing_Amount = new int[20] ;
	private static int winningDays_InMonth = 0 ;
	private static int loosingDays_InMonth = 0 ;
	private static int WinStatus[] = new int[ MONTHLY_DAYS ];
	
	public static void gameStatus()
	{
		System.out.println("Every Day Stack :" + EVERY_DAY_STACK );
		System.out.println("Stack Per Game :" + PER_GAME_STACK );	
	}
	 
	public static void gamePlay(){
			int playForNextMonth ;
		do {
			
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
								winningDays_InMonth ++;
								break ;
							}
							if(looseStack == 50) {
								loosingDays_InMonth ++ ;
								break ;
							}
					}
					perDay_Winning_Amount[i] = winStack ;
					perDay_Loosing_Amount[i] = looseStack ;
					System.out.println("Win stack :" + winStack);
					System.out.println("Loose stack :" + looseStack);
						
					System.out.println("----------------------------------");
				}
			
				System.out.println("Winning Days in Month :" + winningDays_InMonth);
				System.out.println("Loosing Days in Month :" + loosingDays_InMonth); 
				
				int luckist_day = WinStatus[0] ;
				int unluckist_day = WinStatus[0] ;
				
				for ( int i=0 ; i<  MONTHLY_DAYS ;i++) {				
					WinStatus[i] = perDay_Winning_Amount[i] - perDay_Loosing_Amount[i] ;
					//System.out.println("Winning Status of Day "+(i+1) + " :\t" + WinStatus[i]);
					if(WinStatus[i] > luckist_day)
					{
						luckist_day = WinStatus[i] ; 
					}
					if(WinStatus[i] < unluckist_day)
					{
						unluckist_day = WinStatus[i] ; 
					}
				}
				System.out.println("Luckiest Day Winning  : " + luckist_day);
				System.out.println("Unuckiest Day Winning : " + unluckist_day);
				System.out.println("...............................................\n..................................................");
				System.out.print("Enter a Number to > 0 to play next Month :");
				Scanner scanner = new Scanner(System.in);
				playForNextMonth = scanner.nextInt();
				
		}
		while(playForNextMonth > 0);

	}
		
		 
			
	public static void main(String[] args) {
		
		System.out.println("Welcome to Gambling Simulating Project");
			gamePlay();
		
	}
	
}

