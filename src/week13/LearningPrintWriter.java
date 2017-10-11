package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

public class LearningPrintWriter {

	public static void main(String[] args) {
		// For windows
		// C:\\Users\\PC-NAME\\Desktop\\filename
		File file = new File("/home/jailanihar/test.txt");
		try {
			PrintWriter writeFile = new PrintWriter(file);
			writeFile.println("IS3204");
			writeFile.println("Programming");
			writeFile.println("Application");
			Date now = new Date();
			writeFile.println(now);
			writeFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File location is invalid.");
			System.out.println(file.getAbsolutePath());
		}
	}
	
}


