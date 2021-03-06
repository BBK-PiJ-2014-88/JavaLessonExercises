package exercises;

import java.util.Arrays;
import java.util.List;

public class QuestionSeven {
	public static void main(String[] args) {
		new QuestionSeven().launch();
	}
	public void launch(){
		List<String> words = Arrays.asList("Hello", "Bonjour", "engine", "Hurray", "What", "Dog", "boat", "Egg", "Queen", "Soq", "Eet");
		String result = words.stream().reduce("", (a,b) -> a + b.toUpperCase());
		System.out.println(result);
	}
}
