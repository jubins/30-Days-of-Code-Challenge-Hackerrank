//Day 29: BitwiseAND Solution. 30- Days-of-Code Hackerrank Solution in Java.
//This program takes input N, then calculates AND between A&B such that A<B and B<N. And whatever the value of A AND B is maximum but less than K, it //displays that value. For simplicity uncomment the print line below and read the Hackerrank description and reun below code, you'll understand.

import java.util.Scanner;

public class BitwiseAND{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int i=0;i<T;i++){
			int N = in.nextInt();
			int K = in.nextInt();
			int MaxValue = 0;
			
			for (int A=1;A<N;A++){
				for(int B=2;B<=N;B++){
					if(A<B){
						int AND = A & B;
					//	System.out.println(A+" AND "+B+" = "+AND);
						if(MaxValue<AND && AND<K){
							MaxValue = AND;	
						}
					}
				}
			}
			System.out.println(MaxValue);
						
		}
		in.close();
	}
}
