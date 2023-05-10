package solutions.thirtydaysofcode.moreexceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String S = bufferedReader.readLine();
		int i = Integer.parseInt(S);
		Calculator cal = new Calculator();
		while(i > 0) {
			String line = bufferedReader.readLine();
			String[] elements = line.replaceAll("\\s+$","").split(" ");
			int n = Integer.parseInt(elements[0]);
			int p = Integer.parseInt(elements[1]);
			
			try {
				System.out.println(cal.power(n, p)); 
			} catch (NegativeNumberException e) {
				e.message();
			}
			
			i--;
		}
		
		bufferedReader.close();

	}
	
	static class NegativeNumberException extends Exception{
		NegativeNumberException(String str){
			super(str);
		}
		
		void message() {
			System.out.println("n and p should be non-negative");
		}
	}
	
	static class Calculator{
		
		int power(int n, int p) throws NegativeNumberException {
			
			if(n<0 || p<0) {
				throw new NegativeNumberException("n and p should be non-negative");
			}
			else {
				return (int) Math.pow(n, p);
			}
			
		}
	}

}
