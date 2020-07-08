package lambda2020;

import java.math.BigInteger;

import java.util.stream.Collectors;

import java.util.stream.IntStream;

public class Lambda14 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		IntStream.range(0, 10).forEach(System.out::print); // For range(a, b) ==> a is inclusive, b is exclusive

		System.out.println();
		IntStream.rangeClosed(0, 10).forEach(System.out::print); // For rangeClosed(a, b) ==> a is inclusive, b is
																	// inclusive

		System.out.println();
		// Print first 5 odd counting numbers on the console by using For Loop
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		// Print first 5 odd integers on the console by using Functional Programming
		IntStream.iterate(1, t -> t + 2).limit(5).forEach(System.out::print);// For IntStream to update the elements use
																				// iterate()

		System.out.println();
		// Print the sum of the first 100 even counting numbers ==> 1, 2, 3, 4, ...
		// 2+4+6+8+ ... + 198 + 200 = ?
		System.out.println(IntStream.iterate(2, t -> t + 2).limit(100).sum());

		// Print the first 5 power of 2 on the console ==> 2, 2x2=4, 2x2x2=8,
		// 2x2x2x2=16, 2x2x2x2x2=32 ==> 2 4 8 16 32
		IntStream.iterate(2, t -> t * 2).limit(5).forEach(System.out::print);

		System.out.println();
		// Find the average value of the first 5 powers of 2
		System.out.println(IntStream.iterate(2, t -> t * 2).limit(5).average());

		System.out.println();
		// Print first 10 counting numbers on the console as a list
		System.out.println(IntStream.range(1, 11).boxed().collect(Collectors.toList()));// [1, 2, 3, 4, 5, 6, 7, 8, 9,
																						// 10]

		// Calculate 5 factorial ==> 5! = 5 x 4 x 3 x 2 x 1 = 120
		System.out.println(IntStream.rangeClosed(1, 5).reduce(1, (a, b) -> a * b)); // 120

		// Calculate 50 factorial ==> 50x49x...2x1 = ?
		System.out.println(IntStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,
				BigInteger::multiply));
		// 30414093201713378043612608166064768844377641568960512000000000000
	}
}
