import org.junit.Test;

import static ascdescsequence.AscDescSequence.maxIter;
import static org.junit.Assert.assertEquals;

public class AscDescSequenceTest
{
	@Test
	public void maxIterTest() {
		assertEquals(2, maxIter( new int[] { 1, 2, 1 }, 0, 2 ) );
		assertEquals(3, maxIter( new int[] {  1, 2, 3, 2, 1 }, 0, 4 ) );
		assertEquals(35, maxIter( new int[] {  3, 6, 8, 13, 20, 35, 33, 30, 21, 17, 14, 2, 1, -2 }, 0, 13 ) );
	}
}
