import java.util.Scanner;
public class fibonacci
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 5 - Exercise 2.2 - Fibonacci
//Calculates the nth element of the Fibonacci sequence 

System.out.println(fibonacciRecursive((new Integer(27))));

} private static Integer fibonacciRecursive(Integer num){
	if (num < (new Integer(3))){
		return (new Integer(1));
	}
	else{
		return fibonacciRecursive(num-(new Integer(1))) + fibonacciRecursive(num-(new Integer(2)));
	}
}
}

