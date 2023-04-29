package solutions.thirtydaysofcode.scopes;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * Complete the Difference class by writing the following:
   - A class constructor that takes an array of integers as a parameter and saves it to the 
    "_elements" instance variable.
   - A "computeDifference" method that finds the maximum absolute difference between any
     2 numbers in "_elements" and stores it in the maximumDifference instance variable. 
 * </p>
 * @author Ahmet Kerem Burak keremburak00@gmail.com
 *
 */
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int numberOfElements = Integer.parseInt(reader.readLine().trim());
		
		List<Integer> elements = Stream.of(reader.readLine().trim().split(" "))
										.map(Integer::parseInt)
										.collect(Collectors.toList());
		
		Difference diff = new Difference(elements);
		
		diff.computeDifference(numberOfElements);
		
		System.out.printf("%d", diff.getMaximumDifference());
	}
	
	static class Difference {
		List<Integer> _elements;
		int maximumDifference;
		
		Difference(List<Integer> _elements){
			this._elements = _elements;
		}
		
		void computeDifference(int numberOfElements) {
			this._elements.sort(null);
			
			this.maximumDifference = _elements.get(numberOfElements - 1) - _elements.get(0);
		}
		
		int getMaximumDifference() {
			return this.maximumDifference;
		}
	}

}
