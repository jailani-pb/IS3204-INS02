package week11;

public class LearningReplacingString {

	public static void main(String[] args) {
		String message = "is3204 Programming Application";
		// Replace the first instance of the text "is"
		String replaceString1 = message.replaceFirst("is", "IS");
		System.out.println(replaceString1);
		System.out.println(message);
		// Replace the first instance of the text "i"
		String replaceString2 = message.replaceFirst("i", "N");
		System.out.println(replaceString2);
		// Replace all instances of the text "i"
		String replaceString3 = message.replace("i", "N");
		System.out.println(replaceString3);
		String replaceString4 = message.replaceAll("i", "N");
		System.out.println(replaceString4);
		
	}
	
}
