//Day 9: Recursion Solution. 30- Days-of-Code Hackerrank Solution
//This program calculates Factorial(eg: 8!), Summation(eg: E(3) = 3+2+1) & Exponentiation(eg: 3^2 = 3*3). However, comment out the Summation and Exponentiatio nmethods as for this challenge you only need the Factorial.

import java.math.BigInteger;
import java.util.*;

public class testsums {
	
	public static BigInteger Factorial(long n){
		//BASE CASE
		if(n<=1){
			BigInteger returnOne = new BigInteger("1");
			return returnOne;
		}
		//RECURSIVE CASE: 3! = 3*Factorial(3-1)
		//3! = 3*2*Factorial(2-1)
		//3! = 3*2*Factorial(1)
		//3! = 3*2*1
		else{
			BigInteger number = BigInteger.valueOf(n);
			BigInteger decreasedNumber = Factorial(n-1);
			return number.multiply(decreasedNumber);
		}
	}
	
	public static long Summation(long n){
		//BASE CASE
		if(n<=0){
			return 0;
		}
		//RECURSIVE CASE: 3+2+1
		else{
			return n+Summation(n-1);
		}
	}

	public static BigInteger Exponentiation(long n,long p){
		//BASE CASE
		if(p<=0){
			BigInteger returnOne = new BigInteger("1");
			return returnOne;
		}
		//RECURSIVE CASE: 5^3 = 5*Exponentiation(5,2)
		//5^3 = 5*5*Exponentiation(5,1)
		//5^3 = 5*5*5*Exponentiation(5,0)
		//5^3 = 5*5*5*1
		else{
			BigInteger number = BigInteger.valueOf(n);
			BigInteger power = Exponentiation(n, p-1);
			return number.multiply(power);
		}
	}
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
    	long n = in.nextInt();
    	//long p = in.nextInt(); //Uncomment this and last output line to calculateExponents
    	
    	
    	//System.out.println(n+"! = "+Factorial(n)); //Uncomment this to calculateFactorial
    	System.out.println("Sigma("+n+") = "+Summation(n));
    	//System.out.println(n+"^"+p+" = "+Exponentiation(n, p)); //Uncomment this to calculateExponents
    }
}