
public class Patterns {

public static void main(String[] args )  {
	
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
int a,b;
for(a=1; a<=5; a++) 
{
for(b=1; b<=a; b++)
{
System.out.print("#");
}
System.out.println();
}  

//System.out.println("\n");
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
for(int i=1; i<=5; i++) 
{
	for(int j=5; j>=i; j--)
	{
		System.out.print("#");
	}
	System.out.println();
}

}
}