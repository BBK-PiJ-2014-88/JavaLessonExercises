import java.util.stream.Stream;

public class Example{
	public static void main(String[] args){
		Integer[] intArray = {1,2,3,4,3,5};
		Stream.of(intArray)
			.filter(x -> x==3)
				.forEach(System.out::print);
	}
}