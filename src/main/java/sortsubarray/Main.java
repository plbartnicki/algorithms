package sortsubarray;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    private static int  groupAndSort(Integer  arr[]) {
        /*
            2 3  -> 3 2
            4 6 1 3 -> 3 1 6 4
         */

        int i = 0;
        int k = arr.length - 1;

        while(i < k && i < arr.length && k >= 0) {
            while(i < arr.length && arr[i] % 2 != 0 ) {
                i++;
            }

            while(k >= 0 && arr[k] % 2 == 0) {
                k--;
            }

            if(i < k) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
                k--;
            }
        }

        return i;
    }
    public static void main(String[] args) {
        //Integer  arr[] = {2,1,3,1,6,5};
        Integer  arr[] = {2,4,3,1,3,5};
        int index = groupAndSort(arr);
        System.out.println("Index: " + index);
        Arrays.sort(arr, 0, index);
        Arrays.sort(arr, index+1, arr.length, Collections.reverseOrder());
        for(int x : arr) {
            System.out.println(x);
        }
    }
}
