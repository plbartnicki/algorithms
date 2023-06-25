package symetrypoint;

public class Main
{
	public int solution(String S) {
		if(S.length() == 0 || S.length() % 2 == 0) {
			return -1;
		}

		int i = 0;
		int j = S.length() - 1;
		while(i < j) {
			if(S.charAt( i )!= S.charAt( j )) {
				return -1;
			}
			i++;
			j--;
		}

		return i;
	}
}
