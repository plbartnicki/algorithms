package longestpalindrom;

/**  a -> a
 *   aa -> aa
 *   ab -> a | b
 *   aba -> aba
 *   baa -> aa
 *   aab -> aa
 *   abc -> a | b | c
 *
 *
 *
 */

public class LongestPalindrom
{
	public static int findLongest(int []T, int i, int j) {
		if(i > j) {
			return 0;
		}

		if(i == j) {
			return 1;
		}
		int k = 0;
		int M[][];

		while(true) {
			if(T[i] == T[j]) {
				k+=2;
				i++;
				j--;
			} else {
				if(i == k) {
					return k;
				}
				else {
					//M[i][j] = max
				}
			}
		}
	}
}
