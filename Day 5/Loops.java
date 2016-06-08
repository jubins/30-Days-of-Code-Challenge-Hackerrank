//Day5 - Loops. HAckerrank 30-Days-Of-Challenge Day 5 Solution
// This program gives you Table of any number

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int mul = 0;
        for(int i=1;i<11;i++){
        	mul = N*i;
        	System.out.println(N+" x "+i+" = "+mul);
        }
    }
}
