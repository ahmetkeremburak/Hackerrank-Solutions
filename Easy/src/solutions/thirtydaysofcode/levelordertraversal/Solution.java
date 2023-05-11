package solutions.thirtydaysofcode.levelordertraversal;

import java.util.*;


/**
 * <p>
 * A binary tree is formed from console input.
 * levelOrder() method takes root node as a parameter and
 * writes a level order traversal of the binary tree to the console output.
 * </p> 
 * @author Burak, Ahmet Kerem
 *
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
        sc.close();
	}
	
	static void levelOrder(Node root) {
		Queue<Node> que = new LinkedList<>();
		if(root == null) {
			return;
		}
		else {
			que.add(root);
			while(!que.isEmpty()) {
				Node temp = que.poll();
				System.out.printf("%d ",temp.data);
				if(temp.left != null) {
					que.add(temp.left);
				}
				if(temp.right != null) {
					que.add(temp.right);
				}
			}
		}
		
	}

	static Node insert(Node root, int data) {
		if(root == null) {
			return new Node(data);
		}
		else {
			Node cur;
			if(data <= root.data){
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
	Node right, left;
	int data;
	Node(int data){
		this.data = data;
		left = right = null;
	}
}
