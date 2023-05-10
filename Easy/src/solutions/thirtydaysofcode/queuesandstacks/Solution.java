package solutions.thirtydaysofcode.queuesandstacks;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.io.*;

/**
 * <p>
 * Using a stack and a queue, find if a given word is a palindrome or not.
 * Since stacks work with FILO and queues work with FIFO,
 * when a word is put into these data structures by using deque and pop functions respectively,
 * we can find if a word is palindrome or not.
 * </p>
 * @author Burak, Ahmet Kerem
 *
 */
public class Solution {

	static Stack<Character> stack = new Stack<Character>();
	static Queue<Character> queue = new ConcurrentLinkedQueue<Character>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String s = reader.readLine().toLowerCase().trim();
		
		for(int i = 0; i < s.length();i++) {
			pushCharacter(s.charAt(i));
			enqueCharacter(s.charAt(i));
		}
		
		while(stack.empty() == false) {
			if(popCharacter() != dequeCharacter()) {
				System.out.printf("the word, %s, is not a palindrome.",s);
				break;
			}
			else {
				if(stack.empty()) {
					System.out.printf("The word, %s, is a palindrome.",s);
				}
			}
		}

	}
	
	public static void pushCharacter(char c) {
		stack.push(c);
	}
	
	public static void enqueCharacter(char c) {
		queue.add(c);
	}
	
	public static char popCharacter() {
		return stack.pop();
	}
	
	public static char dequeCharacter() {
		return queue.poll();
	}

}
