package codilityfrogjump;

import java.util.HashSet;
import java.util.Set;

public class Main
{
	/*
		set = {}
		sum = 0
		dla kazdego elementu e z A
			jesli e nie należy do set
				set.add(e)
				sum += e

			jesli sum = 1 + 2 + ... X-1 to zakoncz alg

	 */
	public int solution(int X, int[] A) {
		int expsum = (1+X)*X/2;
		Set<Integer> set = new HashSet<>(  );
		int actsum = 0;

		for(int i = 0; i < A.length; i++) {
			if(!set.contains( A[i] )) {
				set.add( A[i] );
				actsum += A[i];
			}
			if(expsum == actsum) {
				return i;
			}
		}

		return -1;
	}

	public static void main( String[] args )
	{

	}
}
