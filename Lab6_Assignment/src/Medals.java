
/* Author:Nidhi
 * Desc:Program that accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal. 
 */
import java.util.HashMap;
import java.util.Set;

public class Medals {
	public HashMap<String, String> getStudent(HashMap<String, Integer> student) {
		HashMap<String, String> medal = new HashMap<>();
		Set<String> set = student.keySet();
		for (String s : set) {
			Integer marks = student.get(s);
			if (marks >= 90) {
				medal.put(s, "Gold");
			} else if (marks >= 80) {
				medal.put(s, "Silver");
			} else if (marks >= 70) {
				medal.put(s, "Bronze");
			}
		}
		return medal;
	}

	public static void main(String[] ar) {
		HashMap<String, Integer> student = new HashMap<>();
		Medals medals = new Medals();
		student.put("1", 60);
		student.put("2", 78);
		student.put("3", 84);
		student.put("4", 90);
		student.put("5", 94);
		System.out.println(medals.getStudent(student));
	}
}
