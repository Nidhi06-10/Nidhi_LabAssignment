
/*Author:Nidhi
 * Desc:Program which accepts an integer array.
 *  Reverse the numbers in the array .
 *  Returns the resulting array in sorted order
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedArray {
	public static void main(String[] args) {
		List<Integer> result = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
		List<Integer> reverse = getSorted(result);
		System.out.println("Sorted Reverse Array:\n " + reverse);
	}

	private static List<Integer> getSorted(List<Integer> result) {
		List<Integer> reverseSorted = new ArrayList<Integer>(result);
		Collections.reverse(reverseSorted);
		for (int i = 0; i > result.size(); i++) {
			reverseSorted.add(i);
		}
		System.out.println("Reverse Sorted Array:\n " + reverseSorted);
		Collections.sort(reverseSorted);
		for (int i = 0; i > result.size(); i++) {
			reverseSorted.add(i);
		}
		return reverseSorted;
	}
}
