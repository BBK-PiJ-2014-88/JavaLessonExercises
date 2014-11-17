import java.util.Scanner;
public class palindrome
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

if(palindromeFibonacci("madamc")){
	System.out.println("true");
}
else{
	System.out.println("false");
}


} private static boolean palindromeFibonacci(String text){
	if (text.length()== 0 || text.length()== 1 ){
		return true;
	}
	else if (text.substring(0,1).equals(text.substring(text.length()-1,text.length()))){
		return palindromeFibonacci(text.substring(1,text.length()-1));
	}
	else{
		return false; 
	}
}
}

