//Day 11: 2DArrays Solution. 30- Days-of-Code Hackerrank Solution
//This program calculates the hour-glass having highest sum.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class testsums {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        
        
        int sum = 0;
        int n=0;
        int[] sumStorage = new int[16];
        
        
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        
        for(int v=0;v<4;v++){ //Vertical movement inside array
        	for(int h=0;h<4;h++){ //Horizontal movement inside array
        		
        		for(int i=0+v; i < 3+v; i++){
        			for(int j=0+h; j < 3+h; j++){
        				sum = sum+arr[i][j];
        				//System.out.println("arr"+i+j+": "+arr[i][j]);
        				j++;
        			}
        			i++;
        		}
        		for(int i=0+v; i < 3+v; i++){
        			for(int j=0+h; j < 3+h; j++){
        				j++;
        				sum = sum+arr[i][j];
        				//System.out.println("arr"+i+j+": "+arr[i][j]);
        				j++;
        			}
        		}
        		sumStorage[n] = sum;
        		//System.out.println("sum"+n+": "+sumStorage[n]);
        		sum=0;
        		n++;
        	}
        }
        
        for (int i=0;i<16;i++){ //Doing Linear sort
        	for (int j=i+1;j<16;j++){
        	if(sumStorage[i] > sumStorage[j]){
        		
        		int temp = sumStorage[i];
        		sumStorage[i] = sumStorage[j];
        		sumStorage[j] = temp;
        	}
        }
        //	System.out.println(i+": "+sumStorage[i]);
        }
        System.out.println(sumStorage[15]); //Printing the last value in sorted array because that would be having the highest value.
    }
}

/*Input:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Output:
19
*/