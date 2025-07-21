// array 배열
package array;

// multi-dimensional array 다차원 배열
public class ArrayDi01 {

	public static void main(String[] args) {
		int[][] arrDi1 = new int[3][4]; // 3행 4열
		int[][] arrDi2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, };
		int[][] arrDi3 = { { 10, 20 }, { 30, 50 }, { 70, 90 }, }; // 3행 2열

		for (int i = 0; i < arrDi3.length; i++) {
			for (int j = 0; j < arrDi3[i].length; j++) {
				System.out.print(arrDi3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
