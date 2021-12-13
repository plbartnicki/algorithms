package longestcommonsubsequence;

/*
        abx
        xab
        result = 2 (=|ab|)
 */
public class LongestCommonSubsequence
{
	public static int lcs( String s1, String s2 )
	{
		int n = s1.length( );
		int m = s2.length( );

		int[][] A = new int[ n + 1 ][ m + 1 ];
		/*
				A[i][j] is LCS of subsequences: 1..i  and 1..j
				A[0][j] = 0
				A[i][0] = 0
		 */

		for ( int i = 1; i < n + 1; i++ )
		{
			for ( int j = 1; j < m + 1; j++ )
			{
				if ( s1.charAt( i - 1 ) == s2.charAt( j - 1 ) )
				{
					A[ i ][ j ] = 1 + A[ i - 1 ][ j - 1 ];
				}
				else
				{
					int x = A[ i - 1 ][ j ];
					int y = A[ i ][ j - 1 ];
					A[ i ][ j ] = x > y ? x : y;
				}
			}
		}
		return A[ n ][ m ];
	}

}
