package week8;

public class Example2DArray {

	public static void main(String[] args) {
		String[] columnHeaders = {
				"Automaker A", "Automaker B", "Automaker C",
				"Automaker D", "Automaker E"
		};
		String[] rowHeaders = {
				"2002", "2003", "2004", "2005"
		};
		
		double[][] unitsSold = {
				{4.5, 2.6, 2.25, 1.7, 1.35},
				{4.75, 2.8, 2.3, 1.85, 1.4},
				{4.9, 3.05, 2.4, 1.9, 1.45},
				{5.1, 3.2, 2.5, 2.0, 1.5}
		};
		
		// Print column headers
		for(int i = 0; i < columnHeaders.length; i++) {
			System.out.print("\t" + columnHeaders[i]);
		}
		System.out.println();
		// Print row headers and data
		for(int row = 0; row < unitsSold.length; row++) {
			// row header first
			System.out.print(rowHeaders[row] + "\t");
			// then after that the data of the row
			for(int column = 0; column < unitsSold[row].length; column++) {
				System.out.print(unitsSold[row][column] + "\t\t");
			}
			System.out.println();
		}
		
	}
	
}




