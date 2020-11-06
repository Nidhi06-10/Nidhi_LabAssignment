
import java.util.HashMap;
import java.util.Map;

public class MapCharacterCount {
	public Map<Character, Integer> countCharacter(char[] charArray) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			/* Checks if the element is in the array */
			if (map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i]) + 1);
			} else
				map.put(charArray[i], 1);
		}
		return map;
	}
}
