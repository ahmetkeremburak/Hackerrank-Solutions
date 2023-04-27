package solutions.thirtydaysofcode.inheritance;

import java.io.*;

/**
 * You are given two classes, Person and Student,
 * where Person is the base class and Student is the derived class.
 * Observe that Student inherits all the properties of Person.
 * Complete the Student class by writing the following:
 * A Student class constructor, which has 4 parameters:
 * A string firstName,
 * A string lastName,
 * An integer idNumber,
 * An integer array (or vector) of test scores,
 * 
 * A char calculate() method that calculates a Student object's average
 * and returns the grade character representative of their calculated average.
 * Grade representations are arbitrary.
 * 
 * @author Ahmet Kerem Burak keremburak00@gmail.com
 *
 */
public class Solution {

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] personInfo = reader.readLine().trim().split(" ");
		
		int numberOfTests = Integer.parseInt(reader.readLine().trim());
		
		String[] studentInfo = reader.readLine().trim().split(" ");
		
		int[] scores = new int[studentInfo.length];
		
		for(int i = 0; i < studentInfo.length; i++) {
			scores[i] = Integer.parseInt(studentInfo[i]);
		}
		
		String firstName = personInfo[0];
		String lastName = personInfo[1];
		int idNumber = Integer.parseInt(personInfo[2]);
		
		Student student = new Student(firstName, lastName, idNumber, scores);
		
		System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
        System.out.println("Grade: " + student.calculate());
		
		reader.close();

	}
	
	static class Student extends Person{
		int[] scores;
		
		Student(String firstName, String lastName, int idNumber, int[] scores){
			super(firstName, lastName, idNumber);
			this.scores = scores;
		}
		
		char calculate() {
			int sum = 0;
			for(int i = 0; i < this.scores.length; i++) {
				sum += this.scores[i];
			}
			int average = sum / this.scores.length;
			
			if(average >= 90) {
				return 'O';
			}
			else if(average >= 80) {
				return 'E';
			}
			else if(average >=70) {
				return 'A';
			}
			else if(average >= 55) {
				return 'P';
			}
			else if(average >= 40) {
				return 'D';
			}
			else {
				return 'T';
			}
		}
	}
	static class Person {
		String firstName;
		String lastName;
		int idNumber;
		Person(String firstName, String lastName, int idNumber){
			this.firstName = firstName;
			this.lastName =lastName;
			this.idNumber =idNumber;
		}
	}

}

