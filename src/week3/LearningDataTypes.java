package week3;

public class LearningDataTypes {

	public static void main(String[] args) {
		// Datatype numeric
		byte exampleByte = 127;
		System.out.println(exampleByte);
		exampleByte = (byte) (exampleByte + 1);
		System.out.println(exampleByte);
		short exampleShort = 30000;
		System.out.println(exampleShort);
		int exampleInt = 2000000000;
		System.out.println(exampleInt);
		long exampleLong = 20000000000L;
		System.out.println(exampleLong);
		// Datatype floating number (number with decimals)
		float exampleFloat = 3.1234567890F;
		System.out.println(exampleFloat);
		double exampleDouble = 3.12345678901234567890;
		System.out.println(exampleDouble);
		// The way computer store decimal numbers is different.
		System.out.println(0.1 + 0.2); // Expected 0.3 but result is 0.30000000000000004
		
		// Datatype char
		char exampleChar = 'A';
		System.out.println(exampleChar);
		System.out.println("This is a String");
		
		// Datatype boolean
		boolean exampleBoolean = true;
		System.out.println(exampleBoolean);
	}
	
}
