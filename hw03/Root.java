/*Cube Root Finder by David Chase Brewster */
import java.util.*;
public class Root{
	public static void main(String [] Args){
		//Create new scanner to get value from user
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a double and I print the cube root");
		double x = console.nextDouble();
		//Set up intial guess as user input divided by 3
		double guess = x/3;
		//Run calculation to improve accuracy of guess
		//The calculation is run 9 times to improve the accuracy
		//of higher numbers
		for (int i=0; i<=9;i++){
			guess=((2*guess*guess*guess+x)/(3*guess*guess));
		}
		//Print it out
		System.out.printf("The cube root is: %.5f\n",guess);
	}
}
			
