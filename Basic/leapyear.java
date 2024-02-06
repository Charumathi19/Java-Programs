package zoho;
import java.util.*;
import java.lang.*;
public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer gee = null;
     Scanner temp=new Scanner(System.in);
     System.out.println("Enter the year: ");
     int year=temp.nextInt();
     if (year % 4==0 || year %100 == 0 || year % 400 ==0)
       System.out.println("Leap Year");
     else
    	 System.out.println("Not a Leap Year"); 
	}

}
