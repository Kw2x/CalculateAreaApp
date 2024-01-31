//import java.util*;
//import java.io.*; 

public class AreaApp{
	
	
	public static void main(String[] args) {
		
		if(args.length <= 0) {
			args = new String [] {
					"1","2"
			};
		}
		
			if(args.length <= 0 && args.equals(args)) {
				System.out.println("Params validated.");	
			}
		
		System.out.println("Welcome to the AreaApp!");
		System.out.println("Please enter two numbers to find the area");
		
		if(inputsAreValid(args)) {
			System.out.println("Inputs are valid");

		} else {
			System.out.println("Inputs are not valid");

		}
	
		System.out.println("done");
	 
	}

	private static boolean inputsAreValid(String[] args) {
		boolean isValid = false;
		for (String param : args) {
			  Integer param1 = parseString(param); 
			  System.out.println(param1);
		}
		return isValid;
	}

	private static Integer parseString(String input) {
		if (input == null) { 
	        System.out.println( 
	            "No console available"); 
	        return 0; 
	    } 
	
		return	Integer.parseInt(input);

	}
	
	
}


	
	

/*
Scanner c =	new Scanner(System.in); // Use Scanner to get input
Scanner s = new Scanner(System.in); // Use Scanner to get input
Scanner obj = new Scanner(System.in);
char cs	= obj.next().charAt(0);
double input1 = c.nextDouble();
double input2 = s.nextDouble();



double circleArea = (input1 *input2 )*Math.PI;
double squareArea = (input1 * input2);

//double circleArea = (c.nextDouble() * c.nextDouble());

if(c.equals('c') && (c.equals('c')))
	System.out.println(("The area of the circle is " + 	circleArea));

else if	(s.equals('s')&& (s.equals('s')))
	System.out.println(("The area of the circle is " + 	squareArea));

else
System.out.println("That is not a circle or square");


c.close(); 
s.close();
*/





