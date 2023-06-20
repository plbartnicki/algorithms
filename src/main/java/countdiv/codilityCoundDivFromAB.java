public class codilityCoundDivFromAB
{
	public static int solution(int A, int B, int K) {
		if(A%K == 0) {
			return (int)Math.ceil( (double ) (B-A+1)/K);
		}

		int n  = B - A + 1;
		int x = K - A % K;

		return (int)Math.ceil((double) (n - x)/K );
	}

	public static void main( String[] args )
	{
	//	System.out.println(Math.ceil((double)3/2));
		System.out.println( solution(6, 11, 2) );
		System.out.println( solution(5, 5, 5) );
		System.out.println( solution(4, 5, 5) );
		System.out.println( solution(4, 8, 3) );
	}
}
