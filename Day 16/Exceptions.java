//Day 16: Exceptions Solution. 30- Days-of-Code Hackerrank Solution
//This program shows handling of an exception if you try to convert a String to Integer.

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try{
        	int i = Integer.parseInt(S);
        	System.out.println(i);
        }
        catch (Exception e){
        	System.out.println("Bad String");
        }
    }
}
