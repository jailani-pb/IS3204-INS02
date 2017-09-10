package week8;

public class LearningMultiDimensionalArray {

	public static void main(String[] args) {
		// Three dimensional array
		int[][][] cubeData = {
				{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
				{{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
				{{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
		};
		
		// Retrieve all elements
		for(int x = 0; x < cubeData.length; x++) {
			for(int y = 0; y < cubeData[x].length; y++) {
				for(int z = 0; z < cubeData[x][y].length; z++) {
					System.out.println(cubeData[x][y][z]);
				}
			}
		}
	}
	
}
