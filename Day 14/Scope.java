//Day 14: Scope Solution. 30- Days-of-Code Hackerrank Solution
//This program calculates the maximum difference among elements of an array.

import java.util.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	public Difference(int[] a) {
		// TODO Auto-generated constructor stub
  		elements = a;
  	}

	public void computeDifference() {
		// TODO Auto-generated method stub
		int max = 0;
		
		for(int i=0;i<elements.length;i++){
			for(int j=i+1;j<elements.length;j++){
				
				int diff = Math.abs((elements[i]-elements[j]));
				if(diff>max){
					max=diff;
				}
			}
			maximumDifference = max;
		}
	}
}

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

