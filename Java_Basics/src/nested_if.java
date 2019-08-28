
public class nested_if {
 public static void main(String[]args) {
	 
	 int age = 20;
	 int weight =  60;
	 
	 if (age > 18) {
		 if (weight > 50) {
			 System.out.println("You are eligible to donate blood");
		 }
		 else {
			 System.out.println("You are not eligible to donate blood");
		 }
	 }
	 
	 else {
		 System.out.println("Age must be greater than 18");
	 }
	 
	 // Another way :
	 
if ((age > 18) && (weight > 50)) {
	System.out.println("You are eligible to donate blood. Your age is : " +age + " and weight is :" +weight);
}
else {
	 System.out.println("You are not eligible to donate blood");
}
	 
 }
}
