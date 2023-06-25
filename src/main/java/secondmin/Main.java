package secondmin;

public class Main
{
	public static double secondMin(double []vals) throws Exception
	{
		if(vals.length < 2) {
			throw new Exception("There should be at least 2 values");
		}

		double a = vals[0];
		double b = vals[1];

		if(a > b) {
			double t = a;
			a = b;
			b = t;
		}

		// a <= b, b - result

		for(int i = 2; i < vals.length; i++) {
			if(vals[i] < a) {
				b = a;
				a = vals[i];
			} else if (vals[i] > a) {
				if(vals[i] < b) {
					b = vals[i];
				}
			}
		}

		return b;
	}

	public static void main( String[] args )
	{

	}

}
