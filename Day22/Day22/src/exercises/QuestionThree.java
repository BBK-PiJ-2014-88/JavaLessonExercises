package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionThree {
	public static void main(String[] args){
		new QuestionThree().launch();
	}
	public void launch(){
		List<String> words = Arrays.asList("Hello", "Bonjour", "engine", "Hurray", "What", "Dog");
		List<String> resultWords = words.stream().map((s) -> s + "!").collect(Collectors.toList());
		for (String str: resultWords){
			System.out.println(str);
		}
		List<String> eyeWords = words.stream().map((str) -> str.replace("i", "eye")).collect(Collectors.toList());
		for (String str: eyeWords){
			System.out.println(str);
		}	
		List<String> upperCaseWords = words.stream().map((str) -> str.toUpperCase()).collect(Collectors.toList());
		for (String str: upperCaseWords){
			System.out.println(str);
		}		
		words.stream().map((str) -> str + " no list").forEach(str -> System.out.println(str));
		//no need to make into a list
	}
}
