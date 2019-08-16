
import java.util.Scanner;

public class MatrixProgram {

	public static void main(String[]args) {
		int r,c;
		System.out.println("Enter the no. of rows in the matrix");
			Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();	
		
		System.out.println("Enter the no. of columns in the matrix");
		int columns = sc.nextInt();	
		
		int first[][] = new int[rows][columns];
		int second[][]=new int[rows][columns];
		int sum[][]= new int [rows][columns];
		
		System.out.println("Enter the elements of first matrix");
		
		for (r = 0; r< rows; r++) {
			for (c = 0; c< columns; c++) {
				first[r][c] = sc.nextInt();
			}
		}
				System.out.println("Enter the elements of second martix");
				for (r = 0; r< rows; r++) {
					for (c = 0; c< columns; c++) {
						second[r][c] = sc.nextInt();
			}
		}
	
		
}
}