public class Singleton 
{
	 public String s;
     static Singleton sin = new Singleton();      // create static instance of a class

        private Singleton()     // create private constructor of a class
	 {
	
	 s = "Hello";
	 }
	 
	 public static Singleton getInstance()   // create static method, which returns object
	 {
	 return sin;
	 }
	 
	  protected static void method( ) {
      System.out.println("Singleton program");
   }
	 
}