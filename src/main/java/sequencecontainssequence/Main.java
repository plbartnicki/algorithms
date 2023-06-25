package sequencecontainssequence;

public class Main
{
	private static boolean equals(String str, int i, int j, String substr) {
		int k = i;
		int l = 0;
		while(k <= j) {
			if(str.charAt( k ) != substr.charAt( l )) {
				return false;
			}
			k++;
			l++;
		}

		return true;
	}

	public static boolean contains(String str, String substr) {
		//true if str contains substr

		/*
			str.length >= s2.substr

			true:
			s1: abcd
			s2: bc

			true:
			s1: abcbe
			s2: be

			false:
			s1: abc
			s2: be

			idea:
		 */
		int strlength = str.length();
		int substrlength = substr.length();

		if(strlength < substrlength) {
			return false;
		}

		int lastInd = strlength - substrlength;
		for(int i = 0; i <= lastInd; i++) {
			if(equals(str, i, i + substrlength - 1, substr)) {
				return true;
			}
		}

		return false;
	}

//	public static boolean containsSubstring(String s1, String s2) {
//
//	}

	public static void main( String[] args )
	{

	}
}
