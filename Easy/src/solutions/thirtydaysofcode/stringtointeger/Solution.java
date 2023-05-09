package solutions.thirtydaysofcode.stringtointeger;
import java.io.*;

/**<p>
 * Input is read from console as a String. Then parsed into Integer.
 * If input is not an integer, an exception occurs. Try-Catch block catches the said exception
 * and prints out "Bad String".
 * </p>
 * @author Burak, Ahmet Kerem
 *
 */
public class Solution {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		
		try {
			String S = bufferedReader.readLine();
			int i = Integer.parseInt(S);
			bufferedReader.close();
			System.out.println(i);
		}catch (NumberFormatException e) {
			System.out.println("Bad String");
		}
		
		catch (IOException e) {
			System.out.println("Bad String");
		}
	}

}
