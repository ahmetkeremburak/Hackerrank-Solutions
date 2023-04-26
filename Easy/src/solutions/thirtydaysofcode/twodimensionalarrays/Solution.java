package solutions.thirtydaysofcode.twodimensionalarrays;

import java.util.*;
import java.util.stream.*;
import java.io.*;


/**
 * Given a 6x6 two dimensional array "A",
 * Calculate the hourglass sum for every hourglass in A,
 * then print the maximum hourglass sum.
 * We define an hourglass in A to be a subset of values
 * with indices falling in this pattern in A's graphical representation:
 * <p>
 * a b c
 *   d
 * e f g
 * </p>
 * @author Ahmet Kerem Burak keremburak00@gmail.com
 *
 */
public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		List<List<Integer>> arr = new ArrayList<>();
		
		IntStream.range(0,6).forEach( i -> {
			try {
				arr.add(
						Stream.of(bufferedReader.readLine().replaceAll("\\s+$","").split(" "))
						.map(Integer::parseInt)
						.collect(Collectors.toList())
						);
			} catch(IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		
		
		int maxSum = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				int hourglassSum = arr.get(i).get(j) + arr.get(i).get(j + 1) +arr.get(i).get(j + 2)
													+ arr.get(i + 1).get(j + 1)
									+ arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
				if(hourglassSum > maxSum) {
					maxSum = hourglassSum;
				}
			}
		}
		
		bufferedReader.close();

	}

}
