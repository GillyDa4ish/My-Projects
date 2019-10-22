package cmdparams;

import java.util.Scanner;

public class ParamTest_2 {

	public ParamTest_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {		
		   Scanner input = new Scanner(System.in);

		
		/*
        if (args.length > 0) {
	System.out.println("Parameter 1: " + args[0]);
}
        if (args.length > 0) {
        	System.out.println("Parameter 1: " + args[0]);
        }
        if (args.length > 1) {
        	System.out.println("Parameter 2: " + args[1]);
        }
        if (args.length > 2) {
        	System.out.println("Parameter 3: " + args[2]);
        }
        
		int i = 0;
		while (i < args.length) {
        System.out.println("Parameter  " + i +":" +  args[i]);
        i++;
        
		}
		
		   String first;
		   String last;
		   
		   System.out.println("Enter your first and lastname ssn birthdate");
		   first = input.next();
		   last = input.next();
		   int ssn = input.nextInt();
		   double bday = input.nextDouble();
		   
		   System.out.println("hello " + first +" " + last);
		   */
		   
		   String username;
		      int course1;
		      int course2;
		      int course3;
		      int average;

		      

		      System.out.print("Type your name and press Enter: ");
		      username = input.next();

		      System.out.print("Enter your round 1 score: ");
		      course1 = input.nextInt();
		      System.out.print("Enter your round 2 score: ");
		      course2 = input.nextByte();
		      System.out.print("Enter your round 3 score: ");
		      course3 = input.nextInt();

		      average = (course1 + course2 + course3) / 3;

		      System.out.println("");
		      System.out.println("Hello " + username);
		      System.out.println("Score for course 1: " + course1);
		      System.out.println("Score for course 2: " + course2);
		      System.out.println("Score for course 3: " + course3);
		      System.out.println("Average score: " + average);
		   input.close();

	}
	
	
}
