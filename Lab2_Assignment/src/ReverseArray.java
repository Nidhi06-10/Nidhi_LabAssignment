/**
 * Author:Nidhi
 * Desc:Reverse sorted array
 * Date:23/10/2020
 */
import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[100];
		System.out.println("Enter he size of an array :");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		getSorted(arr,size);
	}
	private static void getSorted(int[] arr, int size) {
		// TODO Auto-generated method stub
		int[] array2=new int[size];
		int j=size;
		for(int i=0;i<size;i++) {
			array2[j-1]=arr[i];
			j--;	
		}
		System.out.println("Reversed array elements :");
		for(int k=0;k<size;k++) {
			System.out.println(array2[k]);
		}
		int temp=0;
		for(int k=0;k<size;k++) {
			for(int l=k;l<size;l++) {
				if(array2[k] <array2[l]) {
					temp=array2[k];
					array2[k]=array2[l];
					array2[l]=temp;
				}
			}
		}
		System.out.println("Reversed sorted array elements:");
		 for(int k=0;k<size;k++) {
			 System.out.println(array2[k]);
		 }				
	}
}
