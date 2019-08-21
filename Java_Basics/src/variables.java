
public class variables {
	public static void main(String[]args) {
		int a = 10;  //instance variable: A variable declared inside the class but outside the body of the method.
		             // They are called so because their values are instance specific and are not shared among instances.
		
		int m = 20;
		System.out.println(a);
		System.out.println(m);
		
	}


void method() {
	int c = 30; //local variable : which is declared inside the body of the method.
	// This variable can only be used within the method,
	// and the other methods in the class aren't even aware that the variable exists.
	int m = 5;
	int x = m+c;
	System.out.println(x);
}
	
}
// A variable which is declared as static is called static variable. 
//  It cannot be local. You can create a single copy of static variable and share among all the instances of the class. 
// Memory allocation for static variable happens only once when the class is loaded in the memory.