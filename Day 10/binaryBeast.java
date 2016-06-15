//Day 10: Binary Numbers Solution Hackerrank Challenge. 30-Days-of-Code.
//This program gives you count of Consecutive 1's in the Binary number, along with Total 1's and Binary of a positive number. 
import java.util.*;

public class binaryBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(); //USed long to count binary of even large numbers
        System.out.println(getBinary(n)); //calls get binary function
    }
    
    public static long getBinary(long n){
    	String s = "";
    	int countTotalOnes = 0; //Gives total count of 1's
    	int count = 0; //for temporary value storage
    	int countConsecutiveOnes = 0; //Gives consecutive 1's count
    	
    	while(n!=0){
    		if(n%2 == 0){
    			s = "0"+s; //If remainder is 0 add 0 to Binary
    			count = 0; //if counter comes to 0 then it means it was 1 previously to resetting it
    		}
    		else { 
    			s = "1"+s; //If remainder is 1 add 1 to Binary
    			count++;
    			countTotalOnes++;
    			if(count>=1 || count<=countTotalOnes){ //if the number of 1 are between total and minimum range
    				if(countConsecutiveOnes<count){
    					countConsecutiveOnes = count; //stores maximum value of number of 1's
    				}
    			}
    		}
    		n = n/2;
    	}
		
    	//System.out.println("Binary: "+s+"\nTotal 1's: "+countTotalOnes+"\nConsecutive 1's: "+countConsecutiveOnes);
		return countConsecutiveOnes;
    	
    }
}
