import org.junit.Test;
import sequencecontainssequence.Main;

import static org.junit.Assert.assertEquals;
import static sequencecontainssequence.Main.contains;

public class SequencecontainssequenceTest
{
	@Test
	public void test() {
		assertEquals(true, contains("ab", "ab"));
		assertEquals(true, contains("abc", "bc"));
		assertEquals(true, contains("abcd", "bc"));
		assertEquals(false, contains("ab", "abc"));
		assertEquals(false, contains("abc", "abe"));
		assertEquals(false, contains("abc", "be"));
	}
}
