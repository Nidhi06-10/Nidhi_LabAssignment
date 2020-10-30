/* Author:Nidhi
   Desc:Incresing number
   Date:22/10/2020 

*/
import java.util.*;
public class IncreasingNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//   boolean flag=false;
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		boolean flag=checkNumber(num);
			
		if( flag==true) {
			System.out.println("Digits are not in increasing order");
		}
		else {
			System.out.println("Digits are in increasing order");
		}	

		
	}
	public static  boolean checkNumber(int Number){
		// TODO Auto-generated method stub
		boolean flag=false;
		int currentNumber=Number%10;
		Number/=10;
		 while(Number>0) {
			 if(currentNumber<=Number%10) {
			  flag =true;
			  break;
			 }
			  currentNumber=Number%10;
			  Number/=10;
		 }	
		 return flag;
	}
	s.close();

		 
}





