package solutions.conditionals;
import java.io.*;
/**
 * @author Kerem
 *<p>
 *Given an integer, n, perform the following conditional actions:
 *If n is odd, print Weird
 *If n is even and in the inclusive range of 2 to 5, print Not Weird
 *If n is even and in the inclusive range of 6 to 20, print Weird
 *If n is even and greater than 20, print Not Weird
 *Complete the stub code provided in your editor to print whether or not is weird.
 *</p>
 */
public class IntroToConditionals {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        switch (N%2) {
		case 0:
			if(N >= 2 && N <= 5) System.out.println("Not Weird");
			else if(N >= 6 && N <= 20) System.out.println("Weird");
			else System.out.println("Not Weird");
			break;

		default:
			System.out.println("Weird");
			break;
		}

        bufferedReader.close();

	}

}
