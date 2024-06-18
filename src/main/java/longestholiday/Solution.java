package longestholiday;

/*
Given char array ('w','h' combination), and int value w=work day, h=holiday,
the int value represents the number of holidays that an employee can take off work.
Find the longest possible holiday sub array.

 */
public class Solution {

    public static int longestHoliday(char []T, int nh)
    {
        int maxH = 0;  //result
        int currlengthH = 0;

        char prevchar = 0;

        for(int i = 0; i < T.length; i++) {
            if(T[i] == 'h') {
                //nie ma znaczenia co było wcześniej
                currlengthH++;
                prevchar = 'h';
            } else {  //T[i] == 'w'
                if(prevchar == 'h') {  //czylli zakonczylismy czytanie ciagu h
                    if(currlengthH <= nh && currlengthH > maxH) {
                        maxH = currlengthH;
                    }
                    currlengthH = 0;
                }
                prevchar = 'w';
            }
        }

        if(currlengthH <= nh && currlengthH > maxH) {
            maxH = currlengthH;
        }

        return maxH;
    }

    public static void main(String[] args) {
        System.out.println(longestHoliday(new char[]{'w', 'h', 'w', 'h', 'h'}, 1));
        System.out.println(longestHoliday(new char[]{'w', 'h', 'w', 'h', 'h'}, 0));
        System.out.println(longestHoliday(new char[]{'w', 'h', 'w', 'h', 'h', 'h', 'w', 'h', 'h'}, 2));
    }
}
