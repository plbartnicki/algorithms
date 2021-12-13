package dynamicprogramming;

public class DiscreteKnapsackProblem
{
	public static int maxValue(final Item []items, final int maxWeight) {
		int numberOfItems = items.length;
		int [][]A = new int[numberOfItems + 1][maxWeight + 1];

		for(int i = 0; i < numberOfItems + 1; i++) {
			A[i][0] = 0;
		}
		for(int i = 0; i < maxWeight + 1; i++) {
			A[0][i] = 0;
		}

		for(int i = 1; i < numberOfItems + 1; i++) {
			for(int j = 1; j < maxWeight + 1; j++) {
				if(items[i-1].getWeight() > j) {
					A[i][j] = A[i-1][j];
				} else {
					int maxWithI = items[i-1].getValue() + A[i-1][j-items[i-1].getWeight()];
					int maxWithoutI = A[i-1][j];
					A[i][j] = maxWithI > maxWithoutI ? maxWithI : maxWithoutI;
				}
			}
		}

		return A[numberOfItems][maxWeight];
	}

}
