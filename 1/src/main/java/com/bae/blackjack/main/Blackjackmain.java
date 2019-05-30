package com.bae.blackjack.main;

public class Blackjackmain {

	public static void main(String[] args) {

	}

	public int play(int player, int dealer) {
		if (dealer == 31 || dealer == 1) {
			return -1;
		}
		if (player == 31 || player == 1) {
			return -1;
		}
		if ((dealer < 31 && player < 31) && (dealer > 3 & player > 3)) {
			if (dealer < 16) {
				int card=twist();
				if (card == 1 || card == 11) {
					card= dealerchoice(dealer);
				}
				return (dealer + card);
			
			}
           if (dealer > 21 && player > 21) {
				return 0;}
           
			if ((dealer > player && dealer <22)|| (player>21 && dealer<22)) {
				return dealer;
				
			}
			if ((player > dealer && player <22)|| (dealer>21 && player<22)) {
				return player;
			}

			return player;
		
		}	
		return 0;

		
		}
		
//		 static public void assertTrue(String message, boolean condition) {
//		        if (!condition) {
//		            fail(message);
	


	public int twist() {
		return ((int) (Math.random() * 11) + 1);
	}
		
	public int dealerchoice(int dealer){
		 if (dealer<11) {
			return 11;
			
		 }
		 else return 1;
		}
}

