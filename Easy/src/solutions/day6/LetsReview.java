package solutions.day6;
import java.io.*;

/**
 * @author Kerem
 *<p>
 * Given a string, S, of length that is indexed from 0 to N-1,
 * print its even-indexed and odd-indexed characters
 * as 2 space-separated strings on a single line
 *
 * Example:
 *	s = abcdef
 *	print "ace bdf"
 *
 * The first input line contains an integer, T (the number of test cases).
 * Each line i of the T subsequent lines contain a string, S . 
 *</p>
 */
public class LetsReview {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(reader.readLine().replaceAll("\\s+$", ""));
		
		for(int i = 0; i < t; i++) {
			
			String word = reader.readLine().replaceAll("\\s+$", "");
			char[] characters = word.toCharArray();
			StringBuilder even = new StringBuilder();
			StringBuilder odd = new StringBuilder();
			
			for(int j = 0; j < characters.length; j++) {
				if( j % 2 == 0) {
					even.append(characters[j]);
				}
				else {
					odd.append(characters[j]);
				}
			}
			
			System.out.printf("%s %s%n", even, odd);
		}
		
		reader.close();
	}

}
