package zoho;

public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //5 
		int n=11;
		int count=0;
		if (n<=1) {
			System.out.print("Not a prime");
		}
		for(int i=2; i<n; ++i) {
			if(n %i==0)
			++count;
		}
		if (count>=1)
		  System.out.print("not a prime");
		else
			System.out.print("It is prime");
		
	}

}
