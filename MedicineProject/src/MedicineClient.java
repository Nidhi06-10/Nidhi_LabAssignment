
/*
 * Author:Nidhi
   Desc:Medicine Info
 */
import java.util.Random;
import java.util.Scanner;

public class MedicineClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many medicine do you want");
		int count = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < count; i++) {
			Random rand = new Random();
			int t = rand.nextInt(3);
			t += 1;// Since random numbers starting from 0
			switch (t) {
			case 1:
				System.out.println("Tablet");
				System.out.println("Enter Medicine Name");
				String name = sc.nextLine();
				System.out.println("Enter Medicine Price");
				double price = Double.parseDouble(sc.nextLine());
				System.out.println("Enter Medicine Company");
				String company = sc.nextLine();
				System.out.println("Enter Medicine ExpiryDate");
				String date = sc.nextLine();
				Tablet tablet = new Tablet(name, price, company, date);
				System.out.println(tablet.toString());
				System.out.println(tablet.dispMedicineInfo());
				break;
			case 2:
				System.out.println("Syrup");
				System.out.println("Enter Medicine Name");
				name = sc.nextLine();
				System.out.println("Enter Medicine Price");
				price = Double.parseDouble(sc.nextLine());
				System.out.println("Enter Medicine Company");
				company = sc.nextLine();
				System.out.println("Enter Medicine ExpiryDate");
				date = sc.nextLine();
				Syrup syrup = new Syrup(name, price, company, date);
				System.out.println(syrup.toString());
				System.out.println(syrup.dispMedicineInfo());
				break;
			case 3:
				System.out.println("Ointment");
				System.out.println("Enter Medicine Name");
				name = sc.nextLine();
				System.out.println("Enter Medicine Price");
				price = Double.parseDouble(sc.nextLine());
				System.out.println("Enter Medicine Company");
				company = sc.nextLine();
				System.out.println("Enter Medicine ExpiryDate");
				date = sc.nextLine();
				Ointment ointment = new Ointment(name, price, company, date);
				System.out.println(ointment.toString());
				System.out.println(ointment.dispMedicineInfo());
				break;
			}
		}
	}
}