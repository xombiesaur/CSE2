/* Bicycle Cyclometer by David Chase Brewster */
import java.util.*;
public class Bicycle{
	public static void main(String [] Args){
		//Setting each constant
		int inchInMile= 63360;
		int tireSize = 27;
		double Pi = 3.14159;
		//Since there are 60 seconds in a minute and 60 minuts in an hour
		//both multiplication values use the same constant
		int timeMultiConstant = 60;
		//create scanner and get values from user
		Scanner console = new Scanner(System.in);
		System.out.print("Enter time in seconds: ");
		double time = console.nextDouble();
		System.out.print("Enter the amount of turns: ");
		double turns = console.nextDouble();
		//Doin' Math
		double rideDistanceInch = (turns*(tireSize*Pi));
		double rideDistanceMile = (rideDistanceInch/inchInMile);
		double timeMinutes = (time/timeMultiConstant);
		double speed = (rideDistanceMile/(timeMinutes/timeMultiConstant));
		//Print out the information
		System.out.printf("\nThe Distance was %.2f miles and took %.1f minutes\n",rideDistanceMile,timeMinutes);
		System.out.printf("The average speed was %2.2f MPH\n",speed);
	}
}
