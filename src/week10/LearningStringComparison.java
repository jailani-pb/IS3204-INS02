package week10;

public class LearningStringComparison {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "java";
		// Compare two strings if they are equal (check letter case)
		System.out.println("s1 equals to s2? " + s1.equals(s2));
		System.out.println("s1 equals to s3? " + s1.equals(s3));
		System.out.println("s2 equals to s3? " + s2.equals(s3));
		// Compare two strings if they are equal (ignore letter case)
		System.out.println("s1 equals to s3 (ignore case)? ");
		System.out.println(s1.equalsIgnoreCase(s3));
		// Check if a string starts with a specific word.
		System.out.println("s1 starts with letter J?");
		System.out.println(s1.startsWith("J"));
		System.out.println("s1 starts with letter j?");
		System.out.println(s1.startsWith("j"));
		System.out.println("s1 starts with word Ja?");
		System.out.println(s1.startsWith("Ja"));
		// Check if a string ends with a specific word.
		System.out.println("s1 ends with letter a");
		System.out.println(s1.endsWith("a"));
		System.out.println("s1 ends with word va");
		System.out.println(s1.endsWith("va"));
	}
	
}





