// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

import java.util.Scanner;
public class DumbCalculator
{
 
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);

	double first;
	double second;
	double third;


	System.out.print("What is your first number? ");
	first = scan.nextDouble();

	System.out.print("What is your second number? ");
	second = scan.nextDouble();
	
	System.out.print("What is your third number? ");	
	third = scan.nextDouble();

	double result = Math.round((first+second+third)/2);

	
	System.out.println("Total, divided by 2 is: " + result);

 }

}

