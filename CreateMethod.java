public class CreateMethod {
public static void main(String [] args) {
int a = 10;
int b = 20;
int c = maxvalue(a,b);               // method calling
System.out.println("Maximum value is : " +c);

rect r = new rect();      // calling rect class 
r.area(2,3);
 
value(2000.5);              // calling another method
 
int p = 7;
int q =8;
System.out.println("Numbers before swapping : p = " +p+ "and q =" +q);
swap(p,q);
// System.out.println("Numbers after swapping : p = " +p+ "and q =" +q);       give same values here.
 
}

//creating maxvalue function

public static int maxvalue(int n1,int n2){      // having return type int
int max ;
if (n1>n2)
max = n1;
else
max = n2;
return max;
}
/*public static int maxvalue(int a,int b){
int max ;
if (a>b)
max = a;
else
max = b;
return max;*/


// creating another method
public static void value(double points){
	if(points >= 1000.5)
		System.out.println("A");
	else if(points <= 1000.5)
		System.out.println("Null");
}

// another swap method using two variables
public static void swap(int p, int q) {
p = p+q;
q = p-q;
p = p-q;	
System.out.println("Numbers after swapping : p = " +p+ "and q =" +q); 
}

}




// creating another class and call it into main class
class rect {
	
	public static void area(int x, int y) {
		System.out.println("Area of rectangle is : " +x*y);
	}
}



