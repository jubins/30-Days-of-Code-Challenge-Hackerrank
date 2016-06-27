//Day 23: Binary Search Tree Level Order Traversal Solution. 30- Days-of-Code Hackerrank Solution
//This program gives elemenets of the Binary Search Tree as per their level.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class testsums{
	//Write your code here
	static void levelOrder(Node root){
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			Node current = queue.remove();
			System.out.print(current.data+" ");
			
			if(current.left != null) queue.add(current.left);
			if(current.right != null) queue.add(current.right);
		}
	}
	

public static Node insert(Node root,int data){
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

public static void main(String args[]){
            @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}