/*
 * Author:Nidhi
 * Desc:Difference between conseutive number
 * Date:25/10/2020
 */
import java.util.*;
public class DifferenceBetweenConsecutiveNumbers
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);  
		 System.out.print("Enter the number of array elements : ");  
		 int length = s.nextInt();  
		 int[] array = new int[length];  
		 System.out.println("Enter the array: ");  
		 for(int i = 0; i < length; i++)  
		 {  
				 array[i] = s.nextInt();  
		 }  
		 
		 difference(array, length);  
		 if(length % 2 != 0)//entered array is odd number
		 {
		  	System.out.println(array[length-1]);
		 }
	}
	public static void difference(int array[], int length)  
	{  
		int difference;  
		for(int i = 0; i < length - 1; i++)
		{  
			difference = Math.abs(array[i] - array[i + 1]); //reurns Absolute value 
			System.out.print(difference+" ");  
		}  
	}  
	s.close();
}
