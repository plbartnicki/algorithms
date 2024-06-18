package basicsandstreams;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsAndLambda
{

	public static void main( String[] args )
	{
		List<String> snums = Arrays.asList("1", "2", "-3");
		Integer sum2 = snums.stream().map(s -> Integer.valueOf( s ) )
			.filter(x -> x > 0)
			.reduce(0, (a, b) -> a + b);
		System.out.println(sum2);

		List<String> list = Arrays.asList("3", "6", "8",
			"14", "15");
		list.stream().mapToInt(num -> Integer.parseInt(num))
			.filter(num -> num % 3 == 0)
			.forEach(System.out::println);

		BigDecimal x = new BigDecimal( 2.4 );
		BigDecimal y = x.add( new BigDecimal( 2.8 ) );
		System.out.println(y);

		BigDecimal tvals[] =  new BigDecimal[]{ BigDecimal.valueOf(10000.2), BigDecimal.valueOf( 30.1)};
		BigDecimal sum  = Stream.of(tvals).filter(el -> el.compareTo( BigDecimal.valueOf(0.0 ) ) == 1)
			.reduce(BigDecimal.ZERO, BigDecimal::add);
		System.out.println(sum);

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum3 = integers.stream()
			.collect(Collectors.summingInt(Integer::intValue));

		List<List<String>> l2 = Arrays.asList( Arrays.asList( "abc", "xyz" ), Arrays.asList( "cde", "efg" ) );
		List<String> l2flat = l2.stream().flatMap( l -> l.stream() ).sorted().collect( Collectors.toList());
		System.out.println( l2flat );

		List<String> items =
			Arrays.asList("apple", "apple", "banana",
				"apple", "orange", "banana", "papaya");
		Map<String, Long> result =
			items.stream().collect(
				Collectors.groupingBy(
					Function.identity(), Collectors.counting()
				)
			);
		System.out.println(result);

		long res = LongStream.of(3, 2)
			.reduce(1, (acc, next) -> acc * next);
		System.out.println(res);

		long res2 = LongStream.of(3, 2).parallel()
			.reduce(1, (acc, next) -> acc * next);
		System.out.println(res2);

		ArrayList<Integer> lst = new ArrayList<>(  );
		Random rand = new Random(  );
		for(int i = 1; i <= 1000000; i++) {
			lst.add( rand.nextInt( 1000000 ) );
		}
		long n1 = lst.stream().distinct().count();
		long n2= lst.stream().parallel().distinct().count();
		System.out.println(n1 + " " + n2);

		long nb1 = lst.stream().filter( el -> el % 2 == 0 ).count();
		long nb2= lst.stream().parallel().filter( el -> el % 2 == 0 ).count();
		System.out.println(nb1 + " " + nb2);


		System.out.println("---");
		// Using peek without any terminal
		// operation does nothing

		List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> newList = list3.stream()
				.peek(System.out::println)
				.collect(Collectors.toList());

		System.out.println(newList);


	}

}
