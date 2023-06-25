package longestsequenceofthesamechars;

public class Main
{
	/*
		abbbabbccccccaa -> 6(c)
		abb-> b(2)
		a-> 1(a)
		ab -> a(1)

		Idea jak wczytany znak jest inny niz poprzednio to znaczy ze zakonczylismy czytanie pewnego lancucha i wtedy:
			jesli curr (dlugosc nancucha) jest > lastLongest to lastLongest = curr
			resetujemy zliczanie curr do 1
	 */
	public static int longestSequence( String word ) {
		if(word.length() < 2) {
			return word.length();
		}

		char x = word.charAt( 0 );   //znak biezacego (badanego lancucha)

		int lastLongest = 0;    //ostatni najdluzszy ciag takich samych znakow; wynik
		int curr = 1;  //ilosc znakow w biezacym lancuchu,
		for(int i = 1; i < word.length(); i++) {
			if(word.charAt( i ) == x) {
				curr++;
			} else {
				if(curr > lastLongest)
				{
					lastLongest = curr;
				}
				curr = 1;
				x = word.charAt( i );
			}
		}

		return lastLongest;
	}
}
