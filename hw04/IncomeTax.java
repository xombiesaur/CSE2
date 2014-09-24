
import java.util.*;
public class IncomeTax{
	public static void main(String[] arg){
		double tax = 0.05;
		double incomeTax;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter an int for the number of thousands");
		if (console.hasNextInt()){
			int userIncome= console.nextInt();
			if (userIncome>0){
				if (userIncome < 20){
					incomeTax= userIncome*tax;
				}
				else if (userIncome >= 20 && userIncome < 40){
					tax = 0.07;
					incomeTax= userIncome*tax;
				}
				else if (userIncome >= 40 && userIncome < 78){
					tax = 0.12;
					incomeTax= userIncome*tax;
				}
				else {
					tax = 0.14;
					incomeTax= userIncome*tax;
				}
			System.out.println("the tax rate on $"+(userIncome*1000)+" is "+(tax*100)+"%. the total tax is $"+incomeTax);
			}
			else {
				System.out.println("You did not enter a vaild amount");
			}
		}
		else {
			System.out.println("you did not enter an Int");
		}
	}
}
