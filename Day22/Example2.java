import java.util.stream.Stream;

public class Example2{
	public static void main(String[] args){
		Integer[] intArray = {1,2,3,4,3,5};
		System.out.println(Stream.of(intArray).filter(x -> x==8).findFirst());
		System.out.println(Stream.of(intArray).filter(x -> x==3).findFirst());
	}
}