
/*
 * Author : Nidhi
 * Desc : Print duration in days, months and years
 * Date : 25/10/2020
 */
import java.util.*;
import java.time.*;
public class DateDuration {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year, month, date :");
		s.close();
		String dayInput=s.nextLine();
		String monthInput=s.nextLine();
		String yearInput=s.nextLine();
		int d = Integer.parseInt( yearInput ); // enter year[ie. 1996]
		int m = Integer.parseInt( monthInput );  // 1-12 for January-December.
		int y = Integer.parseInt( dayInput );  //1-28/31 

		LocalDate date = LocalDate.of( y , m , d );
	    LocalDate now = LocalDate.now();
	     Period diff = Period.between(date, now);
	 
	     System.out.println("Difference is " + diff.getYears()+" " +"years"+ " "+
	                    diff.getMonths()+" "+"months"+" "+ diff.getDays()+" "+"days");
		 }

}