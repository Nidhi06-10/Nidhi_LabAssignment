import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondSmallest {
	public int getSecondSmallest(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		/* Adds elements to the list */
		for (int i : arr) {
			list.add(i);
		}
		/* Sorts in ascending order */
		Collections.sort(list);
		return list.get(1);// Returns elements from index one i.e second smallest element
	}

	public static void main(String[] args) {
		SecondSmallest secondSmallest = new SecondSmallest();
		int arr[] = { 413, 549, 665, 76, 32, 766, 87, 473, 66, 117, 320, 574, 493 };
		int i = secondSmallest.getSecondSmallest(arr);
		System.out.println(i);
	}

}
