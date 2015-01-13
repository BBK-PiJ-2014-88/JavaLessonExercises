
public class QuestionThree{
	public static String betterString(String str1, String str2, TwoStringPredicate lambda){
		if 	(lambda.isBetter(str1,str2)){
			return str1;
		}
		return str2;
	}
	public static <T> T betterEntry(T element1, T element2, TwoElementPredicate<T> lambda){
		if (lambda.isBetter(element1, element2)){
			return element1;
		}
		return element2;
	}
	public static void main(String[] args){
		QuestionThree launcher = new QuestionThree();
		launcher.launch();
	}
	public void launch(){
		String string1 = "Hello";
		String string2 = "Longer String";
		System.out.println(QuestionThree.betterString(string1, string2, (str1,str2) -> str1.length() > str2.length()));
		System.out.println(QuestionThree.betterString(string1, string2, (str1,str2) -> true ));
		//using generics:
		System.out.println(QuestionThree.betterEntry(string1, string2, (str1,str2) -> str1.length() > str2.length()));
		System.out.println(QuestionThree.betterEntry(string1, string2, (str1,str2) -> true ));
	}
}