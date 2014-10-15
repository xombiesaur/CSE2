// square root through Bisection method by David Chase Brewster

import java.util.*;
public class Root{
	public static void main (String args[]){
		Scanner console = new Scanner(System.in);
		while (true){
			System.out.println("Enter a Double greater then 0");
			if (console.hasNextDouble()){
				//sets counters for loop 
				double userNum = console.nextDouble();	
				double lowNum = 0;			
				double highNum = userNum+1;
				double midNum = ((highNum-lowNum)/2);
				//loops till the precesion of the value is greater then 0.0000001
				while((highNum-lowNum)>=(0.0000001)){
					if ((midNum*midNum)>userNum){
						highNum = midNum;
					}
					else{
						lowNum = midNum;
					}
					midNum = ((highNum+lowNum)/2);
				}
				System.out.printf("The Square root is %f2.6",midNum);
			}
			else {
				System.out.println("Not a correct Double");
			}
			
		}
	}	
}
