package firstuniquecodility;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main
{
	public int solution(int[] A) {
		//int []t = new int[1000000000];

		Set<Integer> allVals = new HashSet<>(  );  //wszystkie dotychczasowe wartosci
		Set<Integer> lastUnique = new LinkedHashSet<>(  );  //kandydaci na unikalne wartosci

		//Podstawowa idea: jesli kolejna wartosc z A, nie nalezy do zbioru wszystkich dotychczasowych wartosci
		//to jest to kandydat na wynik i dodajemy ta wartosc do allVals i lastUnique

		for(int x : A) {
			if(allVals.contains( x )) {
				lastUnique.remove( x );
			} else {
				allVals.add( x );
				lastUnique.add(x);
			}
		}

		return lastUnique.size() == 0 ? -1 : lastUnique.stream().findFirst().get();
	}

	public static void main( String[] args )
	{

	}
}
