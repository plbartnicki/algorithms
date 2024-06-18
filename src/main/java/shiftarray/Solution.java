package shiftarray;

import java.util.Arrays;

/*
   Dane
   [1], k -> [1]
   [1,2], 1 -> [2,1]
   [1,2,3], 2 -> [2, 3, 1]

   1. Symulacja podstawowej ideii na odpowiednim przykladzie
    [1,2,3], k = 2,    res=[2, 3, 1]

    T= [2,3,1], k = 2
    cp=[1,2,3]

   i = 0
   T[0 + 2 % 3] == T[2] = cp[0]
   i = 1
   T[1 + 2 % 3] == T[0] = cp[1]
   i = 2
   T[2 + 2 % 3] == T[1] = cp[2]

   T[(i + k) % n] = Tcp[i]

 */
public class Solution {

    public static void shift(int []T, int k) {
        int []Tcp = Arrays.copyOf(T, T.length);
        int n = T.length;
        for(int i = 0; i < n; i++) {
            T[(i + k) % n] = Tcp[i];
        }
    }

    public static void shift_in_place(int []T, int k) {
        int op = 1;
        int i = 0;
        int n = T.length;

        int temp = T[i];  //wartosc ktora napiszemy komorke j
        int temp2;  //wartosc nadpisanej komorki

        while(op <= n) {
            i  = (i+k)%n;     //indeks komorki za ktora zostanie powstawiona wartosc z komorki i
            temp2 = T[i];
            T[i] = temp;
            temp = temp2;
            op++;
        }
    }

    public static void main(String[] args) {
        int []T = {1,2,3};
        shift_in_place(T, 2);

        for(int x : T) {
            System.out.println(x);
        }
    }

}
