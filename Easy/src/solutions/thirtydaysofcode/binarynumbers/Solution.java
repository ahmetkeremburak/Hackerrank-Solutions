package solutions.thirtydaysofcode.binarynumbers;

import java.io.*;
import java.util.*;

/**
 * Read console input "n" which 1 <= n <= 100. Calculate the binary expression of "n",
 * write the number of most consecutive "1" in the binary expression of "n".    
 * @author Ahmet Kerem Burak keremburak00@gmail.com
 *
 */
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		
		String binary = Integer.toBinaryString(n);
		
		String[] binarySplit = binary.split("0");
		
		List<String> binaryList = Arrays.asList(binarySplit);
		
		int max = binaryList.stream().map(String::length).max(Integer::compareTo).get();
		
		bufferedWriter.write(String.valueOf(max));
		
		
		bufferedReader.close();
		bufferedWriter.close();
		

	}

}
