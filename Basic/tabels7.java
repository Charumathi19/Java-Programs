package zoho;

import java.util.Scanner;

public class tabels7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner temp=new Scanner(System.in);
	    System.out.println("Enter the Table Number: ");
	     int num=temp.nextInt();
	     int i;
	     for (i=5; i<17; ++i) {
	    	 System.out.printf("%d * %d = %d \n", num , i, num*i);
	     }*/
		
		//Factorial
		
		Scanner temp=new Scanner(System.in);
	    System.out.println("Enter the Table Number: ");
	    int num=temp.nextInt();
	    int fact=1;
	    for(int i=1; i<=num; ++i) {
	    	fact=fact*i;
	    }
	    System.out.println("Factorial of "+num+ "is " + fact);
	}

}
