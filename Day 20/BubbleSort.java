//Day 20: BubbleSort Solution. 30- Days-of-Code Hackerrank Solution
//This program sorts all the elements of an array using BubbleSort.

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int numberofSwaps = 0;
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for(int a_i=0; a_i < n; a_i++){
        	for(int a_j=a_i+1; a_j < n; a_j++){
        		if(a[a_i] > a[a_j]){
        			
        			int temp = a[a_j];
        			a[a_j] = a[a_i];
        			a[a_i] = temp;
        			
        			numberofSwaps++;
        		}
        	}
        }
        System.out.println("Array is sorted in "+numberofSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
        
    }
}
