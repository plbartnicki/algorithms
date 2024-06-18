package removeduplicatesfromsortedarray;

import java.util.TreeSet;

class Solution {

    //without TreeSet
    /*

        najmniejsze przypadki nietrywialne [2,2], [2,3], [2,2,3] => opis idei w jezyku natyralnym

       i = 0  indeks glowny iteracyjny
       j = 0 indeks na kolejna wartosc wynikowa

       dopoki kolejny element jest nums[i] jest taki sam jak ostatnio przeczytant, to przechodz dalej i++
       jak natrafimy na nowa waetosc nums[i] to wstaw ja za nums[j++]

       return j+1  //wynik
     */
    public static int removeDuplicates(int[] nums) {

        //przypadki trywialne
        if(nums.length == 0) {
            return 0;
        }

        if(nums.length == 1) {
            return 1;
        }

        int lastIndex = nums.length - 1;
        int lastUnique = nums[0];
        int i = 1;  //indeks ostatniego badanego elementu
        int j = 1;  //indeks na wolne miejsce na kolejny unikatowy element

        while(i <= lastIndex) {

            while(i <= lastIndex && nums[i] == lastUnique) {
                i++;
            }
            //dwie mozliwosci: a) dojechalismy poza zakres tablicy i nie bylo nowej wartosci  b)  pojawila sie nowa wartosc => nie wyjechalismy poza zakkres tablicy

            //a)
            if(i > lastIndex) {
                return j;
            }

            //b)
            if(nums[i] != lastUnique) {  //mozna pozbyc sie zmiennej lastUnique
                lastUnique = nums[i];
                nums[j++] = nums[i];
            }

            i++;
        }

        return j;
    }

    //without lastUnique variable
    public static int removeDuplicatesb(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        if(nums.length == 1) {
            return 1;
        }

        int i = 1;
        int j = 0;

        while(i <= nums.length - 1) {
            while(i <= nums.length - 1 && nums[i] == nums[j]) {
                i++;
            }

            if(i > nums.length - 1) {
                return j+1;
            }

            if(nums[i] != nums[j]) {  //mozna pozbyc sie zmiennej lastUnique
                j++;
                nums[j] = nums[i];
            }

            i++;
        }

        return j+1;
    }

    public static int removeDuplicates2(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int k = set.size();
        int i = 0;
        for(Integer el : set) {
            nums[i++] = el;
        }
        return k;
    }

    public static void main(String[] args) {
        int t1[] = new int[]{2,2, 3};
        System.out.println(removeDuplicatesb(t1));
        for(Integer el : t1) {
            System.out.println(el);
        }
    }
}