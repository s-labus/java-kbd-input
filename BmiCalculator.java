// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does
import java.util.Scanner;

public class BmiCalculator
{
 
	public static void main(String[] args){
	
	/* Let's make BMI - body mass index calculator
	* BMI = weight kg / squared height meters
	*/

	Scanner scan = new Scanner(System.in);
	double height;
	double weight;

	System.out.print("Your height in inches: ");
	height = scan.nextDouble();
	height = height*2.54/100;
	
	System.out.print("Your weight in pounds: ");
	weight = scan.nextDouble();
	weight = weight / 2.2;

	double bmi = weight/ (height*height);
	System.out.println("Your BMI is: " + bmi);

 }

}
