package maximumsubarray;

public class Solution {

    /*
    def  max_subarray ( liczby ):
        """Znajdź największą sumę dowolnej ciągłej podtablicy."""
        best_sum  =  -  nieskończoność
        suma_bieżąca  =  0
        dla  x  w  liczbach :
            suma_bieżąca  =  max ( x ,  suma_bieżąca  +  x )
            najlepsza_suma  =  max ( najlepsza_suma ,  bieżąca_suma )
        zwróć  najlepszą_sumę
     */
    public static int maxSubArray(int[] nums) {
        int best_sum  = Integer.MIN_VALUE;
        int curr_sum  =  0;

        for(int x : nums) {
            curr_sum = Math.max(x, curr_sum + x);
            best_sum = Math.max(best_sum, curr_sum);
        }

        return best_sum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{1,2, -10}));
        System.out.println(maxSubArray(new int[]{-3, 1, 2, 4, -5}));
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
