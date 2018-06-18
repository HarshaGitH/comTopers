package inte;

public class SumOfAllDigits {

	public static void main(String[] args) {
		int i = 12345;
		int sum = 0;
		
		while(i>0){
			sum = sum + (i%10); //4 + 3 + 2 + 1
			i=i/10; // 123 12 12 
			
			}
		System.out.println(sum);
		
		int j = 0;
		while(sum>10){
			 j = j + (sum%10); //4 + 3 + 2 + 1
			 sum=sum/10; // 123 12 12 
			
			}
		System.out.println(j);
		}
		

	}


