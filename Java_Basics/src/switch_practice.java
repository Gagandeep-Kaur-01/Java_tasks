
public class switch_practice {
 public static void main (String[]args) {
	 
	 int number = 100;
	 //switch statement
	 switch(number) {
	 //case statements
	 case 10: System.out.println("Number is 10");
	 break;
	 case 5: System.out.println("Number is 5");
	 break;
	 case 0: System.out.println("Number is 0");
	 break;
	 default: System.out.println("Not entered in data"); }
	 
// Another Example *****************************************	
	 
	 int month = 4;
	 String monthString="";
	 //switch statement
	 switch(month) {
	 //case statement within switch block
	 case 1:monthString = "1 - January";
	 break;
	 case 2: monthString = "2 - February";
	 break;
	 case 3: monthString = "3-March";
	 break;
	 case 4: monthString = "4-April";
	 break;
	 case 5: monthString ="5-May";
	 break;
	 default:System.out.println("Invalid month !");
	 }
	 System.out.println(monthString);
	 }
	 
 }

