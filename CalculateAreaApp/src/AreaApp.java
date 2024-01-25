import java.util.Scanner;



public class AreaApp{
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the AreaApp!");
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		
		double input1 = myObj.nextDouble();
		
		System.out.println("Please enter second number");
		
		double input2 = myObj.nextDouble();
		
		double total = input1 + input2;
		
		System.out.println(total);
		
		myObj.close();
		
	}
}


