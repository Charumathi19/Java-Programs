package zoho;

public class arrayaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] element= {1,2,3,4,5};
      int sum=0;
      for(int average: element) {
    	  sum=sum+average;
      }
      System.out.println("Average of element is: "+ sum/element.length);
	}

}
