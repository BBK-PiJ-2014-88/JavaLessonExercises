import java.util.Scanner;
public class recursion2
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 5 - Exercise 2 

System.out.println(buggyMethod((new Integer(7))));

} private static String buggyMethod(Integer n) {
if (n <= (new Integer(0))) {
return "";
}
return n + " " + buggyMethod(n - (new Integer(2)));
}
}

