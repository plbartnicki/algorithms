package encoding;

public class Solution {

    /*
        aabbbc -> 2a3b1c

        wczytaj do zmiennej kolejny znak i jesli jest taki sam jak poprzedni znak
        to zwieksz zmienna-licznik
        w.p.w. (czyli jesli jest inny), doklej do wyniku licznik i ostatnio przeczytany znak
     */
    public static String encoding(String input) {
        if(input == null || input.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        char prevChar = input.charAt(0);
        int numOfPrevChar = 1;

        for(int i = 1; i < input.length(); i++) {
            char currChar = input.charAt(i);
            if(prevChar == currChar) {
                numOfPrevChar++;
            }
            else {  //natrafiono na nowy znak
                sb.append(numOfPrevChar).append((prevChar));
                prevChar = input.charAt(i);  //dla kolejnej iteracji
                numOfPrevChar = 1;
            }
        }

        sb.append(numOfPrevChar).append((prevChar));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(encoding("aabbba"));
    }
}
