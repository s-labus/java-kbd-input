// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

import java.util.Scanner;

public class NameAgeSallary
{
 
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	String name;
	int age;
	double sallary;

	System.out.println("Hello. What is your name?");
	name = input.next();

	System.out.println("Hi, " + name + "!"+ " How old are you?");	
	age = input.nextInt();

	System.out.println("So you're " + age + ", eh? That's not old at all!");
	System.out.println("How much do you make, " + name + "?");
	
	sallary = input.nextDouble();

	System.out.println(sallary+"!"+ " I hope that's per hour and not per year! LOL!");	

	}

}

