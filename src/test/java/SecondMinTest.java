import org.junit.Test;
import secondmin.Main;

import static org.junit.Assert.assertEquals;

public class SecondMinTest
{
	@Test
	public void secondMin() throws Exception
	{
		assertEquals(2, Main.secondMin( new double[]{2,1} ), 0);
		assertEquals(1, Main.secondMin( new double[]{0,1, 2} ), 0);
		assertEquals(2, Main.secondMin( new double[]{1,2,3,3,4,4} ), 0);
		assertEquals(2, Main.secondMin( new double[]{1,2,3,4,5} ), 0);
		assertEquals(2, Main.secondMin( new double[]{4,3,2,1} ), 0);
		assertEquals(2, Main.secondMin( new double[]{4,3,2,1,1} ), 0);
		assertEquals(3, Main.secondMin( new double[]{5,6,6,7,3,7,2} ), 0);
	}
}
