package zoho;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner hai = new Scanner(System.in);
     System.out.println("Enter the first number to do operations: ");
     int A= hai.nextInt();
     Scanner hi = new Scanner(System.in);
     System.out.println("Enter the Second number to do operations: ");
     int B= hi.nextInt();
     
     System.out.println(" Addtion");
     System.out.println(" Subration");
     System.out.println(" Multiplication");
     System.out.println(" Division");
     Scanner input = new Scanner(System.in);
     System.out.println(" Choose any one from above the option");
     String make=input.nextLine();
    
     switch(make) {
     case ("Addtion"):
     {
    	 int x=A+B;
    	 System.out.println(" Aswer is: "+x);
    	 break;
     }
     case ("Subration"):
     {
    	 int y=A-B;
    	 System.out.println(" Aswer is: "+y);
    	 break;
     }
     case ("Multiplication"):
     {
    	 int z=A*B;
    	 System.out.println(" Aswer is: "+z);
    	 break;
     }
     case ("Division"):
     {
    	 float s=A/B;
    	 System.out.println(" Aswer is: "+s);
    	 break;
     }
    	 
     }
	}

}
