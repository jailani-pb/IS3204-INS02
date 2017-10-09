package week13;

public class LearningRegexQuantifiers {

	public static void main(String[] args) {
		String message = "abbbbbcccdddddeee11122233333";
		// once or not at all, a?
		System.out.println(message.replaceAll("^a?", "X"));
		System.out.println(message.replaceAll("^f?", "X"));
		// zero or more times, a*
		System.out.println(message.replaceAll("^abbbbb", "X"));
		System.out.println(message.replaceAll("^ab*", "X"));
		String message2 = "acccdddddeee11122233333";
		System.out.println(message2.replaceAll("^abbbbb", "X"));
		System.out.println(message2.replaceAll("^ab*", "X"));
		// one or more times, a+
		System.out.println(message.replaceAll("^ab+", "X"));
		System.out.println(message2.replaceAll("^ab+", "X"));
		// exactly n times, a{n}
		System.out.println(message.replaceAll("^ab{5}", "X"));
		System.out.println(message.replaceAll("^ab{6}", "X"));
		// the pattern it will replace will be
		// ccc, eee, cce, cee, cec, ecc, eec, ece
		System.out.println(message.replaceAll("[ce]{3}", "X"));
		// at least n times, a{n,}
		System.out.println(message.replaceAll("^ab{3,}", "X"));
		System.out.println(message.replaceAll("^ab{6,}", "X"));
		// at least n times but not more than m times, a{n,m}
		System.out.println(message.replaceAll("^ab{3,6}", "X"));
		System.out.println(message.replaceAll("^ab{2,4}", "X"));
	}
	
}





