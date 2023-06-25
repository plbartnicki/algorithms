import org.junit.Test;
import firstuniquecodility.Main;

import static org.junit.Assert.assertEquals;

public class FirstUniqueTest
{
	@Test
	public void test() {
		Main main = new Main();

//		A[0] = 1
//		A[1] = 4
//		A[2] = 3
//		A[3] = 3
//		A[4] = 1
//		A[5] = 2
		assertEquals(4, main.solution( new int[]{1,4,3,3,1,2} ));
		assertEquals(-1, main.solution( new int[]{6,4,4,6} ));

	}
}
