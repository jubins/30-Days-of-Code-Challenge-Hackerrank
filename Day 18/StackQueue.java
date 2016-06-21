//Day 18: Stacks and Queues Solution. 30- Days-of-Code Hackerrank Solution
//This program checks if the entered word is a Palindrome or not.


import java.util.LinkedList;
import java.util.Scanner;


public class StackQueue{
	
	LinkedList stack = new LinkedList();
	LinkedList queue = new LinkedList();
	
	
	public void pushCharacter(char push){//Adding in Stack
		stack.addFirst(push);//Last In
	}
	
	public char popCharacter(){//Removing from Stack
		return (char) stack.remove(0);//First Out
	}
	
	public void enqueueCharacter(char enqueue){//Adding in Queue
		queue.addLast(enqueue);//First In
	}
	
	public char dequeueCharacter(){//Removing from Queue
		return (char) queue.remove(0);//First Out
	}
	
	
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        StackQueue p = new StackQueue();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
            
        }
        
        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
        	            
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}