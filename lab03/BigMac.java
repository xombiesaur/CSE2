/*the BigMac register by David Brewster
*/

import java.util.*;
public class BigMac{
	/*This method sets up the register by setting the tax and price*/ 
	public static void main(String[] arg){
		//creating the Scanner 
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to McDonalds, Please enter your state tax as a whole precentage:");
		//Setting the tax
		double tax=console.nextInt();
		System.out.println("Sales tax has been set at "+tax+"%, please enter the cost of a BigMac [xx.xx]");
		tax /=100;
		//Setting the price of a bigmac
		double BMPrice = console.nextDouble();
		System.out.println("BigMac price set at "+BMPrice+". Setup Complete!\nEnter [c] to continue to register or [q] to quit \n (program is case sensitive) : ");
		//Creates an infinite loop to keep the register running 
		while (true){
			//Compares the user choice the options given
			char userChoice=console.next().charAt(0);
			//If the user chooses to continue the register method is called passing through the scanner, tax and price variables 
			if (userChoice == 'c'){
				register(console,tax,BMPrice);
				System.out.println("\nEnter [c] to continue to register or [q] to quit \n(program is case sensitive): ");
			}
			//if the user chooses to quit the loop is broken and the program exits
			else if (userChoice == 'q'){
				break;
			}
			//If the User does not enter a vaild choice the program re prompts them for a vaild option
			else {
				System.out.print("Not a vaild choice.\nEnter [c] to continue to register or [q] to quit \n[program is case sensitive] :");
			}
		}
	}
	/*The register method that preforms the computations for the register*/
	public static void register(Scanner console, double tax, double BMPrice){
		System.out.println("Welcome to the register! How many BigMac do you want? ");
		//Gets the amount of bigmacs
		int totalBigMac=console.nextInt();
		//Does the math
		double totalCost = totalBigMac*(BMPrice*(1+tax));
		//breaks up the total..? this was in the instructions im assuming to practice typecasting
		int dollars=(int)(totalCost);
		int dimes=(int)(totalCost*10)%10;
		int pennies=(int)(totalCost*100)%10; 
		System.out.println("Your total for "+totalBigMac+" BigMacs is: $"+dollars+"."+dimes+pennies); 	
		
	}
}
