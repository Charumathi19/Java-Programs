package zoho;
import java.util.*;
public class removewhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner temp=new Scanner(System.in);
      System.out.println("Enter the string: ");
      String input=temp.nextLine();
      System.out.println("before the string: " + input);
      String after=input.replaceAll("\\s", "");
      System.out.println("After the string: " + after);
	}

}
