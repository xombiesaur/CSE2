/*Decimal display..er? thing by David Chase Brewster */
import java.util.*;
public class FourDigits {
	public static void main(String[] args){
		//Set up Scanner to get user input
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a double and I display the 4 digits to the right of the decimal: ");
		double userInput = console.nextDouble();
		//Remove the decimals to clear the whole numbers 
		int userInt = (int) userInput;
		//Doin' Math
		double newUserNum = (userInput-userInt)*10000;
		//Clear any left over decimals
		int newUserNum2= (int) newUserNum;
		//Print it out
		System.out.printf("The four numbers are %4d\n",newUserNum2);
	}
}
