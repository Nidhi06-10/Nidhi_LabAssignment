/*
 * Author:Nidhi
 * Desc:Replace consonant
 * Date:25/10/2020
 */
import java.util.Scanner;
public class ReplaceConsonant
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		sc.close();
	     System.out.println(replaceConsonants(string.toCharArray())); 
	}
	public static String replaceConsonants(char[] string)  
	{ 
		for (int i = 0; i < string.length; i++) 
		{ 
			if(string[i]=='z') {
				string[i]='b';
				string[i]=(char) (string[i]++);
			}
		else if (string[i] != 'a' && string[i] != 'e' && string[i] != 'i' && string[i] != 'o' && string[i] != 'u')     
			{
				string[i] = (char) (string[i] + 1);
			}	

		} 
		return String.valueOf(string); 
	} 
}