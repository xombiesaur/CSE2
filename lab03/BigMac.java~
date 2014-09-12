

import java.util.*;
public class BigMac{
	public static void main(String[] arg){
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to McDonalds, Please enter your state tax as a whole precentage:");
		double tax=console.nextInt();
		System.out.println("Sales tax has been set at "+tax+"%, please enter the cost of a BigMac [xx.xx]");
		tax /=100;
		double BMPrice = console.nextDouble();
		System.out.println("BigMac price set at "+BMPrice+". Setup Complete!\nEnter [c] to continue to register or [q] to quit \n (program is case sensitive) : ");
		while (true){
			char userChoice=console.next().charAt(0);
			if (userChoice == 'c'){
				register(console,tax,BMPrice);
				System.out.println("\nEnter [c] to continue to register or [q] to quit \n(program is case sensitive): ");
			}
			else if (userChoice == 'q'){
				break;
			}
			else {
				System.out.print("Not a vaild choice.\nEnter [c] to continue to register or [q] to quit \n[program is case sensitive] :");
			}
		}
	}
	public static void register(Scanner console, double tax, double BMPrice){
		System.out.println("Welcome to the register! How many BigMac do you want? ");
		int totalBigMac=console.nextInt();
		double totalCost = totalBigMac*(BMPrice*(1+tax));
		int dollars=(int)(totalCost);
		int dimes=(int)(totalCost*10)%10;
		int pennies=(int)(totalCost*100)%10; 
		System.out.println("Your total for "+totalBigMac+" BigMacs is: $"+dollars+"."+dimes+pennies); 	
		
	}
}
