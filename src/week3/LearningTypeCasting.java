package week3;

public class LearningTypeCasting {

	public static void main(String[] args) {
		// Typecasting from small to big data.
		byte exampleByte = 127;
		System.out.println(exampleByte);
//		short byteToShort = (short) (exampleByte + 1);
		short byteToShort = exampleByte;
		System.out.println(byteToShort);
		int shortToInt = byteToShort;
		System.out.println(shortToInt);
		long intToLong = shortToInt;
		System.out.println(intToLong);
		
		// Typecasting from big to small data
		long exampleLong = 20000000000L; // 20 billion
		System.out.println(exampleLong);
		int longToInt = (int) exampleLong;
		System.out.println(longToInt);
		short intToShort = (short) longToInt;
		System.out.println(intToShort);
		byte shortToByte = (byte) intToShort;
		System.out.println(shortToByte);
		// To prove that typecasting does not change value inside
		// the variable it type casted
		System.out.println(intToShort);
		System.out.println(longToInt);
		System.out.println(exampleLong);
		
		double exampleDouble = 3.12345678901234567890d;
		System.out.println(exampleDouble);
		float doubleToFloat = (float) exampleDouble;
		System.out.println(doubleToFloat);
	}
	
}








