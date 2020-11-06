import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SortMap {
	public List<Integer> sortMapToList(Map<Integer, Integer> map) {
		List<Integer> list = new ArrayList<Integer>(map.values());
		/*
		 * values are added to list values in the gets sorted
		 */
		Collections.sort(list);
		return list;
	}
}
