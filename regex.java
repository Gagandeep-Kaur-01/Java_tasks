import java.util.regex.*;

public class regex {
 
 public static void main(String args[]){
	 
// first way...........................................

 Pattern p = Pattern.compile("..m");
 Matcher m = p.matcher("aim");
 boolean b1 = m.matches();
 System.out.println(b1);
 
 // Second way...........................
 
 boolean b2 = Pattern.compile("..m").matcher("madam").matches();
 System.out.println(b2);
 
 // Third way......................................
 
 boolean b3 = Pattern.matches(".m", "am");
 System.out.print(b3 + "\n");
 
 // Another way
 
 System.out.print(Pattern.matches("[abc]", "bcd") + "\n");
  System.out.print(Pattern.matches("[abc]", "b") + "\n"); // only matches single character
   System.out.print(Pattern.matches("[^abc]", "b")+ "\n" ); // any character leaving a, b and c  (false)
    System.out.print(Pattern.matches("[^abc]", "f")+ "\n");  //(true)
	  System.out.print(Pattern.matches("[a-zA-Z]", "g")+ "\n");
	    System.out.print(Pattern.matches("[^a-zA-Z]", "7")+ "\n");
		
		
System.out.print(Pattern.matches("[GK][a-z]{4}", "Gagan")+ "\n");		
		
// quantifiers		
System.out.println(Pattern.matches("[xyz]?", "x"));	//whether x occurs once or not
  // [x]? quantifier means x should occurs 1 or 0, not at all	
	System.out.println(Pattern.matches("[xyz]?", "xx"));	

// [x]+, x occurs once or more times
System.out.println(Pattern.matches("[xyz]+", "x"));	
System.out.println(Pattern.matches("[xyz]+", "xxxyyyzzz"));	
System.out.println(Pattern.matches("[xyz]+", "yyyzzz"));
System.out.println(Pattern.matches("[xyz]", "z"));	
 
 //[x]* x occurs zero or more times
 System.out.println(Pattern.matches("[xyz]*", "xxyyp"));	// either the value should occurs more than one or not occur
  System.out.println(Pattern.matches("[xyz]*", "xxyyzz"));
  
// metacharacters

 System.out.println(Pattern.matches("\\d", "xxyyp"));  
  System.out.println(Pattern.matches("\\d", "1")); 
  System.out.println(Pattern.matches("\\d", "1a")); 
  
  System.out.println(Pattern.matches("\\D", "xxyyp"));  
  System.out.println(Pattern.matches("\\D", "1")); 
  System.out.println(Pattern.matches("\\D", "a")); 
  
 // to match length of characters
   System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "gagan7")); 
 }
}