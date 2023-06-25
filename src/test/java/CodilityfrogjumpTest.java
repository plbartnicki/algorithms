import org.junit.Test;
import  codilityfrogjump.Main;

import static org.junit.Assert.assertEquals;

public class CodilityfrogjumpTest
{
	@Test
	public void test() {
		Main main = new Main();
		/*
		  A[0] = 1
		  A[1] = 3
		  A[2] = 1
		  A[3] = 4
		  A[4] = 2
		  A[5] = 3
		  A[6] = 5
		  A[7] = 4
		 */
		assertEquals(6, main.solution( 5, new int[]{1,3,1,4,2,3,5,4} ));

		assertEquals(4, main.solution( 4, new int[]{1,3,1,4,2,3,5,4} ));
	}
}
