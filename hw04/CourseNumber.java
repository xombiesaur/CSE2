import java.util.*;
public class CourseNumber.java {
	public static void main String (args []){
		Scanner console = new Scanner(System.In);
		System.out.println("Enter the six digit course number: ");
		userCourse = console.nextInt;
		if (userCourse < 186510 || userCourse >201440){
			System.out.println("course number is outside the range");
		}
		else{
			semester = userCourse % 100;
			userCourse /=100 ;
			switch (userCourse){
				case 10:  System.out.println("the course was offered in the Spring of "+userCourse);
					break;
				case 20:  System.out.println("the course was offered in the Summer 1 of "+userCourse);
					break;
				case 30:  System.out.println("the course was offered in the Summer 2 of "+userCourse);
					break;
				case 40:  System.out.println("the course was offered in the Fall of "+userCourse);
					break;
				default:   System.out.println("not  valid course");
					break;
			}
		}
	}
}
