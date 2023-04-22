package solutions.thirtydaysofcode.recursion;

import java.io.*;

/**
 * Calculates factorial of a given number, using a recursive method.
 * 
 * @author Ahmet Kerem Burak keremburak00@gmail.com
 */
public class Result {
	
	
	public static int factorial(int n) {
		if(n == 1) {
			return n;
		}
		else {
			return n*factorial(n-1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		
		int result = Result.factorial(n);
		
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedReader.close();
		bufferedWriter.close();
	}
}
