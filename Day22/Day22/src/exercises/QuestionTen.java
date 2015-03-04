package exercises;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class QuestionTen {
	public static void main(String[] args) {
		new QuestionTen().launch();
	}
	
	public static List<String> randomNumberStringGenerator(int sizeOfList){
		Random random = new Random();
		IntStream intStream = random.ints();
		List<Double> result = intStream.limit(sizeOfList).collect(Collectors.toList());
	}
	
	public void launch(){
		
	}
}
