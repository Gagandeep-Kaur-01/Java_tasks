import java.util.Scanner;
class question {
public static void main(String [] args) {
	Scanner in = new Scanner(System.in);

	System.out.print("Could I call you today ?" +"\n");
	 System.out.print("Response: " );
	 String response = in.nextLine();

  if (response.equalsIgnoreCase("yes")) {
	 System.out.print("Time: " );
	 String time = in.nextLine();
	 System.out.print("Ok, Will call you at : " +time);
}
else if (response.equalsIgnoreCase("No")){
	System.out.print("Ok, Thank You");
}
   
}
}   
 