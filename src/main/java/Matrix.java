import java.util.ArrayList;

public class Matrix {
    public static int[] indexOfFirstNonZero(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};  // Ha a mátrix minden eleme 0 lenne
    }

    public static ArrayList<Integer> getMinimumOfRows(int[][] matrix) {
        ArrayList<Integer> minimumok = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) min = matrix[i][j];
            }
            minimumok.add(min);
        }
        return minimumok;
    }
}
