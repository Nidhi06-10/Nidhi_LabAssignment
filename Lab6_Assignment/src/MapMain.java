
/* 
 * Author:Nidhi

 * Desc:accepts a hash map and return the values of the map in sorted order as a List.
*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapMain {
	public static void main(String[] args) {
		SortMap sortMap = new SortMap();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 100);
		map.put(2, 18);
		map.put(3, 120);
		map.put(4, 780);
		map.put(5, 1000);
		map.put(6, 978);
		System.out.println(sortMap.sortMapToList(map));

		/* Main function for character count */
		MapCharacterCount mapCharactercount = new MapCharacterCount();
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(mapCharactercount.countCharacter(str.toCharArray()));

		/* Main function for Square Map */
		SquareMap squareMap = new SquareMap();
		int[] array = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(squareMap.getSquares(array));
	}
}
