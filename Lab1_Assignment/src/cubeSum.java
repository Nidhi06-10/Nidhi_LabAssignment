/**
 * 
 * Author :NIDHI
 * Desc:Sum of cubes of digit
 * Date:22/10/2020
 *
 */
import java.util.*;
public class cubeSum {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		
		int result=CubeSum(num);
		System.out.println("Sum of the Cubes of a number : "+result);
		

	}

	private static int CubeSum(int i) {
		int sum=0,digit;
		while(i!=0) {
			digit=i%10;
			sum=sum +(digit*digit*digit);
			i=i/10;
			
		}
	      
		return sum;
	}

}
