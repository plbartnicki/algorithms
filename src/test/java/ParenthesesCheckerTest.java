import org.junit.Test;
import parenthesesbalanced.ParenthesesChecker;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParenthesesCheckerTest {
    @Test
    public void testParenthesesBalanced() {
        assertTrue(ParenthesesChecker.areParenthesesBalanced("()"));
        assertTrue(ParenthesesChecker.areParenthesesBalanced("(())"));
        assertTrue(ParenthesesChecker.areParenthesesBalanced("(()())"));
        assertFalse(ParenthesesChecker.areParenthesesBalanced(")("));
        assertFalse(ParenthesesChecker.areParenthesesBalanced("(()))"));
        assertFalse(ParenthesesChecker.areParenthesesBalanced("(()"));

        assertTrue(ParenthesesChecker.areParenthesesBalanced("[]"));
        assertTrue(ParenthesesChecker.areParenthesesBalanced("[[]]"));
        assertTrue(ParenthesesChecker.areParenthesesBalanced("[[][]]"));
        assertFalse(ParenthesesChecker.areParenthesesBalanced("]["));
        assertFalse(ParenthesesChecker.areParenthesesBalanced("[[]]]"));
        assertFalse(ParenthesesChecker.areParenthesesBalanced("[[]"));

        assertTrue(ParenthesesChecker.areParenthesesBalanced("([])"));
        assertTrue(ParenthesesChecker.areParenthesesBalanced("(([[]]))"));
        assertTrue(ParenthesesChecker.areParenthesesBalanced("[](())"));
        assertTrue(ParenthesesChecker.areParenthesesBalanced("([])[[]]"));
        assertTrue(ParenthesesChecker.areParenthesesBalanced("()[[]]"));

        assertTrue(ParenthesesChecker.areParenthesesBalanced("([]){[()]}"));
    }
}
