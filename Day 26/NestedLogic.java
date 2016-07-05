//Day 26: Nested Logic Solution. 30- Days-of-Code Hackerrank Solution in Java.
//This program calculates fine if book is returned late without using any in-built Java libraries.

import java.util.Scanner;

public class NestedLogic {

    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
    	
    	int DayReturned = in.nextInt();
		int MonthReturned = in.nextInt();
		int YearReturned = in.nextInt();
		
		int DayExpected = in.nextInt();
		int MonthExpected = in.nextInt();
		int YearExpected = in.nextInt();
		
		int fine=0;

		int daysPassed = Math.abs(DayExpected-DayReturned);
		
		if(YearReturned>YearExpected || MonthReturned>MonthExpected || DayReturned>DayExpected){
			if(YearReturned>YearExpected && Math.abs(YearExpected-YearReturned)>=1){
				fine = 10000;
			}
		
			else if(MonthReturned>MonthExpected && Math.abs(MonthExpected-MonthReturned)>=1 && Math.abs(YearExpected-YearReturned)==0){
				fine = Math.abs(MonthExpected-MonthReturned)*500;
			}
			
			else if(YearReturned<YearExpected){
				fine=0;
			}

			else{
				fine = daysPassed*15;
			}
		}
		
		else{
			fine=0;
		}
		//System.out.println("Days: "+Math.abs(DayReturned-DayExpected)+", Months: "+Math.abs(MonthReturned-MonthExpected)+", Year: "+Math.abs(YearExpected-YearReturned));
		
		System.out.println(fine);
    	in.close();
    	
    }
}