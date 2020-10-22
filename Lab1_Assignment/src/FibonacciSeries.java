import java.util.*;
public class FibonacciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		for(int i=0;i<number;i++) {
			System.out.println(fibonacci(i) + " ");
		}		
	}
	private static int fibonacci(int n) {
		// TODO Auto-generated method stub
		if(n<=1) 
			return n;	
		else 
			return fibonacci(n-1)+fibonacci(n-2);				
	}

}
