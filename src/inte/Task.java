package inte;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 String str = scn.nextLine();
	 String[] inputArr = str.split(" ");
	 int n= Integer.parseInt(inputArr[0]);
	 int k= Integer.parseInt(inputArr[1]);
	 
	 if(n>k && k>0 ){
		 
		 doTestest(n,k); 
	 }
	 else{
			System.out.println("Invalid Input");
	 }
	
	 }
	
	public static void doTestest(int n , int k){
		//n=10
		for(int i = 0;i<k ;i++ ){
			if(i%2==0){
				System.out.print((i/2)+1);
				System.out.print(" ");
				
			}
			else{
				System.out.print(n-(i/2));
				System.out.print(" ");
				
			}
			
		}
	}

}
