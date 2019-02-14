public class CreateMethod {
public static void main(String [] args) {
int a = 10;
int b = 20;
int c = maxvalue(a,b);   // method calling
System.out.println("Maximum value is : " +c);
}

//creating maxvalue function

public static int maxvalue(int n1,int n2){
int max ;
if (n1>n2)
max = n1;
else
max = n2;
return max;

/*public static int maxvalue(int a,int b){
int max ;
if (a>b)
max = a;
else
max = b;
return max;*/
}

}