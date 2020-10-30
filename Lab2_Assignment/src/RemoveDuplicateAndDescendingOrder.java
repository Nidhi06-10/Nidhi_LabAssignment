/*
author:Nidhi
Desc:Remove Duplicates

*/
import java.util.*;
		
public class RemoveDuplicateAndDescendingOrder {

	public static void main(String[] args) {
		
				Scanner s = new Scanner(System.in);
				int array[] = new int[5];
				System.out.println("Enter the size of the array");
				int length = s.nextInt();
				System.out.println("Enter the array elements : ");
				for(int i = 0;i < length;i++)
				{
					array[i] = s.nextInt();
				}
				length = RemoveDuplicate(array,length);
				DescendingOrder(array,length);
				System.out.println("Array in descending order : ");
				for(int i = 0; i < length; i++)
				{
					System.out.println(array[i]+" ");
				}
	
	}	
			public static int RemoveDuplicate(int array[],int length)
			{
				if(length == 0 || length == 1)
				{
					return length;
				}
					int j = 0;
					for(int i = 0;i < length - 1;i++)
					{
						if(array[i] != array[i + 1])
						{
							array[j++] = array[i];
						}
					}
					array[j++] = array[length - 1];
					return array[j];
				}
				public static void DescendingOrder(int array[],int length)
				{
					int temp = 0;
					for(int i = 0;i < length;i++)
					{
						for(int j = i;j < length;length++)
						{
							if(array[i] < array[j])
							{
								temp = array[i];
								array[i] = array[j];
								array[j] = temp;
							}
						}
					}
					/*System.out.println("Array in descending order : ");
					for(int i = 0; i < length; i++)
					{
						System.out.println(array[i]+" ,");
					}*/
				}
	
		

	}


