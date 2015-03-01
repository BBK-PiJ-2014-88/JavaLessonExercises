import java.util.stream.Stream;
import java.util.Arrays;

public class Example3{
	public static void main(String[] args){
		int[] intArray = {1,2,3,4,3,5};
		System.out.println(
			Arrays.stream(intArray)
			.filter(x -> x == 3)
			.findFirst()
			.orElse(0)
			);

			System.out.println(
				Arrays.stream(intArray)
				.map(x -> x*x)
				.filter(x -> x%2 ==0)
				.count());

			System.out.println(
				Arrays.stream(intArray)
				.map(x -> x*x)
				.filter(x -> x%2 ==0)
				.sum());

				System.out.println(
					Arrays.stream(intArray)
					.max()
					.orElse(0)
					);

	}
}