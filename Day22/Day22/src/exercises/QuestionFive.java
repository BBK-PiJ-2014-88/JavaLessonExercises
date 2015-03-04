package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class QuestionFive {
	public static void main(String[] args) {
		new QuestionFive().launch();
	}
	public void launch(){
		List<String> words = Arrays.asList("Hello", "Bonjour", "engine", "Hurray", "What", "Dog", "boat", "Egg", "Queen", "Soq", "Eet");
		Optional<String> containsE = words.stream().filter(s -> Character.isUpperCase(s.charAt(0))).filter(s -> s.length() < 4).filter(s -> s.contains("e")).findFirst();
		if (containsE.isPresent()){
			System.out.println(containsE.get());
		}
		Optional<String> containsQ = words.stream().filter(s -> Character.isUpperCase(s.charAt(0))).filter(s -> s.length() < 4).filter(s -> s.contains("q")).findFirst();
		if (containsQ.isPresent()){
			System.out.println(containsQ.get());
		}		
	
		Optional<String> containsE2 = words.stream().map(s -> s.toUpperCase()).filter(s -> s.length() < 4).filter(s -> s.contains("E")).findFirst();
		if (containsE2.isPresent()){
			System.out.println(containsE2.get());
		}
		Optional<String> containsQ2 = words.stream().map(s -> s.toUpperCase()).filter(s -> s.length() < 4).filter(s -> s.contains("Q")).findFirst();
		if (containsQ2.isPresent()){
			System.out.println(containsQ2.get());
		}		//now working. was searching for e and q, needed to search for E and Q as words are all now uppercase
		

	}
}

