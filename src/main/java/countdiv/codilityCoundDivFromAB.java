package countdiv;

public class codilityCoundDivFromAB
{
	/*
		1. Jakie jest uproszczenie tego problemu ?
			gdyby A było liczbą podzielną przez K, to wszystkich liczb podzielnych przez K od A do B jest sufit((B-A + 1)/K)
		2. Co w przypadku gdy A % K !=0 ?
			Np. gdy mamy 1 2 3 4 5 6 7, to można zauważyć że odpowiedź na to pytanie, sprowadza się do odpowiedzi na pytanie 1
			dla przypadku 3 4 5 6 7  czyli usuwajac 2 poczatkowe liczby az do otrzymania pierwszej liczbby podzielnej przez 3, czyli 3
		3. Pozostaje więc znaleźć wzór na liczbę liczb od A do pierwszej liczby podzielnej przez 3
			f(A) = K - A % K;
	 */
	public static int solution(int A, int B, int K) {
		int n  = B - A + 1;
		if(A%K == 0) {
			return (int)Math.ceil( (double ) n/K);
		}

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
