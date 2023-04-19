package solutions.thirtydaysofcode.classvsinstance;

import java.io.*;
import java.util.*;

/**
 * @author Kerem
 *<p>
 * Write a Person class with an instance variable,*age*,
 * and a constructor that takes an integer, *initialAge*, as a parameter.
 * The constructor must assign to after confirming the argument passed as is not negative;
 * if a negative argument is passed as *initialAge*, the constructor should set to "0"
 * and print "Age is not valid, setting age to 0.".
 * In addition, you must write the following instance methods:
 * yearPasses() should increase the instance variable by 1.
 * amIOld() should perform the following conditional actions:
    If age < 13, print "You are young.".
    If age >= 13 and age < 18, print "You are a teenager.".
    Otherwise, print "You are old.".
    
 * Problem is HackerRank failed to provide the code stub to take input and run the program.
 * I have modified the code to fit into their test cases. 
 *</p>
 */
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		
		int T = Integer.parseInt(input.readLine().trim());
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < T; i++) {
			list.add(Integer.parseInt(input.readLine().trim()));
		}
		
		for (Integer age : list) {
			Person person = new Person(age);
			person.amIOld();
			person.yearPasses(3);
			person.amIOld();
			System.out.println();
			
		}
		
		input.close();
		
		

	}
	
	static class Person {
		int age;
		
		Person(int initialAge){
			
			if(initialAge > 0 ) {
				this.age = initialAge;
			}
			else {
				System.out.println("Age is not valid, setting age to 0.");
				this.age = 0;
			}

		}
		
		void yearPasses(int year) {
			this.age = this.age + year;
		}
		
		void amIOld() {
			if(this.age < 13) {
				System.out.println("You are young.");
			}
			else if(this.age >= 13 && this.age < 18) {
				System.out.println("You are a teenager.");
			}
			else {
				System.out.println("You are old.");
			}
		}
	}

}
