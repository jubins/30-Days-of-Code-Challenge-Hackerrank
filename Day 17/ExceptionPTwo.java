//Day 17: Exceptions Part2 Solution. 30- Days-of-Code Hackerrank Solution
//This program shows handling of an exception if you try to convert a String to Integer.

import java.util.Scanner;

class getMessage extends Exception{
	String s = "n and p should be non-negative";
	public String getMessage(){
		return s;
	}
}

class Calculator{

	public int power(int n, int p) throws getMessage {
		if(n<0 || p<0){
			throw new getMessage();
		}
		//Using recursion to calculate exponents
		else{
			if(p<=0){
				return 1;
			}
			else{
				return n*power(n,p-1);
			}
		}
	}
}

class ExceptionPTwo{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
