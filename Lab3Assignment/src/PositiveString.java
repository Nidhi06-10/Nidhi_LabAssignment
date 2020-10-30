
/*
 * Author : Nidhi
 * Desc : Positive String
 * Date : 25/10/2020
 */
import java.util.*;
public class PositiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string :");
		String string= s.nextLine();
		s.close();
		if (isAlphabaticOrder(string))  // check whether the string is in alphabetical order or not 
			System.out.println("String is positive");  
		else
		    System.out.println("String is negative");  
		            
	} 
	static boolean isAlphabaticOrder(String string1)  {  
		int n = string1.length();   
		char c[] = new char [n];  // create a character array of the length of the string  
		        
		 // assign the string to character array  
		 for (int i = 0; i < n; i++) {  
			 c[i] = string1.charAt(i);  
		 }  
		 Arrays.sort(c);        
		         
		// check if the character array is equal to the  input string o      
		 for (int i = 0; i < n; i++)  
			if (c[i] != string1.charAt(i))   
				 return false;  
	                
	     	return true;      
	    }  
	             
}