package discreteknapsackproblem;

/* Specyfikacja
	# Dane:
	# W0, ... Wn-1 : wagi n przedmiotów
	# C0, ...Cn-1 : ceny n przedmiotów
	# w : maksymalny udźwig plecaka

	#Wynik:
	# taki podzbiór przedmiotow 0, .., n-1 że suma wag tych przedmiotów <= w oraz suma cen jest maksymalna

	# ----------------------

	# Oznaczenia użyte w implementacji oraz opis ogólnej koncepcji (rekurencyjnie)
	# F(i, j) : najepsze upakowanie (suma cen) przedmiotów 0, .., i przy dostępnym miejscu j

	# F(i, j) =
	# 'Bierzemy i-ty przedmiot'
	# jeżeli Wi > j to return F(i-1, j)     'czyli jeśli waga itego przedmiotu jest za duża w stosunku do wolnego miejsca z wcześniejszymi przemdiotami dającymi najlepsze upakowanie, to nie bierzemy tego przedmiotu
	# jeżeli Wi <= j to:   'czyli gdy waga itego przedmiotu, jest taka, że przedmiot zmieściłby się w plecaku
	#      withi = Ci + F(i-1, j - wi)
	#      'bierzemy ten przedmiot i pytamy o najlepsze upakowanie wczesniejszych przedmiotow z wolnym miejscem zmiejszonym o wagę tego przedmiotu
	#
	#      'nie bierzemy tego przedmiotu i pytamy o najlepsze upakowanie wcześniejszych przedmiotów z niezmienionym wolnym miejscem (bo nie bierzemy tego przedmiotu)
	#      withouti = F(i - 1, j)
	#
	#      'wybieramy najlepsze upakowanie

	#      return max{withi, withouti}  */

public class DiscreteKnapsackProblem
{
	public static int maxValue(final Item []items, final int maxWeight) {
		int numberOfItems = items.length;
		int [][]A = new int[numberOfItems + 1][maxWeight + 1];

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
