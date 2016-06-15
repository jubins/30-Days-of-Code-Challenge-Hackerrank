//Day 8 Maps and Dictionaries Solution. Hacker rank 30 Days of Code.
//Solution 1

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class testsums{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] name = new String[n];
        String[] phone = new String[n];
        
        String[] s = new String[n];
        String[] search = new String[n];
        
        for(int i = 0; i < n; i++){
            name[i] = in.next();
            phone[i] = in.next();
            // Write code here
            s[i] = name[i]+"="+phone[i];
        }

        int count=0;

        while(in.hasNext())
        for (int i=0;i<n;i++){
        	search[i] = in.next();
            for(int j=0;j<n;j++){
            	count=0;
            	
            	if(name[j].equals(search[i])){
            		System.out.println(s[j]);
            		break;
            	}
            	else if(phone[j].equals(search[i])){
            		System.out.println(s[j]);
            	}
            	else{
            		count++;
            	}
            }
            
            if(count>0){
            	System.out.println("Not found");
            }
        }

        in.close();
    }
}

/* Alternate Solution
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, String> phonebook = new HashMap<String, String>();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			String phone = sc.next();

			phonebook.put(name, phone);
		}

		while (sc.hasNext()) {
			String name = sc.next();

			if (phonebook.containsKey(name)) {
				System.out.println(name + "=" + phonebook.get(name));
			} else {
				System.out.println("Not found");
			}
		}

		sc.close();
	}
}
*/