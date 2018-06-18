package inte;

public class PrintNatural {

	public static void main(String[] args) {

		int i = 10;
		int j = 100;
		int m = 1;
		
	//	System.out.println(3%2);
		
		for(int k =1;k<=i;k++){
			if(k%2 == 1 ){
				System.out.print(m);
				m++;
				
			}else{
				System.out.print(j);
				j--;
			}
			
		}

	}

}
