import java.util.Scanner;


public class AreaApp{
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the AreaApp!");
		System.out.println("Please enter two numbers to find the area");

		
		Scanner c =	new Scanner(System.in); // Use Scanner to get input
		Scanner s = new Scanner(System.in); // Use Scanner to get input
		double input1 = c.nextDouble();
		double input2 = s.nextDouble();
		double circleArea = (input1 * input2 )*Math.PI;
		double squareArea = (input1 * input2);
		
//double circleArea = (c.nextDouble() * c.nextDouble());

		
		 
		
		if(c.equals(c) && c.equals(c))
			System.out.println(("The area of the circle is " + 	circleArea));
		
		else if(s.equals(s) &&	s.equals(s))
			System.out.println(squareArea);
		
		else
		System.out.println("That is not a circle or square");
		
 
		c.close(); // This closes the scanner class
		s.close();// This closes the scanner class
		
	}
}









