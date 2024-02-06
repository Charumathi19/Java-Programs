package zoho;

public class arraylargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] element= {23,45,66,70,60};
        int firstelement=element[0];
        for(int largest: element) {
        	if(firstelement < largest)
        		firstelement=largest;
        }
        System.out.println("Largest Number is: "+firstelement);
	}

}
