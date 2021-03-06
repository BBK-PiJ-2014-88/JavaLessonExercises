package exercises;

import java.util.Arrays;
import java.util.List;

public class QuestionFour {
	public static void main(String[] args) {
		new QuestionFour().launch();
	}
	public void launch(){
		List<String> words = Arrays.asList("Hello", "Bonjour", "engine", "Hurray", "What", "Dog", "boat");
		System.out.println("words of length greater than 4:");
		words.stream().filter(str -> str.length() > 4).forEach(s -> System.out.println(s));
		System.out.println("words with b:");
		words.stream().filter(str -> str.contains("b")).forEach(s -> System.out.println(s));
		System.out.println("Even length words");
		words.stream().filter(str -> str.length() % 2 == 0).forEach(s -> System.out.println(s));
	}
}
