package nextgreaterelement;

public class Solution {

    //mimo tego ze wymienione tutaj testy sa zaliczane, istnieje jakis przypadek testowy ktorego https://workat.tech nie zalicza
    //najmniejsza wartosc z arr, ktora jest wieksza niz key
    //jesli key jest wiekszy od wszystkich wartosci, zwrocic key
    //jesli key jest rowny najwiekszej wartosci, zwrocic key

    /*
        wyszykaj binarnie taki element x w arr, ze ze x = key oraz kolejny element po x jest wiekszy niz x
        np. dla 1, 2, 3, 3, 4, 4, 8, 10 zostaje znaleziona druga czworka

        jesli element zostal znaleziony
            zwroc kolejny element
        w.p.w (nie zostal znalezniony), zwroc key
     */
    static int getNextGreaterElement (int[] arr, int key) {
        int i = 0;
        int j = arr.length - 1;

        while(i <= j) {
            int s = (i+j)/2;

            if(arr[s] == key) {
                if((s+1) <= arr.length - 1) {
                    if(arr[s+1] > arr[s]) {   //jesli istnieje kolejny element i jest wiekszy
                        return arr[s + 1];
                    } else {  //czyli istnieje kolejny element ale nie jest wiekszy wiec musi byc rowny
                        i = s + 1;
                    }
                } else {  //nie istnieje kolejny element
                    return key;
                }
            }
            else if(arr[s] < key){
                i = s + 1;
            } else {  //=> arr[s] > key
                j = s - 1;
            }
        }

        if(key < arr[0]) {
            return arr[0];
        }

        return key;
    }

    public static void main(String[] args) {
        System.out.println(getNextGreaterElement(new int[]{1}, -1) == 1);
        System.out.println(getNextGreaterElement(new int[]{1}, 2) == 2);

        System.out.println(getNextGreaterElement(new int[]{1}, 1) == 1);
        System.out.println(getNextGreaterElement(new int[]{1, 2, 3}, 1) == 2);
        System.out.println(getNextGreaterElement(new int[]{1, 1}, 2) == 2);

        System.out.println(getNextGreaterElement(new int[]{1, 2, 3, 3, 4, 4, 8, 10}, 4) == 8);
        System.out.println(getNextGreaterElement(new int[]{1, 2, 3, 3, 4, 4, 8, 10}, 4) == 8);
        System.out.println(getNextGreaterElement(new int[]{1, 2, 3, 3, 3, 4, 4, 5}, 5) == 5);
        System.out.println(getNextGreaterElement(new int[]{1, 2, 3, 3, 3, 4, 4, 5}, -5) == 1);

        System.out.println(getNextGreaterElement(new int[]{-2, -1, 3, 4}, -2) == -1);
        System.out.println(getNextGreaterElement(new int[]{-2, -1, 3, 4}, -1) == 3);

        System.out.println(getNextGreaterElement(new int[]{-2, -1, 3, 4}, -1) == 3);

    }
}
