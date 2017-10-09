package week13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearningPatternMatcherClasses {

	public static void main(String[] args) {
		String sict = "SchoolOfInformationCommunicationAndTechnology";
		
		Pattern pattern = Pattern.compile("o");
		Matcher matcher = pattern.matcher(sict);
		System.out.println(matcher.matches());
		matcher.reset();
		int count = 0;
		while(matcher.find()) {
			count++;
			System.out.println("Occurence " + count + " : "
					+ matcher.start() + " to " + matcher.end());
		}
		
		String icno = "01-123456";
		String icnoPattern = "^0[01]-[0-9]{6}$";
		Pattern pattern2 = Pattern.compile(icnoPattern);
		Matcher matcher2 = pattern2.matcher(icno);
		System.out.println(matcher2.matches());
		String icno2 = "51-123456";
		Matcher matcher3 = pattern2.matcher(icno2);
		System.out.println(matcher3.matches());
		String icno3 = "00-12345";
		Matcher matcher4 = pattern2.matcher(icno3);
		System.out.println(matcher4.matches());
		
		StringBuilder htmlText = new StringBuilder("<h1>A</h1>");
		htmlText.append("<h2>B</h2>");
		htmlText.append("<p>C</p>");
		htmlText.append("<p>D</p>");
		htmlText.append("<h2>E</h2>");
		htmlText.append("<p>F</p>");
		
		// () is for groupings
		// This is a greedy quantifier, .*
//		String htmlPattern = "(<h2>.*</h2>)";
		// This is a reluctant quantifier, .*?
		String htmlPattern = "(<h2>.*?</h2>)";
		Pattern pattern3 = Pattern.compile(htmlPattern);
		Matcher matcher5 = pattern3.matcher(htmlText);
		while(matcher5.find()) {
			System.out.println("Occurence Index: " 
					+ matcher5.start() + " to " + matcher5.end());
			System.out.println(matcher5.group(1));
		}
		
		String htmlPattern2 = "(<h2>)(.*?)(</h2>)";
		Pattern pattern4 = Pattern.compile(htmlPattern2);
		Matcher matcher6 = pattern4.matcher(htmlText);
		while(matcher6.find()) {
			System.out.println(matcher6.group(2));
		}
	}
	
}



