package cmdparams;

import java.util.Scanner;

public class Mad_Lib {

	public Mad_Lib() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	
		 System.out.print("ENTER HUMAN BODY PART ");
		   String Human_Body_Part = input.nextLine();
		
		   
		   System.out.print("ENTER VERB ");
		   String Verb = input.nextLine();
		 
		   
		   System.out.print("ENTER COLOR ");
		   String Color = input.nextLine();
		   
		   		
		   System.out.print("ENTER COLOR ");
		   String Color_2 = input.nextLine();
		   
		
		   System.out.print("ENTER VERB ");
		   String Verb_2 = input.nextLine();
		 
		
		   System.out.print("ENTER OBJECT ");
		   String Object = input.nextLine();
		   

		   System.out.print("ENTER ORIGINAL BODY PART ");
		   String Original_Human_Body_Part = input.nextLine();

		   
		   
		   System.out.print("ENTER VERB ");
		   String Verb_3 = input.nextLine();
		
		   
		   System.out.print("ENTER ADJECTIVE ");
		   String Adjective = input.nextLine();
		   
		   
		   System.out.print("ENTER NOUN ");
		   String Noun = input.nextLine();
		   
		  
		   System.out.print("ENTER ORIGINAL BODY PART ");
		   String Original_Human_Body_Part_2 = input.nextLine();
		  
		  
		   System.out.print("ENTER NOUN ");
		   String Noun_2 = input.nextLine();

		   
		   System.out.print("The other day I woke up and my "+Human_Body_Part + " was sore.");
		   System.out.print("I looked in the mirror and started to "+Verb+". ");
		   System.out.println("My skin was all "+Color);
		   System.out.println("and there were little "+Color_2+" spots all over it! ");
		   System.out.print("My dad told me not to "+Verb_2+" and took me to the doctor. ");
		   System.out.print("When we got there, the nurse struck a "+Object+ " into my "+Original_Human_Body_Part+" to tkae my temperture");
		   System.out.print("then she told me to "+Verb_3+" for one minute while she got the doctor. ");
		   System.out.print("The docor was a/an "+Adjective+" woman with bad breath and a cold "+Noun+" that she pressed on my "+Original_Human_Body_Part_2+".");
		   System.out.print("She said I had the worst case of "+Noun_2+" pox she had ever seen! ");
		   
		   
		   
		   
		   input.close();

	}

}
