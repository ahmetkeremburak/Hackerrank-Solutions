package solutions.thirtydaysofcode.generics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * Write a generic printArray method to print out any type of input to console.
 * Which then will be called by a pre-written code stub in editor.
 * Since code stubs in hackerrank's Java editor are usually absent, I had to improvise
 * and write one for myself.
 * </p>
 * @author Burak, Ahmet Kerem
 *
 */
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bufferedReader.readLine();
		while(s != null) {
			int n = Integer.parseInt(s);
			String[] elements = new String[n];
			for(int i = 0; i < n; i++) {
				elements[i] = bufferedReader.readLine();
			}
			printArray(elements);
			s = bufferedReader.readLine();
		}
	}
	
	static <T> void printArray(T[] arr) {
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
