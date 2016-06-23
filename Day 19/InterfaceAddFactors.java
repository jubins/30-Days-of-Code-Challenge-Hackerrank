//Day 19: Interfaces Solution. 30- Days-of-Code Hackerrank Solution
//This program finds factors of every number and then adds those factors.

import java.util.Scanner;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic{
	public int divisorSum(int n){
		int sum = 0;
		int factor = 1;
		
		while(factor <= n){
			if(n%factor == 0){
				sum +=factor;
				//System.out.println("Factor of "+n+": "+factor+", sum: "+sum);
			}
			factor++;
		}
		return sum;
	}
}

class InterfaceAddFactors {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}