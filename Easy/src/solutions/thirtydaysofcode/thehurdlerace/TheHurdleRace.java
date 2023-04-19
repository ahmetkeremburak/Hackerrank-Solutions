package solutions.thirtydaysofcode.thehurdlerace;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Kerem
 * <p>
 * A video player plays a game in which the character competes in a hurdle race.
 * Hurdles are of varying heights, and the characters have a maximum height they can jump.
 * There is a magic potion they can take that will increase their maximum jump height by 1 unit
 * for each dose. How many doses of the potion must the character take 
 * to be able to jump all of the hurdles.
 * If the character can already clear all of the hurdles, return 0.
 *</p>
 */
public class TheHurdleRace {

	
	/**
	 * @param args
	 * @throws IOException
	 * <p>
	 * If you are a newbie like I was, you might want to check out "environmental variables"
	 * which are used in this example. If the environmental variable for "OUTPUT_PATH" is not defined
	 * for your IDE, then you will not be able to run this code on your own IDE.
	 * </p>
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$","").split(" ");
		
		int n = Integer.parseInt(firstMultipleInput[0]);
		
		int k = Integer.parseInt(firstMultipleInput[1]);
		
		List<Integer> height = Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		int result = TheHurdleRace.hurdleRace(k, height);
		
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedReader.close();
		bufferedWriter.close();

	}
	
	public static int hurdleRace(int k, List<Integer> heights) {
		int result = Collections.max(heights) - k;
		if(result >= 0) {
			return result;
		}
		else {
			return 0;
		}
	}

}
