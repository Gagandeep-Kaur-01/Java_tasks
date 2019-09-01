
public class loops {
/* loops are used to execute a set of instructions/ functions repeatedly
	when some conditions become true.
	Loops are is used to iterate a part of the program several times.
	for loop : If the no. of iteration is fixed, it is recommended to use for loop.
	while loop : If the no. of iterations is not fixed, it is recommended to use while loop.
	do-while loop : Use it, if the no. of iteration is not fixed and you must have to execute the loop at least once.        
	for-each loop : used to traverse array or collection in java.
	                There is no need to increment value and use subscript notation.
	*/
	
	public static void main(String[]args) {
		int count = 5;
		
		System.out.println("Use of for loop");
		for(int i=1; i<=count;i++) {
			for(int j=count; j>=i; j--) {
				System.out.print("*");
				//System.out.println("*");
		}
		System.out.println(); // new line	
		}
	// ######################################################	
		System.out.println('\n' +"Use of for-each loop");
			/*for(Type var : array) {
			 code to be executed 
			  } */
		int arr[]= {2,4,6,8,10}; //declaring an array
		for(int i:arr) {  //printing an array using for-each loop
			System.out.println(i);
		}
	}
}
