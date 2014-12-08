import java.util.*;
 public class PokerHands {
	Scanner console =new Scanner(System.in);
	int [] hand = new int[5];
	for (int i = 0; i<5; i++){
		int card =0;
		boolean vaild = true;
		do {
			System.out.println("Enter the suit: 'c', 'd', 'h', or 's'-  ");	
			char	userSuit = console.next().charAt(0);
				switch (userSuit){
				case 's': card += 13;
				case 'h': card += 13;
				case 'd': card += 13;
				case 'c': vaild = true; break; 
				default: System.out.println("not a vaild choice"); vaild = false;
					break;
			}
		} while (vaild = false);
		do{
			System.out.println("Enter the card value:'a', 'k', 'q', 'j', '10', ...'2'- ");
			char	userNum = console.next().charAt(0);
				switch(userNum){
				case '2': card +=1;
				case '3': card +=1;
				case '4': card +=1;
				case '5': card +=1;
				case '6': card +=1;
				case '7': card +=1;
				case '8': card +=1;
				case '9': card +=1;
				case '10': card +=1;
				case 'j': card +=1;
				case 'q': card +=1;
				case 'k': card +=1;	
				case 'a': vaild = true; break; 
				default: System.out.println("not a vaild choice"); vaild = false;
					break;
				}
			} while (vaild = false);
		hand[i]= card;
	}
	
	int count1 [] = new int[13];
	int count2 [] =new int [6];
	
	for (int i = 0; i<6; i++){
			int rank=hand[i];
			int newRank = rank%13;
			count1[newRank] +=1;
	}
	for(int j=0; j<13; j++){
		int suit = count1[i]
		count2[suit] +=1;
	}
	boolean flag1 = false;
	boolean flag2 = true;
	if (count2[5]==1){System.out.print("Flush "); boolean flagDump=straightCheck(count1,count2);}
	if(count2[4]==1){System.out.println("Four of a kind");}
	if(count2[2]==1 && count2[3]==1){System.out.println("Full House");}
	else if(count2[3]==1 && count2[2] != 1){System.out.println("Three of a Kind")}
	int pairCount = count2[2];
	switch(pairCount){
		case 
	}
	int zeroCount = count2[0];
	switch(zeroCount){
		case 8: int z;
			boolean stC = straightCheck(count1,count2);
			if(stC == false) {System.out.println("High Card");}
			break;
		case 0; 
	}
	public static boolean straightCheck (count1[], count2[]){
				if (count2[1] == 5){
				for(z=0; z<13; z++){
					int w=count1[z];
					if(w==1){
						flag1 = true; break;
					}
				}
				for(int h=z; h<z+5;h++){
					if(count1[h] == 0){
						flag2 = false;
					}
				}
			}
			if(flag2 == true){System.out.println("Straight");}
			return flag2;
	}
	showOneHand(hand);
	 public static void showOneHand(int hand[]){
		String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",   "Spades:   "};
		String face[]={
		   "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
		"4 ","3 ","2 "};
		String out="";
		for(int s=0;s<4;s++){
		out+=suit[s];
		for(int rank=0;rank<13;rank++){
			for(int card=0;card<5;card++){
			if(hand[card]/13==s && hand[card]%13==rank)
			out+=face[rank];} 
		out+='\n';}
		}
		System.out.println(out);
	  }
  }
