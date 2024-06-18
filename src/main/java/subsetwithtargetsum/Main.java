package subsetwithtargetsum;

import java.util.HashSet;
import java.util.Set;

/*
  Do optymalizacji, za duża złożoność
 */
public class Main {

    static boolean hasValidSubset(int[] A, int target) {
        int results[][][] = new int[501][501][501];

        //i <= j
        for(int j = 1; j < 501; j++) {
            for(int i = 1; i <= j; i++) {
                for(int k = 1; k < 501; k++)
                    results[i][j][k] = -1;
            }
        }

        return hasValidSubsetHelp(A, target, 1, A.length, results) == 0 ? false : true;
    }

    static int hasValidSubsetHelp(int[] A, int target, int i, int j, int results[][][]) {
        if(i > j || target < 0) return 0;

        //i <= j

        if(results[i][j][target] != -1) return results[i][j][target];

        //podproblem nie zostal wczesniej obliczony

        if(i == j) {
            if(A[i-1] != target) {
                results[i][j][target] = 0;
                return 0;
            }

            //i == j and A[i] == target
            results[i][j][target] = 1;
            return 1;
        }

        //i < j
        if(target - A[i-1] >= 0) {
            int q = hasValidSubsetHelp(A, target - A[i-1], i+1, j, results);
            if(q == 1) {
                results[i + 1][j][target - A[i-1]] = 1;   //czy jest sens zapisywac wynik podproblemu skoro chcemy przerwac szukanie rozwiazania?
                return 1;
            }

            results[i + 1][j][target - A[i-1]] = 0;
        }

        return hasValidSubsetHelp(A, target, i+1, j, results);
    }

    public static void main(String[] args) {
        System.out.println(hasValidSubset(new int[]{}, 1) == false);
        System.out.println(hasValidSubset(new int[]{1}, 2) == false);
        System.out.println(hasValidSubset(new int[]{1,2,3}, 4) == true);
        System.out.println(hasValidSubset(new int[]{1, 1, 2, 3, 4}, 5) == true); //1 + 4 = 5, 2+3 = 5
        System.out.println(hasValidSubset(new int[]{1, 3, 1, 3, 4}, 20) == false);

        System.out.println(hasValidSubset(new int[]{1, 3, 1, 3, 4, 1, 1, 2, 1, 3, 1, 1, 5, 1, 1}, 200) == false);
        System.out.println(hasValidSubset(new int[]{1, 3, 1, 1}, 200) == false);

    }
}
