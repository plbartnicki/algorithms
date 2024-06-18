package matrixpaths;

public class Solution {

    static int getNumPaths(int rows, int columns) {
        int [][] M = new int[rows+1][columns+1];

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= columns; j++) {
                if(i == 1 || j == 1) {
                    M[i][j] = 1;
                }
                else {
                    M[i][j] = M[i][j-1] + M[i-1][j];
                }
            }
        }

        return M[rows][columns];
    }

    public static void main(String[] args) {
        System.out.println(getNumPaths(1, 1) == 1);
        System.out.println(getNumPaths(1, 2) == 1);
        System.out.println(getNumPaths(2, 1) == 1);
        System.out.println(getNumPaths(2, 3) == 3);
        System.out.println(getNumPaths(3, 3) == 6);
        System.out.println(getNumPaths(5, 5) == 70);
    }
}
