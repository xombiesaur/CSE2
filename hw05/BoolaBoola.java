import java.util.*;

public class BoolaBoola {
	Scanner console = new Scanner(System.in);
	Random rand = new Random();
	boolean state1 = rand.nextBoolean();
	boolean state2 = rand.nextBoolean();
	boolean state3 = rand.nextBoolean();
	boolean stateFinal = true;
	String output = state1;
	boolean op = true;
	if (op) {
		stateFinal = state1 || state2;
		output += " || "+ state2;
	}
	else {
		stateFinal = state1 && state2;
		output += " && "+ state2;
	}
	op = rand.nextBoolean;
	if (op) {
		stateFinal = statefinal || state3;
		output += " || "+ state3;
	}
	else {
		stateFinal = stateFinal && state3;
		output += " && "+ state3;
	}
	System.out.println("What is the result of "+output+"? [T]rue or [F]alse?");
	char userAns = console.next.charAt(0);
	userAns = Character.toUpperCase(userAns);
	boolean answer = null;
	switch (userAns) {
		case 'T': 
			break;
		case 'F':
			answer = false;
			break;
		default:
			System.println("Not a Valid Choice");
			break;
	}
	if (answer == stateFinal) {
		System.out.println("Correct!");
	}
	else (){
		System.out.println("Incorrect...")
	}
}
