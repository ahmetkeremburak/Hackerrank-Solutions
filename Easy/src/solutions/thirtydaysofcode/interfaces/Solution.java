package solutions.thirtydaysofcode.interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * Complete the implementation of Calculator class,
 * which implements the AdvancedArithmetic interface.
 * The implementation for the divisorSum(n) method must return the sum of all divisors of n.
 * </p>
 * @author Burak, Ahmet Kerem
 *
 */
public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String S = bufferedReader.readLine();
		int i = Integer.parseInt(S);
		Calculator cal = new Calculator();
		
		System.out.println("I implemented: AdvancedArithmetic");
		int sum = cal.divisorSum(i);
		System.out.printf("%d",sum);
		
		bufferedReader.close();

	}
	
	static class Calculator implements AdvencedArithmetic{

		@Override
		public int divisorSum(int n) {
			int divisor = n;
			int sum = 0;
			while(divisor > 0) {
				if(n % divisor == 0) {
					sum += divisor;
					divisor--;
				}
				else {
					divisor--;
				}
			}
			
			
			return sum;
		}
		
	}
	
	interface AdvencedArithmetic {
		int divisorSum(int n);
	}

}
