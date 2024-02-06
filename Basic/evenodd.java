package zoho;
import java.util.*;
public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner temp = new Scanner(System.in);
     System.out.println("Enter a Number: ");
     int number= temp.nextInt();
     if(number% 2==0)
    	 System.out.println("The given " + number + " is Even Number");
    	 
     else 
    	 System.out.println("The given " + number + " is Odd Number");	 
    	 
    
     
	}

}
