//import java.io.*;import java.util.*;

public class StringExample {
public static void main (String [] args) {

String s1 = "Computer Science";

System.out.println("Output is : " + s1.length());       // finding length of string

System.out.println("Character at 3rd position is : " + s1.charAt(3));       // to get character at particular index

String s2 = "Engineering";
System.out.println("Concatanation : " + s1.concat(s2));

System.out.println("Index of word Science is : " + s1.indexOf("Science"));    

boolean out = "s1".equals("s2");
System.out.println("Comparision : " +out);

System.out.println("Uppercase : " + s2.toUpperCase());  

System.out.println("Replacing characters : " + s1.replace("e", "a"));  

char ch[] = s1.toCharArray();
for(char output : ch)
	System.out.println(output);
}


}