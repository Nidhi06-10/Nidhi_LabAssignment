
/*Author:Nidhi
 * Desc:Program that accepts a character array and count the number of times each character is present in the array.

 */
import java.util.Scanner;

public class MainTwo {
	public static void main(String[] args) {
		MapCharacterCount mapCharactercount = new MapCharacterCount();
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(mapCharactercount.countCharacter(str.toCharArray()));
	}
}
