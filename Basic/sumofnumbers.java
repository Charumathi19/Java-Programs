package zoho;
import java.util.*;
public class sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number: ");
       int number = sc.nextInt();
       int sum=0;
       int i;
       for (i=1; i<=number; ++i)
       {
    	   sum=sum+i;
       }
       System.out.println("sum of number is: "+ sum);
   }

}
