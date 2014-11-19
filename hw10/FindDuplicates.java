import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  public static boolean hasDups(int [] num){
		boolean result = false
		int ArLn = num.length;
		for (int i=0; i < ArLn; i++){
			int check= num[i];
			for (int j=0; j<ArLn; j++){
				int check2 - num[j];
				if (check == check2 && j!=i){return result=true;}
			}
		}
		return result;
  }
  public static boolean exactlyOneDup(int [] num){
  		boolean result = false
		int ArLn = num.length;
		int c=0;
		for (int i=0; i < ArLn; i++){
			int check= num[i];
			for (int j=0; j<ArLn; j++){
				int check2 - num[j];
				if (check == check2 && j!=i){result=true; c++;}
			}
		}
		if (c>2){result = false;}
		return result;
  }
}
