// Roulette Simulation By David Chase Brewster. simulates a 100 spin roulette session 1000 times.
import java.util.*;
public class Roulette{
	public static void main (String args []){
		//Initializing counters
		int moneyTotal = 0;
		int totalLost = 0;
		int totalBreak = 0;
		//loop repeats the session 1000 times
		for (int i = 0;i <1000; i++){
			Random rand = new Random();
			//picks random number as bet
			int betNum= rand.nextInt(38);
			int countLost = 0;
			int countWin = 0 ;
			for(int j = 0;j<100;j++){
				//picks another random int as the "spin" pprogram then marks if they are equal or not
				int spinNum = rand.nextInt(38);
				if (spinNum == betNum) {
						countWin ++ ;
				}
				else {
					countLost ++;
				}
			}
			//calculates winnings and total wins
			moneyTotal += countWin*36;
			if(countLost == 100){
					totalLost ++;
			}
			else if (countWin > 2) {
				totalBreak ++;
			}
			
		}
		System.out.println("the total winnings are $"+moneyTotal+". you break even "+totalBreak+" times and lose everything "+totalLost+" times.");
	}
}	
