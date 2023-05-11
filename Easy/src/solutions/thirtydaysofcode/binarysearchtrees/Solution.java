package solutions.thirtydaysofcode.binarysearchtrees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * The height of a binary search tree is the number of edges between the tree's root
 * and its furthest leaf. You are given a pointer, root,
 * pointing to the root of a binary search tree.
 * Complete the getHeight function provided in your editor
 * so that it returns the height of the binary search tree.
 * </p>
 * @author Burak, Ahmet Kerem
 *
 */
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Node root=null;
        int T=Integer.parseInt(br.readLine());
        while(T-->0){
            int data=Integer.parseInt(br.readLine());
            root=insert(root,data);            
        }
        int height=getHeight(root);
        System.out.println(height);

	}
	
	static int getHeight(Node root){
	      if(root == null) {
	    	  // If 0 is returned, root is also counted as a depth. 
	    	  return -1;
	      }
	      else {
	    	  //Beware Recursion
	    	  	int lHeight = getHeight(root.left);
	    	  	int rHeight = getHeight(root.right);
	    	  	
	    	  	if(lHeight > rHeight) {
	    	  		return lHeight + 1;
	    	  	}
	    	  	else {
	    	  		return rHeight + 1;
	    	  	}
	      }
	    }
	
	static Node insert(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

}

class Node{
    public Node left,right;
    public int data;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
