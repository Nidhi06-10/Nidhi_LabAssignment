/* Author:Nidhi
   Desc:Prime number

*/
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number : ");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int num=0;
		String primeNumbers="";//Stores the String input
		for(int i=1;i<=number;i++) {
			int count=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count++;
				}
			}
			if(count==2) {
				primeNumbers=primeNumbers + i + " ";
			}
		}
		System.out.println(primeNumbers);
		   
	}
}

