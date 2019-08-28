
public class even_odd {
	public static void main(String[] args) {
		int num = 16;
		if (num % 2 ==0) {
			System.out.println("Even number : " +num);
		}
		else {
			System.out.println("Odd number : " + num);
		}
		
		int number = 7;
		String output = (number % 2 == 0)? "even number" : "odd number";
		System.out.println(output);
	}

}
