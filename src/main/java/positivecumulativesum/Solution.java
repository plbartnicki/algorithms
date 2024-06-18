package positivecumulativesum;

import java.util.ArrayList;
import java.util.List;

/*     if (i > 0): cs[i] = cs[i-1] + a[i]
 *     if(i == 0): cs[i] = a[i]
 */
class Solution {
    static List<Integer> getPositiveCumulativeSum (int[] arr) {
        int cs = arr[0];
        List<Integer> result = new ArrayList<>();
        if(cs > 0) {
            result.add(cs);
        }
        for(int i = 1; i < arr.length; i++) {
            cs = cs + arr[i];
            if(cs > 0) {
                result.add(cs);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPositiveCumulativeSum(new int[]{1, -2, 3, 4, -6}));
        System.out.println(getPositiveCumulativeSum(new int[]{1, -1, -1, -1, 1}));
        System.out.println(getPositiveCumulativeSum(new int[]{1, 3, 5, 7}));
    }
}