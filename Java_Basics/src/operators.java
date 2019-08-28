
public class operators {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		int product = a*b++; // using pre-increment operator and multiplication operator.
		System.out.println(product);  
		
		int multipli = a*++b; //using post-increment operator and multiplication operator.
	
		System.out.println(multipli);  
		
		System.out.println("value of a :" +a); 
		System.out.println("value of a after post-decrement:" +a--); 
		System.out.println("value of a after pre-decrement:" + --a); 
		
		System.out.println(b);
		System.out.println(b<<2);// left shift operator << is used to shift all the bits in a value to the left side
		  // of a specified no. of times.
		
		int c = 10;
		System.out.println(c<<2); // 10*2^2=10*4=40.
		System.out.println(c<<3);//10*2^3=10*8=80.
		
		System.out.println(c>>2); // 10/2^2=10/4=2.
		//right shift operator >> is used to move left operands value to right by the number of bits specified by the right operand.
		
		// Java Shift operator >> vs >>>
		System.out.println(c>>2); 
		System.out.println(c>>>2); 
		  //For positive number, >> and >>> works same  
		System.out.println(-c>>2); 
		System.out.println(-c>>>2); 
	    //For negative number, >>> changes parity bit (MSB) to 0  
	
	int x = 2;
	int y = 5;
	int min = (x<y)?x:y;  // Ternary operator
	System.out.println(min);
	x+=4; //x=x+4=2+4=6; // Assignment operator
	System.out.println(x);
	y-=4; //=y-4= 5-4=1; // Assignment operator
	System.out.println(y);
	
	
	int p = 10;
	int q = 5;
	int r = 20;
	System.out.println(p<q&&p<r);   // false && true = false
	System.out.println(p < q && p++ < r);  // false && true = false
	
	System.out.println(p); //  because second condition is not checked ; p=10; 
	System.out.println(p>q||p<r);//true || true = true  
	
	
	//|| vs |  
	System.out.println(p>q||p++<r);//true || true = true  
	System.out.println(p);//10 because second condition is not checked  
	System.out.println(p>q|p++<r);//true | true = true  
	System.out.println(p);//11 because second condition is checked 
	
	System.out.println("value of p : " +p);
	System.out.println("value of q : "+q);
	int ternary = (p<q)?p:q;
	System.out.println("min is : " +ternary);
	int ter = (p>q)?p:q;
	System.out.println("max is : " +ter);
	}
	
	
}
