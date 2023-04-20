package solutions.thirtydaysofcode.dictionariesandmaps;
import java.io.*;
import java.util.*;

/**
 * Given "n" names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
 * You will then be given an unknown number of names to query your phone book for.
 * For each "name" queried, print the associated entry from your phone book on a new line 
 * in the form "name=phoneNumber"; if an entry for "name" is not found, print "Not found" instead.
 * Note: Your phone book should be a Dictionary/Map/HashMap data structure. 
 * 
 * @author Ahmet Kerem Burak keremburak00@gmail.com
 *
 */
public class Solution {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine().trim());
		HashMap<String, String> phoneMap = new HashMap<String, String>();
		String name;
		String number;
		
		for(int i = 0; i < n; i++) {
			String[] pairs = reader.readLine().split(" ");
			phoneMap.put(pairs[0], pairs[1]);
		}
		
		
		while((name = reader.readLine()) != null) {
			
			number = phoneMap.get(name);
			if (number != null) {
				System.out.printf("%s=%s\n",name, number );
			}
			else {
				System.out.println("Not found");
			}
		}
		
		reader.close();
	}
}
