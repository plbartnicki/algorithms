import dynamicprogramming.DiscreteKnapsackProblem;
import dynamicprogramming.Item;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DiscreteKnapsackProblemTest
{
	@Test
	public void testMaxValue() {
		Item[] items1 = new Item[]{
			createItem(6, 2),
			createItem(11, 1),
			createItem(6, 2)
		};
		assertEquals(17, DiscreteKnapsackProblem.maxValue(items1, 4  ), 0);

		Item[] items2 = new Item[]{
			createItem(10, 2),
			createItem(5, 1),
			createItem(2, 1),
			createItem(9, 1)
		};
		assertEquals(19,  DiscreteKnapsackProblem.maxValue(items2, 3  ), 0);
	}

	public Item createItem(int value, int weight) {
		return new Item(value, weight);
	}

}
