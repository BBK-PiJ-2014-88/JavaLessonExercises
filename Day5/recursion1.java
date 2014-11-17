import java.util.Scanner;
public class recursion1
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 5 - Exercise 1
printNumbers(6);

} private static void printNumbers(int n) {
if (n <= 0) {
	return;
}
System.out.println(n);
printNumbers(n-2);
printNumbers(n-3);
System.out.println(n);
}
}

