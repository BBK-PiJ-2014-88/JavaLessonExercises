import java.util.Scanner;
public class recursion3
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

System.out.println(doggyMethod(8));

} private static String doggyMethod(int n) {
	
	if (n <= 0) {
		return "";
	}
	String result = doggyMethod(n-3) + n + doggyMethod(n-2);
	return result;
}
}

