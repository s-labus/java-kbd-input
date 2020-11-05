// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

public class MoreVariablesAndPrinting
{
 
	public static void main(String[] args){

		String name, eyes, teeth, hair;
		int age; 
		double height, weight;

		name = "Straxinja the Fearless";
		age = 29;
		height = 190/2.5;
		weight = Math.round(90/2.2);
		
		eyes = "Almond";
		teeth = "White";
		hair = "Dark";

		System.out.println("Let's talk about " + name + ".");
		System.out.println("He's " + height + " inc tall.");
		System.out.println("He's " + weight + " lbs heavy.");
		System.out.println("Actually, that's not overall heavy.");
		
		System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
		System.out.println("He has beautifull " + teeth + " teeth and gorgeous smile.");
		
		System.out.println("If I add " + age + ", " + height + " and " + weight + " I get " + (age+height+weight)+ ".");
	}

}

