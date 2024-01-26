import java.util.Scanner;

public class AreaApp{
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the AreaApp!");
		
		Scanner myObj = new Scanner(System.in); // Use Scanner to get input
		
		System.out.println("Please enter two numbers to find the area");
		
		double input1 = myObj.nextDouble();
		
		double input2 = myObj.nextDouble();
		
		double total = input1 + input2;
		
		System.out.println(total);
		
		myObj.close(); // This closes the scanner class
		
	}
}


