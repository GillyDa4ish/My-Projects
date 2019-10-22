/**
 * 
 */
package gillis_exam_projects;

/**
 * @author logan.gillis
 *
 */
public class Exe9_12_19 {

	/**
	 * 
	 */
	public Exe9_12_19() {
		double myWidth = 5.0;
		double myHeight = 2.0;
		double myBase = 3.0;
		
		int num1 = 5;
		int num2 = 3;
		
		int sum = num1 + num2;
		System.out.println(sum);
		int div = num1 / num2;
		System.out.println(div);
		
		double area = myWidth*myHeight;
		System.out.println(area);
		
		double triangle = (myBase*myHeight)/2;
		System.out.println(triangle);
		
		double perimeterRec = 2*(myHeight+myWidth);
		System.out.println(perimeterRec);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Exe9_12_19();

	}

}
