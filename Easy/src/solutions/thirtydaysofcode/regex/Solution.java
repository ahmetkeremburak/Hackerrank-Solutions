package solutions.thirtydaysofcode.regex;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;



/**
 * @author Burak, Ahmet Kerem keremburak00@gmail.com
 * 
 * Challenge is about using regex to filter entry to bein desired format.
 * Entries are read through console, filtered with a regex string using pattern-matcher
 * Approved entries are listed in an ArrayList
 * ArrayList is sorted via Collections method sort(), traversed through a ListIterator object.
 * 
 *
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> names = new ArrayList<String>();
        
        String mail = "\\b[\\w.+-]+@gmail\\.com\\b";
        Pattern p = Pattern.compile(mail);
        
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                
                Matcher m = p.matcher(emailID);
                
                if(m.matches()) {
                	names.add(firstName);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        

        Collections.sort(names);
        ListIterator<String> nl = names.listIterator();
        
        while(nl.hasNext()) {
        	System.out.println(nl.next());
        }

        bufferedReader.close();
    }
}