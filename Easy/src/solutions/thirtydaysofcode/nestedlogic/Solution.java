package solutions.thirtydaysofcode.nestedlogic;

import java.util.*;
/**
 * Your local library needs your help! Given the expected and actual return dates for a library book,
 * create a program that calculates the fine (if any). The fee structure is as follows:
 * 1. If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine = 0).
 * 2. If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, fine = 15 Hackos x the number of days late.
 * 3. If the book is returned after the expected return month but still within the same calendar year as the expected return date, fine = 500 Hackos x  the number of months late.
 * 4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.
 * 
 * @author Burak, Ahmet Kerem
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ret = new int[3];
		int[] due = new int[3];
		int fine = 0;
		
		for(int i = 0; i < ret.length; i++) {
			ret[i] = sc.nextInt();
		}
		
		for(int i = 0; i < due.length; i++) {
			due[i] = sc.nextInt();
		}
		
		if(ret[2] > due[2]) {
			fine = 10000;
		}
		else if(ret[2] < due[2]) {
			fine = 0;
		}
		else if(ret[2] == due[2]) {
			if(ret[1] > due[1]) {
				fine = (ret[1] - due[1]) * 500;
			}
			else if(ret[1] < due[1]) {
				fine = 0;
			}
			else {
				if(ret[0] <= due[0]) {
					fine = 0;
				}
				else {
					fine = (ret[0] - due[0]) * 15;
				}
			}
		}
		
		System.out.println(fine);
		sc.close();

	}

}
