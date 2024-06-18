package anagrams;

import java.util.HashSet;
import java.util.Set;

class Solution {
    static boolean areAnagrams(String A, String B) {
        if(A.length() != B.length()) return false;
        
        int []letters = new int[26];

        for(char c : A.toCharArray()) {
            letters[(int)c - 97]++;
        }

        for(char c : B.toCharArray()) {
            letters[(int)c - 97]--;
        }

        for(int i = 0; i < 26; i++) {
            if(letters[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("abc", "abd"));
        System.out.println(areAnagrams("apple", "pplae"));
        System.out.println(areAnagrams("workattech", "worktattch"));
        System.out.println(areAnagrams("bba", "aba"));
    }
}