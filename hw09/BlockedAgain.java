//BLOCKED AGAIN THE SEQUAL BY DAVID CHASE BREWSTER
//THATS RIGHT. WERE BACK AND WERE PRINTING OFF THE SAME PYRAMID OF NUMBERS 
//BUT THIS TIME WE HAVE
//MULTIPLE METHODS (EXPLOSIONS)
import java.util.Scanner;
public class BlockedAgain{
	//Thats the MAIN METHOD right there. Basically the guidline for these shinanigans  
	public static void main(String []s){
		int m;
		//force user to enter int in range 1-9, inclusive.
		m = getInt(); 
		allBlocks(m);
	}
	//getInt, like get shorty but instead of shorty it gets an int. boom.
	public static int getInt(){
		while (true){
			Scanner console = new Scanner(System.in);
			System.out.println("Enter an in int between 1 and 9, inclusive:");
			//calling on that checkInt method to make sure this fool is entering a numba
			int userInput=(checkInt(console));
			//using my checkRange method to make sure that number is LEGIT homie 
			boolean inRange = checkRange(userInput);
			if (inRange == true) {
				return userInput;
			}
		}
	}
	//checks out what this user is putting down in the console window
	public static int checkInt(Scanner console){
		while (true){
			if (console.hasNextInt()){
				int userInt=console.nextInt();
				return userInt;
			}
			else{
				System.out.println("Not an Integer, try again");
				console.next();
			}
		}
	}
	//making sure that number is between 1-9 because those are the only good numbers
	public static boolean checkRange(int userInt){
		if (userInt<10 && userInt > 0){
			return true;
		}
		else {
			return false; 
		}
	}
	//Building blocks of numbers like im bob the builder
	public static void allBlocks(int userNum){
		int count = 1;
		for (int i=1; i<=userNum; i++){
		blockBuild(count,userNum,i);
		count ++; 
		}

		
	}
	//just the numbers now
	public static void blockBuild(int count, int userNum,int i){
		for (int j=0; j<i; j++){
				linePrint(count, userNum);	
		}				

			dashPrint(count,userNum);
			System.out.print("\n");
	}
	//number by number this makes the line for the block
	public static void linePrint(int count, int userNum){
				for (int k= 0; k<userNum-count; k++){
					System.out.print(" ");
				}
				for (int l= 0; l<(count*2-1); l++){
					System.out.print(count);
				}
				System.out.println("");		
	}
	//adding in that dashed line to make it fancy like cake
	public static void dashPrint(int count, int userNum){
		for (int n= 0; n<userNum-count; n++){
			System.out.print(" ");
		}
		for (int m= 0; m<(count*2-1);m++){
			System.out.print("-"); 
		}
	}		

}
