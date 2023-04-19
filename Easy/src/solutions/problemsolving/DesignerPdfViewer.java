package solutions.problemsolving;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Kerem
 * 
 *  <p>
 *	Words in a pdf will be highlighted in a rectangle based on the highest letter. 
 *	Width of each letter is 1 mm. Hights of each letter and the word is given as parameters. 
 *  Algorithm is to calculate area of highlighted rectangle
 *  </p>  
 *
 */
class Result {
	
	public static int designerPdfViewer(List<Integer> h, String word) {
		
		char[] characters = word.toLowerCase().toCharArray();
		int highest = 0;
		
		for (char c: characters) {
			int orderNum = (int)c - 97;
			if (h.get(orderNum) > highest) {
				highest = h.get(orderNum);
			}
		}
		
		return characters.length * highest;
	}
}

public class DesignerPdfViewer {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        String word = bufferedReader.readLine();

        int result = Result.designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

	}

}
