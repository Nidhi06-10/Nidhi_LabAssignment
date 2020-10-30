/*
Author:Nidhi
Desc:Prefix Code
*/	
import java.util.*;
public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] prefixArray= {"Mr","Ms","Mrs"};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=s.nextLine();
		System.out.println("Enter the gender");
		String gender=s.nextLine();
		System.out.println("Enter Marital Status");
		String maritalStatus=s.nextLine();
		s.close();
		if(gender.equalsIgnoreCase("female")){
			if(maritalStatus.equalsIgnoreCase("Yes")) {
				System.out.println(prefixArray[2]+"."+name);
				
			}
			else {
				System.out.println(prefixArray[1]+"."+name);
			}
			
		}
		else {
			System.out.println(prefixArray+"."+name);
		}
		
		

	}

}
