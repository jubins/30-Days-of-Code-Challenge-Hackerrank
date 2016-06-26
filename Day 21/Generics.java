//Day 21: Generics Solution. 30- Days-of-Code Hackerrank Solution
//This program shows simple implementation of Generics.

class Generics {
	public static <E> void printArray(E[] array){
		for(E element : array){
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Generics.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}