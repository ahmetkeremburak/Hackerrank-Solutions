package solutions.thirtydaysofcode.binarynumbers;

import java.io.*;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		
		String binary = Integer.toBinaryString(n);
		char[] binaries = binary.toCharArray();
		
		int result = 0;
		int counter = 0;
		for(char c : binaries){
			
		}
		
		
		bufferedReader.close();
		bufferedWriter.close();
		

	}

}
