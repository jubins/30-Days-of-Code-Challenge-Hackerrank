//Day 6 - Let's Review Challenge Solution. Hacker Rank 30-Days-of-Code.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner in = new Scanner(System.in);    	
    	
    	int T = in.nextInt();
    	
    	
    	String even = ""; 
    	String odd = "";
    	
    	for (int i=0;i<T+1;i++){
    		String s = in.next();

    		String[] result = s.split("");
    		
    		for (int j=0;j<result.length;j++){
    			
    			if(j%2==0){
    				
    				even = even + result[j];    			
    			}
    			
    			if(j%2==1){
    				odd = odd + result[j];    				
    			}
    		}
    		System.out.println(odd+" "+even);
    		even="";
    		odd="";
    		}    	    	    	
    }
}