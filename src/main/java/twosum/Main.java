package twosum;



public class Main {

    /* Nie mozna wziac 2x tego samego elementy
    Dodaj elementy z A do mapy (wartosc indeks)
    dla kazdego elementu
     */

    static int[] twoSum(int[] A, int target) {
        // add your logic here
        java.util.Map<Integer, java.util.List<Integer>> map = new java.util.HashMap<>();
        for(int i = 0; i < A.length; i++) {
            java.util.List<Integer> lst = map.get(A[i]);
            if(lst != null) {
                lst.add(i);
            }
            else {
                lst = new java.util.ArrayList<>();
                lst.add(i);
                map.put(A[i], lst);
            }
        }

        for(int i = 0; i < A.length; i++) {
            int x = A[i];
            int y = target - x;

            java.util.List<Integer> lst = map.get(y);
            if(y != x) {
                if (lst != null) {
                    return new int[]{i, lst.get(0)};
                }
            }
            else //y == x
            {
                if(lst.size() >= 2) {
                    return new int[]{lst.get(0), lst.get(1)};
                }
            }
        }

        return new int[]{};
    }

    private static void print(int T[]) {
        for(int x : T) {
            System.out.print(x+ " ");
        }
    }

    public static void main(String[] args) {
        print(twoSum(new int[]{1, 2}, 3));  //0, 1
        System.out.println();
        print(twoSum(new int[]{1, 3, 3, 4}, 5));  //0, 3
        System.out.println();
        print(twoSum(new int[]{1, 2, 1}, 2));  //0, 2
        System.out.println();
        print(twoSum(new int[]{1, 1, 1}, 2));  //0, 1

        print(twoSum(new int[]{8,2, 10, 4, 1, 3}, 9));  //0, 4
        print(twoSum(new int[]{2, 4, 2, 3, 2}, 7));  //1, 3
    }
}
