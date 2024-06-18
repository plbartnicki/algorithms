package subarraywithmaxsum;

public class Main {
    /*
       Podstawowa idea
        array = AB    gdzie A i B są rozkładem ciągu array na dwa kolejne podciągi (A i B)
        jeśli suma elementów A jest ujemna, to nie ma sensu dodawać liczb z A do wyniku (sumy), podciągu o największej sumie
          należy więc szukać w B

       Aby zrozumieć ideę najlepiej przeanalizować poniższy algorytm, zaczynając od przypadku [-2, -1] a następnie [-2, -1, 4]

       W pewnym momencie może być tak, że result dotyczy maksymalnej sumy w A, natomiast current_sum dotyczy aktualnej sumy w B
     */
    static int maxSubArraySum(int array[])
    {
        int size = array.length;
        int result = Integer.MIN_VALUE;  //dotychczasowe maximum - wynik
        int current_sum  = 0;  //suma kolejnego podciagu - kandydata na podciag ktory ma najwieksza sume

        for (int i = 0; i < size; i++) {
            current_sum = current_sum + array[i];

            if (current_sum > result)
                result = current_sum;

            if (current_sum < 0)
                /*
                    jesli current_sumd dla danego podciagu osiagnie wartosc ujemna, to liczby tego podciagu nie ma
                    sensu dodac do wyniku. Resetujemy wiec current_sum aby w kolejnej iteracji konstruowac sume kolejengo podciagu-kandydata
                 */
                current_sum = 0;
        }
        return result;
    }

    /*
        array = [2, -1, 3]

        W kolejnych wierszach sa wartosci zmiennych po wykonaniu i-tej iteracji
        i = 0 current_sum = 2 result = 2
        i = 1 current_sum = 1 result = 2
        i = 2 current_sum = 4 result = 4
     */

    public static void main(String[] args) {
        System.out.println(maxSubArraySum(new int[]{ -2, -1}));
        System.out.println(maxSubArraySum(new int[]{ 2, -1, 3}));
        System.out.println(maxSubArraySum(new int[]{ 1, -2, 3}));
        System.out.println(maxSubArraySum(new int[]{ -1, 2, -1, 2}));
    }
}
