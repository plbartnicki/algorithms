package longestsubstringwithoutrepetitions;

import java.util.HashSet;
import java.util.Set;

/*
   ab - 2
   abba -> 2 (ab)
   abcd -> 4

   Rozwiazanie:
   spostrzeżenie: jeżeli substring s nie ma powtórzeń, to nie istnieje dłuższy jego substring bez powtrzeń
   należy więc analizować substringi bez powtórzeń od najdłuższego
 */
public class Solution {

    public static boolean noRep(String s, int b, int e) {
        Set<Character> characterSet = new HashSet<>();
        for(int i = b; i <=e; i++) {
            characterSet.add(s.charAt(i));
        }

        return e-b+1 == characterSet.size();
    }
    public static int longest(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        if(s.length() == 1) {
            return 1;
        }

        int max = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                if(noRep(s, j, i) && i - j + 1 > max)  {
                    max = i - j + 1;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(longest("abba"));
        System.out.println(longest("abcd"));
        System.out.println(longest("ABCDEFGABEF"));
    }
}
