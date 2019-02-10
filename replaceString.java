import java.util.Scanner;

public class replaceString {

public static void main(String [] args){
	
// replace() method	
	
 String a = "Hello! World";
	String b = a.replace("!", ".");
	 System.out.println(b);
   System.out.println("I don't like these \"double\" quotes".replace("\"", ""));
   

String name = "My name is Gagandeep Kaur";
System.out.println("Your Name :" +name);
System.out.println("Your Name :" +name.replace("Gagandeep", " "));

String st = "HTML|CSS|BOOTSTRAP";
st = st.replace('|', ',');
System.out.println(st);



// replaceAll() method
Scanner sc = new Scanner(System.in);
System.out.println("Enter Source Term :");
String source = sc.nextLine();

System.out.println("Enter Search Term :");
String search = sc.nextLine();
search = "(?i)"+search; //(?i) to search term.
// This is to pass regex to match strings with case insensitive way. 

System.out.println("Enter Replace Term :");
String replace = sc.nextLine();

String result = source.replaceAll(search, replace);
System.out.println("Result Term :" +result);

sc.close();

// replaceFirst() method
        String str = "My Name is Gagandeep Kaur";
		str = str.replaceFirst("(?i)"+"Gagan", "Raman");
		System.out.println(str);
}
}