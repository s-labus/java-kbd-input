// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

import java.util.Scanner;

public class ForgetFull
{
 
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String word;
		String anotherWord;

		int num;
		int anotherNum;		

		System.out.println("Give me a word!");
		word = scan.next();

		System.out.println("Give me a second word!");
		anotherWord = scan.next();
		
		System.out.println("Great, now your favorite number?");
		num = scan.nextInt();
		
		System.out.println("And you second-favorite number...");
		anotherNum = scan.nextInt();

		System.out.println("Whew! Wasn't that fun?");

	}

}

