/**
 * Author:Nidhi
 * Desc:to fetch Second Smallest element in an array
 * Date:23/10/2020
 */
import java.util.*;
public class SecondSmallestElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] =new int[100];
		System.out.println("Enter the size of the array of elements");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			array[i]=s.nextInt();
		}
		getSecondSmallest(array,size);
		System.out.println("Second Smallest element is : "+array[size-2]);	
	}
	private static int getSecondSmallest(int[] array, int size) {
		// Sorting the elements in descending order
		for(int j=0;j<(size-1);j++) {
			for(int k=0;k<size-j-1;k++) {
				if(array[k]<array[k+1]) {
					int temp=array[k];
					array[k]=array[k+1];
					array[k+1]=temp;
				}
			}	
		}
		//Displays the array elements in descending order
		for(int i=0;i<size;i++) {
			System.out.print(array[i]);
			System.out.print("\n");
		}
		return array[size];		
	}	
}


