package substr;

public class Main {

    /*
         Jezeli needle wystepuje w haystack to funkcja zwraca indeks od ktorego sie zaczyna
         w.p.w zwraca -1
     */

   static public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) {
            return -1;
        }

        //needle.length() <= haystack.length()
       /*
              needle [0, ..,1]  haystack[0,..2]
        */
       int k = 0;   //indeks zwiazany z haystack

       while(k + needle.length() - 1  <= haystack.length() - 1) {

           //sprawdzamy
           boolean equals = true;
           for(int i = 0; i < needle.length(); i++) {  //indeks zwiazany z needle
               if(needle.charAt(i) != haystack.charAt(i+k)) {
                   equals = false;
                   break;
               }
           }

           if(equals) {
               return k;
           }

           k++;
       }


       return -1;
   }
    public static void main(String[] args) {
       System.out.println(strStr("abc", "") == 0);
       System.out.println(strStr("ab", "abc") == -1);
        System.out.println(strStr("ab", "b") == 1);
        System.out.println(strStr("abc", "c") == 2);
        System.out.println(strStr("dab", "ab") == 1);
       System.out.println(strStr("sadbutsad", "sad") == 0);
       System.out.println(strStr("leetcode", "leeto") == -1);

    }
}
