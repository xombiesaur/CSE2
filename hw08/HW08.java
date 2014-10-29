//Homework 8 By David Chase Brewster
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
	//set up varibles to be used throughout
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	//call the first type of getInput
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	//call the second getInput with the try modifier
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }
  public static char getInput(Scanner scan, String choices){
  	while (true){
  		System.out.println("Enter a single character"); 
  		String userInput = scan.next();
  		if (userInput.length() > 1){
  			System.out.println("Single Character please");
  		}
  		else {
  			for(int i =0; i<choices.length(); i++){
  				if (userInput.charAt(0) == choices.charAt(i)){
  					char rtrn = userInput.charAt(0);
  					return rtrn;
  				}
  			}
  			System.out.println("Not in the list "+choices);
  		}
  	}
  }
public static char getInput(Scanner scan, String choices,int tries){
  	int k = 0;
  	do {
  		k++;
  		System.out.println("Enter a single character"); 
  		String userInput = scan.next();
  		if (userInput.length() > 1){
  			System.out.println("Single Character please");
  		}
  		else {
  			for(int i =0; i<choices.length(); i++){
  				if (userInput.charAt(0) == choices.charAt(i)){
  					char rtrn = userInput.charAt(0);
  					return rtrn;
  				}
  			}
  			System.out.println("Not in the list "+choices);
  		}
  	} while (k < tries);
  	return ' ';
  }
  public static char getInput(Scanner scan, String prompt, String choices){
  	while (true){
  		System.out.println(prompt+choices);
  		String userInput = scan.next();
  		if (userInput.length() > 1){
  			System.out.println("Single Character please");
  		}
  		else {
  			for(int i =0; i<choices.length(); i++){
  				if (userInput.charAt(0) == choices.charAt(i)){
  					char rtrn = userInput.charAt(0);
  					return rtrn;
  				}
  			}
  			System.out.println("Not in the list "+choices);
  		}
  	} 
  }
}
