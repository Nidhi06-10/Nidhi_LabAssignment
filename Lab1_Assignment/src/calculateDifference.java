import java.util.*;
public class calculateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter the number :");
     Scanner s=new Scanner(System.in);
     int number=s.nextInt();
     int result=sumOfSquare(number)-squareOfSum(number);
     System.out.println("The difference between sum of squares of n natural number "+result);
	}
	static int sumOfSquare(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=(i*i);
		}
		return sum;
			
	}
	static int squareOfSum(int n) {
		int square=0,sum=0;
		for(int i=1;i<=n;i++) {
			sum +=i;
		}
		return sum*sum;
		
		
	}

}
