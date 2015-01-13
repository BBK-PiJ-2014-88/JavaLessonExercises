import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class QuestionFive{
	public static void main(String[] args){
		QuestionFive launcher = new QuestionFive();
		launcher.launch();
	}
	public void launch(){
		List<String> stringList = Arrays.asList("Hello", "this", "butt", "is", "a", "series", "of", "Strings", "bubble");
		List<String> shortWords = allMatches(stringList, str -> str.length() < 4);
		System.out.println(shortWords);
		List<String> wordsWithB = allMatches(stringList, str -> str.contains("b"));
		System.out.println(wordsWithB);
		List<String> evenWords = allMatches(stringList, str -> str.length() % 2 == 0);
		System.out.println(evenWords);


	}
	public static List<String> allMatches(List<String> inputList, Predicate lambda){
		List<String> input = inputList;
		List<String> result = new ArrayList<String>();
		for (String string : inputList){
			if (lambda.stringMethod(string)){
				result.add(string);
			}
		}
		return result;
	}

}