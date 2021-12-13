import org.junit.Test;

import static longestcommonsubsequence.LongestCommonSubsequence.lcs;
import static org.junit.Assert.assertEquals;

public class LongestCommonSubsequenceTest
{
	@Test
	public void testLCS( )
	{
		assertEquals( 0, lcs( "", "xab" ) );
		assertEquals( 0, lcs( "xab", "" ) );
		assertEquals( 4, lcs( "test", "test" ) );
		assertEquals( 2, lcs( "axb", "xab" ) );

		assertEquals( 6, lcs( "quantum", "quntum"));
		assertEquals( 6, lcs( "quantum", "quntum"));
	}
}
