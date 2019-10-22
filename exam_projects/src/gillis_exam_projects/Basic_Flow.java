package gillis_exam_projects;

import java.util.Scanner;

public class Basic_Flow {

	public Basic_Flow() {
		// relation Operators
		// < > <= >= == !=
	}

	public static void main(String[] args) {
		
			String username = "YaBoi";
			int password = 123456;
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter UserName");
			String x = input.nextLine();
			
			System.out.println("Enter Pin Number");
			int y = input.nextInt();
			
			if (x.contentEquals(username) && y == password ) {
				System.out.println("You Got In");
			}
			else {
				System.out.println("Your Not In");
			}
			System.out.println("Nice try");
		}
	
		}
	


