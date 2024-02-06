package zoho;
import java.util.*;
public class arrayprimeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] number= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
     int count = 0;
     int answer;
     int temp=0;
     System.out.println("prime numbers are: ");
     for(int i=2; i <=number.length; i++) {
    	 int j;
    	 for( j=2; j<=i; j++) {
    		// System.out.println(j);
    		 if(i % j==0)
    		     break;		   
    	 }
    	 if (j>i/2) {
    	        number[count]=i;
    	        count++;
    	        //System.out.println("------------");
    	         answer=i;
    	         System.out.println(answer);
        
    	   
    	 //count
           answer=answer/10;
           ++temp;
  
	    }
    	
}
     System.out.println("No of Prime Number is: "+temp);
}
}