/*import java.util.Scanner;
import java.lang.*;

public class diagnolDiff {

public static void main(String args[]) {
int r, c, i, j, d1=0, d2=0, diff=0;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of rows and columns:");
r=c = in.nextInt();
//c = in.nextInt();

int matrix[][] = new int[r][c];
System.out.println("Elements of matrix:");
for(i=0; i<r; i++)
{
	for(j=0; j<c; j++)
	{
 matrix[i][j]=in.nextInt();
	}
}
System.out.print("Elements of matrix :");
for(i=0; i<r; i++)
{
	for(j=0;j<c;j++)
	{
		System.out.println(matrix[i][j]);
	}
}
for(i=0;i<r;i++)
{
	for(j=0;j<c;j++){
		if(i==j)
		{
			d1 = d1+matrix[i][j];
		}
		
// to calculate the sum elementscof secondary diagnol
 if((i+j)== (c-1))
 {
 d2 = d2+ matrix[i][j];
 }	 
		
	}
}

System.out.println("Sum of elements of left-right diagnol is :" +d1);
System.out.println("Sum of elements of right-left diagnol is :" +d2); 

diff = d1-d2;
System.out.println("Difference of sum between two diagonals are:" + Math.abs(diff ));


}
}  */

// Another way hackerrank.com
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class diagnolDiff {

 
    static int diagonalDifference(int[][] arr) {
int d1 = 0, d2 = 0;
    
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    d1 = d1 + arr[i][j];
                }

                // to calculate the sum elements of secondary diagnol
                if ((i + j) == (arr.length - 1)) {
                    d2 = d2 + arr[i][j];
                }

            }  
        
        }
    return Math.abs(d1 - d2);
   }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

 