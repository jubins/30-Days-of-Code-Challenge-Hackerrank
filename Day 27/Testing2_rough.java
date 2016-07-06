//I wrote this testcase because i misunderstood the problem. Check the other file.

import java.util.Scanner;

public class Testing2 {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int t = in.nextInt();
    	
    	while(t>0){
    		int n = in.nextInt();
        	int k = in.nextInt();
    		int a[] = new int[n];
    		for(int j=0;j<n;j++){
    			a[j] = in.nextInt();
    		}
    		System.out.println(TestAngryProfessor(n,k,a));
    	}
    	
/*
    	int a[] = {2,3,0};
        int b[] = {-1,-1,0,-2};
        int c[] = {2,3,2,4,5};
        int e[] = {0,2,0,1,3,3};
        int d[] = {0,0,0,0,0,0};
        int f[] = {-2,-3,0,4,5};
        
        System.out.println(TestAngryProfessor(1, a));
        System.out.println(TestAngryProfessor(0, b));
        System.out.println(TestAngryProfessor(5, c));
        System.out.println(TestAngryProfessor(6, d));
        System.out.println(TestAngryProfessor(1, e));
        System.out.println(TestAngryProfessor(4, f));
*/       
    }
    
    public static String TestAngryProfessor(int n, int k,int a[]){
    		//int n = a.length;
    		int ontime=0;
    		for(int a_i=0; a_i < n; a_i++){
    			if(a[a_i]<=0){
    				ontime++;
    			}
    		}
    		if(ontime>=k){
    			return "NO";
    		}
    		else{
    			return "YES";
    		}
    	
    }
}