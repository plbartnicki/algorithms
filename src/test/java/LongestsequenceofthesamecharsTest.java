import org.junit.Test;

import static org.junit.Assert.assertEquals;
import longestsequenceofthesamechars.Main;

public class LongestsequenceofthesamecharsTest
{
	@Test
	public void test() {
		assertEquals(3, Main.longestSequence("abbcccaa"));
		assertEquals(0, Main.longestSequence(""));
		assertEquals(1, Main.longestSequence("a"));
		assertEquals(1, Main.longestSequence("ab"));
		assertEquals(4, Main.longestSequence("aaaabb"));
	}
}
