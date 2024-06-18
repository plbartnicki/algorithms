package minabsdiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        if(arr.length < 2) {
            return null;
        }

        Arrays.sort(arr);
        int min = Math.abs(arr[1] - arr[0]);

        for(int i = 2; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i-1]);
            if(diff < min) {
                min  = diff;
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < arr.length - 1; i++) {
            if(Math.abs(arr[i+1] - arr[i]) == min) {
                result.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{4,2,1,3}));
        System.out.println(minimumAbsDifference(new int[]{1,3,6,10,15}));
        System.out.println(minimumAbsDifference(new int[]{1,105}));

    }
}