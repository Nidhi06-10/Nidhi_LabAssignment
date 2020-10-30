/*
 * Author:Nidhi
 * Desc:Reverse string mirror image
 * Date:26/10/2020
 */
import java.util.Scanner;
public class MirrorFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		string=s.nextLine();
		s.close(); 
	    System.out.println(" "+string+"|"+" "+getImage(string));
	}

	private static String getImage(String string) {
		// TODO Auto-generated method stub
		StringBuffer reverseString = new StringBuffer(string);
	   String reverse=reverseString.reverse().toString();
	    return reverse;
	}

}
