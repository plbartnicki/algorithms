public class codilityMaxTriplet
{/*
	A[0] = -3
	A[1] = 1
	A[2] = 2
	A[3] = -2
	A[4] = 5
	A[5] = 6

	contains the following example triplets:

	(0, 1, 2), product is −3 * 1 * 2 = −6
	(1, 2, 4), product is 1 * 2 * 5 = 10
	(2, 4, 5), product is 2 * 5 * 6 = 60  <- result


*/

	private static int max(int[] A, boolean visited[])  {
		int j = 0;  //-indeks pierwszego elementu =/= false w T [0,1]
		while( j < visited.length && visited[ j ] ) {
			j++;
		}
		int kand = A[j];
		int ikand = 0;
		for(int i = j+1; i < A.length; i++) {
			if(!visited[i] && A[i] > kand ) {
				kand = A[i];
				ikand = i;
			}
		}

		visited[ikand] = true;
		return kand;
	}

	public static int solution(int[] A) {
		boolean visited[] = new boolean[A.length];
		int max1 = max(A, visited);
		int max2 = max(A, visited);
		int max3 = max(A, visited);
		return max1 * max2 * max3;
	}

	public static void main( String[] args )
	{
		int []A = new int[6];
		A[0] = -3;
		A[1] = 1;
		A[2] = 2;
		A[3] = -2;
		A[4] = 5;
		A[5] = 6;

	//	System.out.println(max(new int[]{2,3,1}, new boolean[]{false, false, true}));
		System.out.println(solution(  A) );

		int []A2 = new int[3];
		A2[0] = -3;
		A2[1] = 1;
		A2[2] = 2;
		System.out.println(solution(  A2) );
	}
}
