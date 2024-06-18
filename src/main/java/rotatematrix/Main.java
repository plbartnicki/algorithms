package rotatematrix;

/*
      0 1
    0 1 2
    1 3 4

      0 1
    0 3 1
    1 4 2

    (0, 0) -> (0, 1)
    (0, 1) -> (1, 1)
 */
class Main {

    static int[][] rotateMatrix(int[][] matrix){
        int n_rows = matrix.length;
        int n_columns = matrix[0].length;

        int [][]result = new int[n_columns][n_rows];

        //(0, 0) -> (0, 2)
        //(0, 1) -> (1, 2)
        //(1, 0) -> (0, 1)

        for(int i = 0; i < n_rows; i++) {
            for(int j = 0; j < n_columns; j++) {
                result[j][n_rows-1 - i] = matrix[i][j];
            }
        }

        return result;
    }

    /*
        pierwszy wiersz staje sie ostatnia kolumna
        drugi - przedostatnia
        ...
     */
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2},
                           {3, 4},
                           {5, 6}};

        rotateMatrix(matrix1);
    }
}
