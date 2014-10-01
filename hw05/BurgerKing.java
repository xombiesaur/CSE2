import java.util.*;

public class BurgerKing {
	Scanner console = new Scanner(System.in);
	System.out.println("Would you like a [B]urger, [S]oda or [F]ries?");
	String userInput = console.next();
	if (userInput.length() > 1){
		System.out.println("Error 45: Single character expected");
		}
	else{
		boolean printOut = true;
		char userChoice = userInput.charAt(0);
		userChoice = Character.toUpperCase(userChoice);
		String order = "you ordered a ";
		switch (userChoice){
			case 'B' : 
				order += "burger ";
				System.out.println("Would you like [A]ll Toppings, just [C]heese, or [N]oithing? ");
				userChoice = console.next.charAt(0);
				userChoice = Character.toUpperCase(userChoice);
				switch(userChoice) {
					case 'A':
						order += "with everything";
						break;
					case 'C':
						order += "with just cheese";
						break;
					case 'N':
						order += "with no toppings";
						break;
					default:
						System.out.println("not a valid choice");
						break;
				}
				break;
			case 'S' :
				System.out.println("Would you like a [P]epsi, [C]oke, [S]prite or [M]ountian Dew ");
				userChoice = console.next.charAt(0);
				userChoice = Character.toUpperCase(userChoice);
				switch(userChoice) {
					case 'P':
						order += "Pepsi";
						break;
					case 'C':
						order += "Coke";
						break;
					case 'S':
						order += "Sprite";
						break;
					case 'M':
						order += "Mountian Dew";
						break;
					default:
						System.out.println("Not a valid choice");
						order +="Generic Soda"
						break;
				}
				break;
			case 'F':
			System.out.println("Would you like a [L]arge or [S]mall");
				userChoice = console.next.charAt(0);
				userChoice = Character.toUpperCase(userChoice);
				switch(userChoice) {
					case 'L':
						order += "Large fry";
						break;
					case 'S':
						order += "Small fry";
						break;
					default:
						System.out.println("not a valid choice");
						order += "fry"
						break;
				}
				break;
			default:
				System.out.println("you did not enter a valid choice";
				printOut = false;
			break;
		}
		while printOut = true {
			System.out.println(order);
		}
	}
}
