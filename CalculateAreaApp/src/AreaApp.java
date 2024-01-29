import java.util.Scanner;


public class AreaApp extends Shape{
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the AreaApp!");
		
		Scanner myObj = new Scanner(System.in); // Use Scanner to get input
		
		System.out.println("Please enter two numbers to find the area");
		
		if(myObj.nextLine().charAt(1)!= 's')
		 getCircleArea();
	
		else getSquareArea();
		
		System.out.println();
		


		
		
		
		
		
		
		
		myObj.close(); // This closes the scanner class
		
	}
}




