import org.junit.Test;
import symetrypoint.Main;

import static org.junit.Assert.assertEquals;

public class SymetrypointTest
{
	@Test
	public void test() {
		Main main = new Main();
		assertEquals(3, main.solution( "racecar") );
		assertEquals(-1, main.solution( "ab") );
		assertEquals(-1, main.solution( "") );
		assertEquals(0, main.solution( "a") );
		assertEquals(-1, main.solution( "bb") );
	}
}
