//Day 28: RegEx, Patterns and Databases Solution. 30- Days-of-Code Hackerrank Solution in Java.
//This program validates if the domain is GMail (RegEx & Patterns), Stores the First Name in the array(Databases), Sorts and gives the output.


import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExPatternsDB{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String storeFirstName = "";
        String validDomain = ".+@gmail\\.com$";
        Pattern p = Pattern.compile(validDomain);
        
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            
            Matcher m = p.matcher(emailID);
            
            if(m.find()){
            	storeFirstName = storeFirstName + firstName+" ";
            }
        }
        String[] sortName = storeFirstName.split("\\s+");
        Arrays.sort(sortName);
        
        for(String s:sortName){
        	System.out.println(s);
        }        
        in.close();
    }
}
