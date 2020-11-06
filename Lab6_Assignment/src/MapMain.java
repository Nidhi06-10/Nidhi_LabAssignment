
/* 
 * Author:Nidhi
 * Desc:accepts a hash map and return the values of the map in sorted order as a List.
*/
import java.util.HashMap;
import java.util.Map;

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
	}
}
