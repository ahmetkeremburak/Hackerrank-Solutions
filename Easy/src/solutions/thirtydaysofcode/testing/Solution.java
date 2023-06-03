package solutions.thirtydaysofcode.testing;
import java.util.*;
import java.util.stream.*;
import java.io.*;

/**
 * @author Ahmet Kerem Burak keremburak00@gmail.com
 * 
 * <p>
 * In this challenge we write test cases for a testing algorithm that is already written.
 * How ever the input on Hackerranks side is broken. So I am writing my code here. However
 * for the actual solution, I've sent hardcoded arrays that fit the description. Overall, this
 * challenge is fairly broken. Code stub in main method is unchanged. 
 * </p>
 *
 */
public class Solution {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

class TestDataEmptyArray{
	static int[] get_array() {
		int[] arr = {};
		return arr;
	}
}

class TestDataUniqueValues {
	
//	Returns array with random number of unique elements
	static int[] get_array() {
		Random random = new Random();
		int arrSize = random.nextInt(10) + 2;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int [] result = new int[arrSize];
		
//		Creates elements and if unique adds them to ArrayList
		for (int i = 0; i < arrSize; i++) {
			int element = random.nextInt(100);
			
			if(!arr.contains(element)) {
				arr.add(element) ;
			}	
		}
//		Streams Integer Arraylist into an int Array
		result = arr.stream()
				.mapToInt(Integer::intValue)
				.toArray();
		
		return result;
	}
	
//	Returns index of smallest number from given Array
	static int get_expected_results(int[] arr) {
//		Finds min element from a streamed Array
		int min = IntStream.of(arr).min().orElse(-1);
		int ind = 0;
//		Brute-force search to find index of min element
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == min) {
				ind = i;
				break;
			}
		}
		return ind;
	}
}

class TestDataExactlyTwoDifferentMinimums {
	

//	Returns array with exactly two minimum values
	static int[] get_array() {
		Random random = new Random();
		int arrSize = random.nextInt(10) + 2;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int [] result = new int[arrSize];
		int min = 0;
//		Creates elements and if unique adds them to ArrayList
		for (int i = 0; i < arrSize; i++) {
			int element = random.nextInt(100);
			if(element < min) {
				min = element;
			}
			if(!arr.contains(element)) {
				arr.add(element) ;
			}
		}
		
//		Streams Integer Arraylist into an int Array
		result = arr.stream()
				.mapToInt(Integer::intValue)
				.toArray();
		
//		Place the second minimum value
		if(result[0] != min) {
			result[0] = min;
		}
		else {
			result[1] = min;
		}
		
		return result;
	}
	
//	Return min value which is placed at the start
	static int get_expected_result(int[] arr) {
		return 0;
	}
	
}

