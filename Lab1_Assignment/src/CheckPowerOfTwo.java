/*
Author :Nidhi
Desc:Checks power of two
*/
import java.util.Scanner;

public class CheckPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		boolean flag=checkNumber(number);
		if(flag==true) {
			System.out.println("Number is power of two");
		}
		else {
			System.out.println("Number is not power of two");
		}

	}

	private static boolean checkNumber(int n) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if(n<=0) {
			flag=false;
		
		}
		else if(n>1) {
			if(n%2==0) {
				n/=2;
				flag=true; 
				
			}
			flag=false;
			
		}
		
	
	return flag;

}
}
