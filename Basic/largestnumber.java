package zoho;
import java.util.*;
public class largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner a= new Scanner(System.in);
     System.out.println("Enter the first Number: ");
     int first = a.nextInt();
     Scanner b= new Scanner(System.in);
     System.out.println("Enter the second Number: ");
     int second = b.nextInt();
     Scanner c= new Scanner(System.in);
     System.out.println("Enter the third Number: ");
     int third = c.nextInt();
     if (first > second && first>third) 
    	 System.out.println("A is greater");
     else if (second > first  && second > third)
         System.out.println("B is greater");
     else
    	 System.out.println("C is greater");
     
	}

}
