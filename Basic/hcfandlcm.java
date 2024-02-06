package zoho;

public class hcfandlcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=120,n2=180;
		int hcf=1;
		for (int i=1; i <=n1 && i<=n2; ++i) {
			if(n1 %i==0 && n2 %i==0)
				hcf=i;
			
		}
		System.out.print(hcf+ " ");
		/*int lcm;
		lcm=(n1*n2)/hcf;
		System.out.print(lcm);*/
		

	}

}
