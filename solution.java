import java.util.Scanner;
//import java.util.Scanner.nextInt;
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


int n = inp.nextInt();
int count1 = 0;
for(int j=0; j<(n% s.length()); j++) {
if (s.charAt(j)== 'a')
count1++;	
}
System.out.println(count);


}

}