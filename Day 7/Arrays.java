//Day7 - Arrays. HAckerrank 30-Days-Of-Challenge Day 5 Solution
// This program gives you reverse of an arrays elements

import java.util.*;

public class testsums {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        for(int i=n-1;i>-1;i--){
        	
        	System.out.print(arr[i]+" ");
        }
        
        in.close();
    }
}
