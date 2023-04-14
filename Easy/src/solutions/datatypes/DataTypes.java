package solutions.datatypes;
import java.util.*;

/**
 * @author Ahmet Kerem Burak keremburak00@gmail.com
 *<p>
 *This solution takes console input and adds to defined variables i, d and s.
 *Focus of this task is using Scanner class with correct data types.
 *</p>
 */
public class DataTypes {
	public static void main(String[] args) {
		
		int i = 12;
		double d = 4.0;
		String s = "HackerRank";
		Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        double doub = scn.nextDouble();
        // nextInt and nextDouble methods do not carry the scanner to next line
        // that is why a nextLine method in between is necessary to read next console string input
        scn.nextLine();
        String str = scn.nextLine();
        
        System.out.println(i +num);
        System.out.println(d + doub);
        System.out.println(s + str);
        scn.close();
	}
}
