import java.util.*;
public class NumberStack {
	public static void main (String args[]){
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 9");
		int userNum =console.nextInt();
		System.out.println("");
		int count = 1;
		int i=0;
		int j=0;
		int k=0;
		int l=0;
		int m=0;
		int n=0;
		for (i= 1; i<=userNum; i++){
			for (j= 0; j<i; j++){
				for (k= 0; k<userNum-count; k++){
					System.out.print(" ");
				}
				for (l= 0; l<(count*2-1); l++){
					System.out.print(count);
				}
				System.out.println("");		
				
			}				
			for (n= 0; n<userNum-count; n++){
			System.out.print(" ");
			}
			for (m= 0; m<(count*2-1);m++){
			System.out.print("-"); 
			}
			System.out.print("\n");
			count++;
		}

		
		i=1;
		j=0;
		k=0;
		l=0;
		m=0;
		n=0;
		count = 1;
		while(i<=userNum){
			while(j<i){
				while(k<userNum-count){
					System.out.print(" ");
					k++;
				}
				while(l<(count*2-1)){
					System.out.print(count);
					l++;
				}
				System.out.println("");
				k=0;
				l=0;
				j++;
			}
			while (n<userNum-count){
				System.out.print(" ");
				n++;
			}
			while(m<(count*2-1)){
				System.out.print("-"); 
				m++;
			}
			System.out.print("\n");
			j=0;
			n=0;
			m=0;
			k=0;
			count++;
			i++;
		} 
		i=1;
		j=1;
		k=1;
		l=1;
		m=1;
		count = 1;
		System.out.print(" ");
		do {
			do {
				do {
					System.out.print(" ");
					k++;
				} while(k<=userNum-count);
				do {
					System.out.print(count);
					l++;
				} while(l<(count*2-1));
				System.out.println("");
				k=0;
				l=0;
				j++;
			} while(j<i);
			do {
				System.out.print(" ");
				n++;
			} while (n<=userNum-count);
			do {
				System.out.print("-"); 
				m++;
			} while(m<(count*2-1));
			System.out.print("\n");
			j=0;
			n=0;
			m=0;
			k=0;
			count++;
			i++;
		} while(i<=userNum);
		
	}
}
