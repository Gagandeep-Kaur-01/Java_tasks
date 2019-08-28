
public class leap_year {
	
	public static void main(String[] args) {
		int year = 2019;
		if(((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0))
		// A year is leap, if it is divisible by 4 and 400, but not by 100.
		{
		System.out.println("Leap Year : " +year);
		}
		
		else {
			System.out.println("Common Year : " +year);
		}
	}
}


