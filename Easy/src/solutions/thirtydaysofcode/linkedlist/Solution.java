package solutions.thirtydaysofcode.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * Task is to write a Node to be used in a Linked List class. Nodes should have an integer variable
 * named "data", and an instance of Node class which points to next node called "next".
 * Linked List should have a pointer "head" to show the beginning of the list.
 * 
 * Input is given from console. First line of input "T" shows the number of elements to be added
 * to the list. Next lines are numbers to be added in order. Linked List should have a function
 * to add elements and to print out the list at the end.
 * </p>
 * @author Burak, Ahmet Kerem
 *
 */
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// First line is number of elements to come
		int T = Integer.parseInt(reader.readLine().trim());
		
		CustomLinkedList list = new CustomLinkedList();
		//While loop to add elements in necessary number
		while(T > 0) {
			list.Add(Integer.parseInt(reader.readLine().trim()));
			T--;
		}
		
		list.printList();

	}
	// Structure of a node. Every node is defined by data and a next pointer
	static class Node{
		int data;
		Node next;
		
		Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
	}

	/**
	 * List has pointers for its first element "head" and last element "tail".
	 * Size of the list is irrelevant for the task but I like to keep tabs on numbers.
	 * 
	 */
	static class CustomLinkedList{
		Node head;
		Node tail;
		int size;
		
		//Creates a new node with given data and adds it to the end of the list
		void Add(int i) {
			Node newNode = new Node(i, null);
			
			if(this.head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				Node temp = head;
				
				while(temp.next != null) {
					temp = temp.next;
				}
				
				temp.next = newNode;
				tail = newNode;
			}
			
			this.size++;
		}
		
		// Prints the list to console in desired format
		void printList() {
			if(this.head == null) {
				System.out.println();
			}
			else {
				Node temp = head;
				while(temp.next != null) {
					System.out.print(temp.data + " ");
					temp = temp.next;
				}
				System.out.print(temp.data);
			}
		}
	}

}
