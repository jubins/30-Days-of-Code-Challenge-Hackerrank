//Day 12: Inheritance Solution. 30- Days-of-Code Hackerrank Solution
//This program gives good example of inheritance

import java.util.*;

// Hackerrank greyed out area starts
class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber);
	}
}
//Hackerrank greyed out area ends


//Solution
class Student extends Person{
	private static int[] testScores;
	
	Student(String firstName, String lastName, int identification, int[] scores) {
		super(firstName, lastName, identification);
		testScores = scores;
	}
	
	char calculate(){
		
		int grade = 0;
		
		for(int i=0;i<testScores.length;i++){
			grade = grade + testScores[i];
			}
		grade = (grade/testScores.length);
		
		if(grade>=90 && grade<=100){
			return 'O';
		}
		else if(grade>=80 && grade<90){
			return 'E';
		}
		else if(grade>=70 && grade<80){
			return 'A';
		}
		else if(grade>=55 && grade<70){
			return 'P';
		}
		else if(grade>=40 && grade<55){
			return 'D';
		}
		else{
			return 'T';
		}
		
	}
}


//Hackerrank greyed out area starts
class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		//s.calculate();
		System.out.println("Grade: " +s.calculate());
	}
}
//Hackerrank greyed out area ends