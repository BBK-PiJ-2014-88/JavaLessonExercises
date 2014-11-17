import java.util.Scanner;
public class factorial
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 5 - Exercise 2.1 - Factorial

System.out.println(factorialRecursive((new Integer(8))));


} private static Integer factorialRecursive(Integer num){
	if (num .equals((new Integer(1)))){
		return (new Integer(1));
	}
	else{
		return num*(factorialRecursive(num-(new Integer(1))));
	}
}

//works fine until 12, then stops working properly after 13 as too many digits.
}

