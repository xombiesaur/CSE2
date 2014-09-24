
import java.util.*;
public class Month{
	public static void main(String[] arg){
		int days = 31;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the number of a month (1-12): ");
		if (console.hasNextInt()){
			int month= console.nextInt();
			switch(month) {
				case 1: 
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					case 2: System.out.println("Enter Year");
					if (console.hasNextInt()){
          int year = console.nextInt
          if (year % 4 == 0 && year % 100 != 0){
            days = 29;
          }
          else {
            days = 28;
          } 
						break;
					}
					else {
						System.out.println("Not a Year")
					}
					break;
				case 4: --days;				 
					break;
				case 6: --days; 				 
					break;
				case 9: --days;
					 
					break;
				case 11: --days; 
					 
					break;
				default:System.out.println("Not a vaild Month")  
					break;
				}
				System.out.println("Month " +month+ " has "+days+" days.");
			}
		else {
			System.out.println("you did not enter an Int");
		}
	}
}
