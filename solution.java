import java.util.Scanner;
// https://www.hackerrank.com/challenges/repeated-string/problem
public class solution {

public static void main(String [] args) {
Scanner inp = new Scanner(System.in);
System.out.println("Enter Input String :");
String s = inp.nextLine();
int count = 0;
for(int i=0; i<s.length(); i++) {
if (s.charAt(i) == 'a')
	
count++;
}
System.out.println(count);



}

}