package week8;

public class LearningRaggedArray {

	public static void main(String[] args) {
		int[][] triangleArray = new int[3][];
		triangleArray[0] = new int[3];
		triangleArray[1] = new int[2];
		triangleArray[2] = new int[1];
		// Fill in first row
		triangleArray[0][0] = 1;
		triangleArray[0][1] = 2;
		triangleArray[0][2] = 3;
		// Fill in second row
		triangleArray[1][0] = 1;
		triangleArray[1][1] = 2;
		// Fill in third row
		triangleArray[2][0] = 1;
		
		for(int row = 0; row < triangleArray.length; row++) {
			for(int column = 0; column < triangleArray[row].length; column++) {
				System.out.print(triangleArray[row][column] + "\t");
			}
			System.out.println();
		}
		
		int[][] triangleArray2 = {
				{1, 2, 3},
				{1, 2},
				{1}
		};
	}
	
}
