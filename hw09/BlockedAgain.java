import java.util.Scanner;
public class BlockedAgain{
	public static void main(String []s){
		int m;
		//force user to enter int in range 1-9, inclusive.
		m = getInt(); 
		allBlocks(m);
	}
	public static int getInt(){
		while (true){
			Scanner console = new Scanner(System.in);
			System.out.println("Enter an in int between 1 and 9, inclusive:");
			int userInput=(checkInt(console));
			boolean inRange = checkRange(userInput)
			if (inRange == true) {
				return userInput;
			}
		}
	}
	public static int checkInt(Scanner console){
		while (true){
			if (console.hasNextInt()){
				int userInt=console.nextInt;
				return userInt
			}
			else(){
				System.out.println("Not an Integer, try again")
			}
		}
	}
	public static int checkRange(int userInt){
		if (userInt<10 && userInt > 0){
			return true;
		}
		else (){
			return false; 
		}
	}
	public static void allBlocks(int userNum){
		int count = 1;
		for (int i; i<=userNum; i++){
		blockBuild(count,userNum);
		count ++; 
		}

		
	}
	public static void blockBuild(int count, int userNum){
		for (int j= 0; j<i; j++){
				linePrint(count, userNum)	
		}				

			dashPrint(count,userNum)
			System.out.print("\n");
	}
	public static void linePrint(int count, int userNum){
				for (int k= 0; k<userNum-count; k++){
					System.out.print(" ");
				}
				for (int l= 0; l<(count*2-1); l++){
					System.out.print(count);
				}
				System.out.println("");		
	}
	public static void dashPrint(int count, int userNum){
		for (int n= 0; n<userNum-count; n++){
			System.out.print(" ");
		}
		for (int m= 0; m<(count*2-1);m++){
			System.out.print("-"); 
		}
	}		

}
