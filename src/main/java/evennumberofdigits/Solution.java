package evennumberofdigits;

import java.util.ArrayList;
import java.util.List;

class Solution {
    static java.util.List<Integer> getEvenDigitNumbers (int[] arr) {
        List<Integer> nums = new java.util.ArrayList<>();
        for(int x : arr) {
            if(evenNumberOfDigits(x)) {
                nums.add(x);
            }
        }

        return nums;
    }

    private static boolean evenNumberOfDigits(int n) {
        if(n == 0) {
            return false;
        }

        int i = 0;
        while(n >= 0) {
            n = n / 10;
            i++;
        }

        return i % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitNumbers(new int[]{0, 3, 11, 4, 200}));
    }
}
