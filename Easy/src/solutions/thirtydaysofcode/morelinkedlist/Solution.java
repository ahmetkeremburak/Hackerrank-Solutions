package solutions.thirtydaysofcode.morelinkedlist;

import java.util.*;

/**
 * Removes duplicates from an ascending order singly linked list.
 * @author Burak, Ahmet Kerem
 *
 */
public class Solution {


    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          Node head=null;
          int T=sc.nextInt();
          while(T-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
          }
          head=removeDuplicates(head);
          display(head);

   }
    
    private static Node removeDuplicates(Node head) {
		if(head == null) {
			return null;
		}
		
		Node temp = head;
		while(head.next != null) {
			if(head.data == head.next.data) {
				head.next = head.next.next;
			}
			else {
				head = head.next;
			}
		}
		
		return temp;
	}

	public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
	
	static class Node{
		Node next;
		int data;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public static Node insert(Node head,int data)
    {
       Node p= new Node(data);			
       if(head==null)
           head=p;
       else if(head.next==null)
           head.next=p;
       else
       {
           Node start=head;
           while(start.next!=null)
               start=start.next;
           start.next=p;

       }
       return head;
   }

}
