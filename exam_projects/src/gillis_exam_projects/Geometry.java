package gillis_exam_projects;

import java.util.Scanner;

public class Geometry {
	  Scanner input = new Scanner(System.in);

	public Geometry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		
		 double side, peri, area;//States side, peri, area as variables
		    
	    	System.out.println("Enter Measurement : ");//Prints text
	    	String Measurement = input.nextLine();// Creates variable
			
	        System.out.print("Enter Side Length of Square : ");//Prints out text
	        if (input.hasNextDouble())
			{
			side = input.nextDouble();
			}
			
			
			else
			{
			side = 0;
			input.nextLine();
			}// Changes Un-Wanted Characters


	        
	        area = side*side;// Multiplies sides
	        peri = 4*side;// Multiplies sides by 4
			
	        System.out.println("Area = " +area+Measurement ); // Prints area + Measurement
			
	        System.out.println("\nPerimeter = " +peri+Measurement);// Prints peri + Measurement
	        
	        String square = String.format(".------"+side+Measurement+"------. \r\n" + 
					"|                  |\r\n" + 
					"|                  |\r\n" + 
					"|                  |\r\n" + 
					"|                  |\r\n" + 
		""+side+Measurement+"          "+side+Measurement+"\r\n" + 
					"|                  |\r\n" + 
					"|                  |\r\n" + 
					"|                  |\r\n" + 
					"|                  |\r\n" + 
			"'------"+side+Measurement+"------' Area: %1$s %2$s Perimiter: %3$s %2$s       \n\n", area, Measurement, peri);
		System.out.println(square);// Prints out square and additional measurements along with the area and peri
			
	    
	    
    
    input.close();
	}

}