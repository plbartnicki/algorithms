package sizeafterremovingduplicates;

public class Main {

    static int removeDuplicates(int[] A) {
        //idea: counter = 0, iteracja od podczatku i jak natrafimy na wartosc inna niz wczesniej wczytana, to zwiekszenie counter o 1
        int counter = 1;
        int lastUnique = A[0];

        for(int i = 1; i < A.length; i++) {
            if(A[i] != lastUnique) {
                counter++;
                lastUnique = A[i];
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1}) == 1);
        System.out.println(removeDuplicates(new int[]{1, 1, 2}) == 2);

        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2}) == 2);
        System.out.println(removeDuplicates(new int[]{1, 3, 3, 3, 4, 4}) == 3);
        System.out.println(removeDuplicates(new int[]{1, 2, 3, 3, 3, 4, 5, 5}) == 5);

    }
}
