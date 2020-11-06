
/*Author:Nidhi
 * Desc:Program that accepts the id and the age of people as a Map. 
 *      Decide if they are eligible for vote. 
 *      A person is eligible for vote if his age is greater than 18.
 *     Add the IDs of all the eligible persons to list and return the list. 
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VotersList {
	public static void main(String[] args) {
		Map<Integer, Integer> voterList = new HashMap<Integer, Integer>();
		voterList.put(1, 18);
		voterList.put(2, 15);
		voterList.put(3, 37);
		voterList.put(4, 78);
		List<Integer> voterDetails = votersList(voterList);
		System.out.println(voterDetails);
	}

	private static List<Integer> votersList(Map<Integer, Integer> voterList) {
		/*
		 * check the age is greater than 18 or not
		 */

		List<Integer> voterDetails = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : voterList.entrySet()) {
			// if age is more than 18 then display registration number
			if (entry.getValue() > 18) {
				voterDetails.add(entry.getKey());
			}
		}
		return voterDetails;
	}

}