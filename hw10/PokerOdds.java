import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }

public static void showHands(){
	userChoice = Y;
	do{
	Scanner console = new Scanner(System.in);
	String [] ref = {"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
	String cString ="Clubs: ";
	String dString ="Diamonds: ";
	String hString ="Hearts: ";
	String sString ="Spades: "
	int [] hand = bernieMac();
	for (int j=0;j<5;j++){
		int choice = hand[j];
		int suit = choice /13;
		switch (suit) {
			case 0: cString += ref[(choice%13)] +" ";
				break;
			case 1: dString += ref[(choice%13)] +" ";
				break;
			case 2: hString += ref[(choice%13)] +" ";
				break;
			case 3: sString += ref[(choice%13)] +" ";
				break;
			default : break;
		}
	}
	System.out.println(sString);
	System.out.println(dString);
	System.out.println(hString);
	System.out.println(sString);
	System.out.println("Go Again? [Y or y] for yes anything else to quit");
	userChoice = console.next().charAt(0);
	userChoice = Character.toUpperCase(userChoice);
	}while (userChoice == Y)
}
public static void simulateOdds(){
	int total [] = new int[14];
	String [] ref = {"A","K","Q","J","10","9","8","7","6","5","4","3","2"};
	for(int i=0;i<10000;i++){
		int temp = exactlyOneDup(numberSort(bernieMac));
		total[temp] +=1;
	}
	System.out.println("pair : number");
	for (int j= 0;j<14;j++){
	System.out.println(ref[j] +"   :  " total[j]);
	}
}
public static int[] bernieMac(){
	int [] deck = new int [52];
	int [] hand = new int [5];
	for (int i = 0;i<52;i++){
		deck[i]= i+1; 
	}
	Random rand = new Random();
	for (int j=0;j<5;j++){
		int card = rand.nextInt(51-j);
		hand[j]=deck[card];
		deck[card] = deck[51-j];
	}
	return hand;
}
public static int[] numberSort(int [] num){
	int ArLn = num.length;
	for (int i=0; i < ArLn; i++){
		int temp= (num[i])%13;
		num[i]=temp;
	}
	return num;
		
}
public static int exactlyOneDup(int [] num){
  		int result = 0;
		int ArLn = num.length;
		int c=0;
		int pair = 0;
		for (int i=0; i < ArLn; i++){
			int check= num[i];
			for (int j=0; j<ArLn; j++){
				int check2 = num[j];
				if (check == check2 && j!=i){
					if (c<2){result= check2; c++;}
					else{result=0}
				}
			}
		}
		return result;
  }
}
