
public class loops {
/* loops are used to execute a set of instructions/ functions repeatedly
	when some conditions become true.
	Loops are is used to iterate a part of the program several times.
	for loop : If the no. of iteration is fixed, it is recommended to use for loop.
	while loop : If the no. of iterations is not fixed, it is recommended to use while loop.
	do-while loop : Use it, if the no. of iteration is not fixed and you must have to execute the loop at least once.        
	for-each loop : used to traverse array or collection in java.
	                There is no need to increment value and use subscript notation.
	labeled for loop : In order to name of each Java for loop, use label before the loop.
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
	// ##########################################################
		System.out.println('\n' +"Use of labeled for loop");
		// Using label for outer and for loop
		aa: 
			for(int i=1;i<=3;i++) {
				bb:
					for(int j=1;j<=3;j++) {
						if(i==2&&j==2) {
							//break aa;  // Usually, break and continue keywords breaks/ continues the innermost for loop only.
							break bb;  //it will break inner loop only which is the default behaviour of any loop.
							   
						}
						System.out.println(i+"   "+j);
					}
			}
		
	}
}
