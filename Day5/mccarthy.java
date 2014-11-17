import java.util.Scanner;
public class mccarthy
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{


System.out.println(mcCarthy91(2));

} private static int mcCarthy91(int n) {
	System.out.println(n);
	if (n > 100) {
		return n - 10;
	} else {
		return mcCarthy91(mcCarthy91(n+11));
	}
}
}

