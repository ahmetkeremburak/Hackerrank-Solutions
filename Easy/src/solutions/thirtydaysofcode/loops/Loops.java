package solutions.thirtydaysofcode.loops;

import java.io.*;

/**
 * @author Kerem
 * <p>
 * Given an integer, "n" , print its first 10 multiples.
 * Each multiple "n x i" (where 1 <= i <= 10 ) should be printed on a new line in the form: 
 * n x i = result.
 * </p>
 */
public class Loops {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x " + i + " = " + (n * i) + "%n", n);
		}

	}

}
