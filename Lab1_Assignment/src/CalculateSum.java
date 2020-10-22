import java.util.Scanner;

public class CalculateSum {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		
		calculateSum(N);			
		}	
	
	private static void calculateSum(int  num) {
		// TODO Auto-generated method stub
		int i,sum=0;
		for( i=1;i<=num;i++) {
			if(i%3==0 || i%5==0) {
				//System.out.println(i);
				sum=sum+i;		
			}
				
	}
	System.out.println("The sum of n natural number divisible by 3 or 5 :"+sum);
}
	
}


