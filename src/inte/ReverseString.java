package inte;

import java.util.Scanner;

public class ReverseString {
  public static void main(String args[]){
	  Scanner scn = new Scanner(System.in);
	  String B =  scn.next();
	  System.out.println(B);
	 
	  
	  int k = B.length();
	  String  rev = "";
	  
	  for(int i=k-1;i>=0;i--){
		  rev = rev + B.charAt(i);
	  }
      System.out.println(rev);
      
      if(B.equalsIgnoreCase(rev)){
    	  System.out.println("Palindrome");
      }
      else{
    	  System.out.println("Not a Palindrome");
      }
      
  }
  
}
