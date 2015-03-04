package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class QuestionNine {
	public static void main(String[] args) {
		new QuestionNine().launch();
	}
	public void launch(){
		List<String> words = Arrays.asList("Hello", "Bonjour", "engine", "Hurray", "What", "Dog", "boat", "Egg", "Queen", "Soq", "Eet");
		String result = (words.stream().map(str -> str + ",").reduce("", (a,b) -> a + b));
		result = result.substring(0, result.length() -1);
		System.out.println(result);
		//simpler way:
		String joinedResult = words.stream().collect(Collectors.joining(", "));
		System.out.println(joinedResult);
	}
}
