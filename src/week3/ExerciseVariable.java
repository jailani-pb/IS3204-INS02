package week3;

public class ExerciseVariable {

	public static void main(String[] args) {
		float firstStudentMark = 50.159488f;
		float secondStudentMark = 79.1123009f;
		float thirdStudentMark = 40f;
		byte firstStudentAge = 20;
		byte secondStudentAge = 10;
		byte thirdStudentAge = 23;
		System.out.printf("The first student age "
				+ "%d achieved %.2f "
				+ "for this module.%n", firstStudentAge, firstStudentMark);
		System.out.printf("%s %d %s %.2f %s%n",
				"The second student age", secondStudentAge, "achieved",
				secondStudentMark, "for this module.");
		System.out.printf("%s %d %s %.2f %s%n",
				"The third student age", thirdStudentAge, "achieved",
				thirdStudentMark, "for this module.");
		
		String formatString = "The %s student aged "
				+ "%d achieved %.2f "
				+ "for this module.%n";
		System.out.printf(formatString, "first", firstStudentAge, firstStudentMark);
		System.out.printf(formatString, "second", secondStudentAge, secondStudentMark);
		System.out.printf(formatString, "third", thirdStudentAge, thirdStudentMark);
	}
	
}




