/* Author:Nidhi
   Desc:Calculate Diference 

*/

import java.util.*;
public class calculateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter the number :");
     Scanner s=new Scanner(System.in);
     int number=s.nextInt();
     int result=sumOfSquare(number)-squareOfSum(number);//calculates the difference of sum of squares and square of sum
     System.out.println("The difference between sum of squares of n natural number "+result);
	}
	static int sumOfSquare(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=(i*i);//sum of square of a number
		}
		return sum;
			
	}
	static int squareOfSum(int n) {
		int square=0,sum=0;
		for(int i=1;i<=n;i++) {
			sum +=i;//square of sum
		}
		return sum*sum;
		
		
	}
	s.close();

}
