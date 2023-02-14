import java.util.Arrays;

public class App {
    public static void setZeros(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        // Store the row and column index with values 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // Nullify rows
        for (int i = 0; i < row.length; i++) {
            if (row[i])
                nullifyRow(matrix, i);
        }

        // Nullify columns
        for (int j = 0; j < column.length; j++) {
            if (column[j])
                nullifyColumn(matrix, j);
        }
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }

    private static void nullifyColumn(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 0, 7, 8}, {9, 10, 11, 0}, {13, 14, 15, 16}};

        System.out.println("Before:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        setZeros(matrix);

        System.out.println("After:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }      
}
