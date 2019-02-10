import java.util.*;

public class splitString {

public static void main (String[] args){
String str = new String ("7/Feb/2019");
System.out.println("split(String regrex):");  //  splits the string into substring based on the regular expression

    String array[] = str.split("/");
    for(String out : array){
    System.out.println(out);
    }

String mgs = "helloxyzhixyzbye"; 
String a[] = mgs.split("xyz"); 
for (String st : a) 
System.out.println(st); 
	
String s = new String ("abcd");	
System.out.println("split(String regex, int limit):");
String arr[] = s.split("b", 0);
for(String output : arr) 	   {
System.out.println(output);	
}

//String Tokenizer  
String csv = "Google, Apple, Microsoft, Linux";

StringTokenizer token = new StringTokenizer(csv, ",");
while(token.hasMoreTokens()) {
System.out.println(token.nextToken());
}	



}

}
