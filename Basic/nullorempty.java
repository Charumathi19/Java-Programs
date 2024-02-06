package zoho;
import java.util.*;
import java.lang.*;
public class nullorempty {

	private static Object ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Scanner sc=new Scanner(System.in);
    //System.out.println("Enter the string: ");
    String hello=null;
    System.out.println("The string is: "+ isNullEmpty(hello));
	}
    public static String isNullEmpty(String hello) {
    	if (hello==null) 
    		return "Null";
    	
    	
    	else if(hello.trim().isEmpty())
    		return "Empty";
    	
    	else
    		return "value";
    }
}
