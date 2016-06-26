//Day 22: Binary Search Tree Solution. 30- Days-of-Code Hackerrank Solution
//This program finds height of Binary Search Tree with root and without root.

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class BinarySearchTree{

public static int getHeight(Node root){
//Height without root.
    if(root==null){
    	return -1;
    }
    
	return (Math.max(getHeight(root.left),getHeight(root.right))+1);
    
}
/*	Height from root
	if(root == null){
	    return 0;
	}
	
	else{
		return (Math.max(getHeight(root.left),getHeight(root.right))+1);
	}
	
}
*/
    


public static Node insert(Node root,int data){
	//Write your code here.
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
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            
            int height=getHeight(root);
            System.out.println(height);
        }	
}