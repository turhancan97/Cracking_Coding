public class App {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    
        System.out.println("Before rotation:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    
        rotate(matrix);
    
        System.out.println("After rotation:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    static void rotate (int [][] matrix) {

        if (matrix.length == 0 || matrix.length != matrix[0].length) return;
        int n = matrix.length;
    
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; // save top
    
    
                // left -> top
    
                matrix[first][i] = matrix[last-offset][first];
    
                // bottom -> left
                matrix[last-offset][first] = matrix[last ][last - offset];
    
    
                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];
    
                // top -> right
                matrix[i][last] = top; // right < - saved top
    
            }
        }

    }
}

