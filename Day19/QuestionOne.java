import java.util.Arrays;
import java.util.Collection;

public class QuestionOne{
	public static void main(String[] args){
		QuestionOne launcher = new QuestionOne();
		launcher.launch();
	}
	public void launch(){
		String[] stringArray = {"Zebra", "Hello", "how", "do", "you", "do", "egg", "today", "my", "friend", "eat"};
		Arrays.sort(stringArray, (str1, str2) -> str1.length() - str2.length()); //or {return str1.length() - str2.length();} )
		System.out.println(Arrays.asList(stringArray));
		Arrays.sort(stringArray, (str1, str2) -> str2.length() - str1.length());
		System.out.println(Arrays.asList(stringArray));
		Arrays.sort(stringArray, (str1, str2) -> str1.charAt(0) - str2.charAt(0)); //Capital letters come before lower case letters in ordering
		System.out.println(Arrays.asList(stringArray));
		Arrays.sort(stringArray, (str1, str2) -> {if (str1.charAt(0) == 'e' && str2.charAt(0) == 'e'){return 0;}
												  else if (str1.charAt(0) == 'e' && str2.charAt(0) != 'e'){return -1;}
												  else{return 1;}});   //could have also used str1.contains("e");
		System.out.println(Arrays.asList(stringArray));
		Arrays.sort(stringArray, QuestionOne::eChecker);
		System.out.println(Arrays.asList(stringArray));
	}

	public static int eChecker(String str1, String str2){
		if (str1.charAt(0) == 'e' && str2.charAt(0) != 'e'){
			return -1;
		}
		else if (str1.charAt(0) != 'e' && str2.charAt(0) == 'e'){
			return 1;
		}
		else{
			return 0;
		}
	}


}