import java.util.*;

public class QuestionSeven{
	public static void main(String[] args){
		QuestionSeven launcher = new QuestionSeven();
		launcher.launch();
	}
	public void launch(){
	}
	public static <T,R> List<R> transformedList(List<T> list, Function<T, R> lambda){
		List<R> result = new ArrayList<>();
		for (T element: list){
			result.add(lambda.apply(element));
		}
		return result;
	}
}