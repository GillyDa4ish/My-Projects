package gillis_exam_projects;

public class Exe9_20_19 {

	public Exe9_20_19() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        String mystring ="Pizza, Hotdog, icecream, cheese cake, apple";
        boolean result1 = mystring.contains("Hotdog");
        if (mystring.contains("Pizza")); 
        System.out.println("eat here");
        
	System.out.println(result1);
	String mystring2 = "hello";
	int result2 = mystring2.lastIndexOf("1");
	System.out.println(result2);
	String mystring3 = "the quick brown fox jumped over the lazzy dog";
	int result3 = mystring3.length();
	System.out.println(result3);
	String result4 = mystring3.replace("b", "B");
	System.out.println(result4);
	
	int startpos = mystring.indexOf("j");
	int endpos = mystring3.lastIndexOf("r");
	
	
	String result5 = mystring3.substring(startpos, endpos+1 );
	System.out.println(result5);
	
	if (mystring3.contains("jumped over")){
		int startpos1 = mystring3.indexOf("jumped");
		int endpos1 = mystring3.lastIndexOf("over")+4;
		String result6 = mystring3.substring(startpos1,endpos1 );
		System.out.println(result6);
		
	}
	}
}

