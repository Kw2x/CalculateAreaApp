import java.util.Scanner;


public class AreaApp{
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the AreaApp!");
		
		Scanner myObj = new Scanner(System.in); // Use Scanner to get input
		
		System.out.println("Please enter two numbers to find the area");
		
		//String c = myObj.next().charAt(1);

		char c = myObj.next().charAt(1);// 
		char s = myObj.next().charAt(1);//

		
		double input1 = myObj.nextDouble();
		double input2 = myObj.nextDouble();
		double circleArea = (input1 * input2 )*Math.PI;
		

		/*if(myObj.equals('c')) {
			double circleArea = (input1 * input2 )*Math.PI;
			System.out.println("The area of the circle is " + circleArea);
		}*/
		
		//System.out.println("The area is " + c + circleArea); does nothing 
		System.out.println("The area is " + circleArea);

		
		myObj.close(); // This closes the scanner class
		
	}
}



