package week4;

public class LearningString {

	public static void main(String[] args) {
		// Initialising a String variable
		// This is the preferred way.
		String name = "Jailani";
		// This is not the preferred way.
		String name2 = new String("Jailani");
		String name3 = "Jailani";
		
		// Comparing two Strings
		// Don't use == , to be safe use .equals() methods
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		System.out.println(name == name3);
		System.out.println(name.equals(name3));
		
		// Combining multiple Strings (Concatenate)
		System.out.println(name + " " + name2 + " " + 16.99);
		System.out.println(name.concat(" ").concat(name2)
				.concat(" ").concat("" + 16.99));
	}
	
}
