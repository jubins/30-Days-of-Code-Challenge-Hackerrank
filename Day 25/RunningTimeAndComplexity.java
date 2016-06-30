//Day 25: Running Time and Complexity. 30- Days-of-Code Hackerrank Solution in Java.
//This program finds weather a given number is a Prime or not.

import java.util.Scanner;

public class RunningTimeAndComplexity {
	static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for(int i=0;i<T;i++){
			int n = in.nextInt();
			String s;
			
			if(n>=2 && isPrime(n)){
				s = "Prime";
			}
			else{
				s  = "Not prime";
			}
			System.out.println(s);
		}
		in.close();
	}
}

/* Program having bad time complexity
import java.util.Scanner;

public class testsums {

    public static void main(String[] args) {
        // Enter your code here.
    	Scanner in = new Scanner(System.in);
    	
    	long T = in.nextInt();
    	
    	for(long i=0;i<T;i++){
    		long n = in.nextInt();
    		long a = n;
    		long checkprime=0;
    		boolean isPrime=true;
    		
    		if(n==0 || n==1){
    			System.out.println("Not prime");
    		}
    		else{
    			while(a>0){
    				if(n%a==0){
    					checkprime++;
    				
    				if(checkprime>2 && checkprime<4){
    					isPrime=false;
    					break;
    				}
    				}
    				a--;
    				
    			}
    		
    			if(isPrime==false){
    				System.out.println("Not prime");
    			}
    			else{
    				System.out.println("Prime");
    			}
    		}
    	}
        in.close();
    }
}
*/