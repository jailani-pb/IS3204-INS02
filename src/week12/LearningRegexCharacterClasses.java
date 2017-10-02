package week12;

public class LearningRegexCharacterClasses {

	public static void main(String[] args) {
		String message = "IS3204ProgrammingApplication";
		System.out.println(message);
		// Literal string, it replaces the letter a to X
		String replaceMessage = message.replaceAll("a", "X");
		System.out.println(replaceMessage);
		// . means any letter in regex
		System.out.println(message.replaceAll(".", "X"));
		// replace a, i and o to X
		System.out.println(message.replaceAll("[aio]", "X"));
		// replace all letters other than a, i and o to X.
		System.out.println(message.replaceAll("[^aio]", "X"));
		// replace all letters a to z in to X
		System.out.println(message.replaceAll("[a-z]", "X"));
		// replace all letters a to z or A to Z in to X
		System.out.println(message.replaceAll("[a-zA-Z]", "X"));
		// replace all letters a to z or A to Z or 0 to 9
		// in to X
		System.out.println(message.replaceAll("[a-zA-Z0-9]", "X"));
		// replace all letters e to m in to X
		System.out.println(message.replaceAll("[e-m]", "X"));
		// replace all letters H to Q in to X
		System.out.println(message.replaceAll("[H-Q]", "X"));
		// replace all letters 3 to 6 in to X
		System.out.println(message.replaceAll("[3-6]", "X"));
		// replace all letters a to k except for c and g
		// in to X
		System.out.println(message.replaceAll("[a-k&&[^cg]]", "X"));
		System.out.println(message.replaceAll("[abd-fh-k]", "X"));
		// replace all letters a to z except for m to p
		// in to X
		System.out.println(message.replaceAll("[a-z&&[^m-p]]", "X"));
		System.out.println(message.replaceAll("[a-lq-z]", "X"));
	}
	
}




