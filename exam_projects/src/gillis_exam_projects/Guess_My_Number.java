package gillis_exam_projects;



import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guess_My_Number {

	public Guess_My_Number() {

		/*
		int random_num =(int)(System.currentTimeMillis()%10);
		print(random_num);
		
		double random_num2 = Math.random();
		print(random_num2);
		int random_num3 = (int)(Math.random()*1000);
		print(random_num3);
		
		int random_num4 = ThreadLocalRandom.current().nextInt(1,3);
		print(random_num4);*/
		Scanner input = new Scanner(System.in);
		int option = 0;
		while (option != 10) {
			print("Welcome to the Guess My Number Game");
			print("please select the loop style you would like to use");
			print("Press 1 for a for loop");
			print("Press 2 for a while loop");
			print("Press 3 for a do loop");
			print("Press 4 to flip a coin");
			print("Press 5 to roll some dice");
			option = input.nextInt();
			switch(option) {
			case 1:
				print ("for loop");
				
				for_loop_guess(input);
				
				break;
			case 2:
				print ("while loop");
				while_loop_guess( input);
				break;
			case 3:
				print ("do loop");
				do_loop_guess(input);
				break;
			case 4:
				print ("coin");
				int coin = ThreadLocalRandom.current().nextInt(1,3);
				if (coin == 1) {
					print("Heads");
					
					
				}
				else {
					print("Tails");
				}
				break;
			case 5:
				print ("dice");
				roll_dice();
				break;
			case 6:
				print ("quit");
				option = 10;
				break;
				default:
					print("thats not an option");
					option = 0;
				
				
				
				
				
				
			}
			
			
		}
	}	
		
		
		
		
		
	
	
	public void while_loop_guess(Scanner input) {
	
	print("pick a number between 1 and 10");
	int guess = input.nextInt();
	int trys = 0;
	int max_trys = 1;
	
	int r_num = (int) (Math.random()*10)+1;
	while(guess != r_num && trys <= max_trys ) {
		print("nope try again");
		trys++;
	    guess = input.nextInt();
	
	if (guess == r_num) {
		print("you got it \n");
	}
	else {
		print("you are really bad at this");
		print("the number was 2"+r_num);
	}
	

	}
	}
	
	public void do_loop_guess(Scanner input) {	
	
	
	
	int r_num = (int) (Math.random()*10)+1;
	print(r_num);
	int guess ;
	int trys = 0;
	int max_trys = 1;
	
	
	do {
		
		
		print("Pick a number between 1 and 10");
		guess = input.nextInt();
		if (guess != r_num) {
			print("try again");
			trys++;
		}
		
		
	}while(guess != r_num && trys <= max_trys ); 
		

	
	if (guess == r_num) {
		print("you got it \n");
	}
	else {
		print("you are really bad at this");
		print("the number was 2"+r_num);
	}
	

	}

	public void com_guess() {
		Scanner input = new Scanner(System.in);
		
		int max = 10;
		int min = 1;
		
		int r_num = (int) (Math.random()*10)+1;
		
		print("I will guess for you my good sir");
	}
	

	
	
	
	public static void print(Object o) {
		System.out.println(o.toString());
	}
	public void for_loop_guess(Scanner input) {
		int guess = input.nextInt();
		int trys = 0;
		int max_trys = 1;
		int r_num = (int) (Math.random()*10)+1;
		
		for (int trys1 = 0; trys1<3; trys1++) {
			print ("nope try again");
			print("pick a number between 1 and 10");
			guess = input.nextInt();
		}
		if (guess == r_num) {
			print("you got it \n");
		}
		else {
			print("you are really bad at this");
			print("the number was 2"+r_num+"\n");
		}
	}
	public void roll_dice() {
		Random generator = new Random();
		int die1;
		int die2;
		
		
		die1 = generator.nextInt(6)+1;
		die2 = generator.nextInt(6)+1;		
				
		print(die1);
		print(die2);
	}

	public static void main(String[] args) {
		new Guess_My_Number();

	}

}
