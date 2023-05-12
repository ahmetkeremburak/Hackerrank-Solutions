package solutions.thirtydaysofcode.runningtime;

import java.util.Scanner;

/**
 * <p>
 * A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 * Given a number, n, determine and print whether it is "Prime" or "Not Prime".
 * If possible, try to come up with a O(n^1/2)primality algorithm,
 * or see what sort of optimizations you come up with for an O(n) algorithm.
 * </p>
 * @author Burak, Ahmet Kerem
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T --> 0){
            int num =sc.nextInt();
            System.out.println(isPrime(num));
        }

	}

	private static String isPrime(int num) {

		if(num <= 1) {
			return "Not prime";
		}
		else{
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					return "Not prime";
				}
			}
			return "Prime";
			
		}
	}

}
