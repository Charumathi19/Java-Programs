package zoho;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //0,1,1,2,3,5,8
		int num=10;
		int firsterm=0, secondterm=1;
		for (int i=1; i<=num; ++i) {
			System.out.print(firsterm + " ");
			
			int nextterm=firsterm+secondterm;
			firsterm=secondterm;
			secondterm=nextterm;
		}
		
	}

}
