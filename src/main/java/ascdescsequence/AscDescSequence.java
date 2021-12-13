package ascdescsequence;

/*
	Find the max value from the sequence where asc values are first, then there are desc values
	For example: for given array = [1,2,2,3,2,1]   the result is 3
 */
public class AscDescSequence
{
	public static int max( int[] numbers, int b, int e )
	{
		//rek
		if ( b == e )
		{
			return numbers[ b ];
		}

		int k = ( b + e ) / 2;

		if ( numbers[ k + 1 ] >= numbers[ k ] )
		{
			return max( numbers, k + 1, e );
		}
		else
		{
			return max( numbers, b, k );
		}
	}

	public static int maxIter( int[] numbers, int b, int e )
	{
		while ( b < e )
		{
			int k = ( b + e ) / 2;

			if ( numbers[ k + 1 ] >= numbers[ k ] )
			{
				b = k + 1;
			}
			else
			{
				e = k;
			}
		}

		return numbers[ b ];
	}
}
