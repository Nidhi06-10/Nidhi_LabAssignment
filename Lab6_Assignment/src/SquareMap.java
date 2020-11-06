import java.util.HashMap;
import java.util.Map;

public class SquareMap {
	public Map<Integer, Integer> getSquares(int[] array) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], (int) Math.pow(array[i], 2));
		}
		return map;
	}
}