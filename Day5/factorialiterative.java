import java.util.Scanner;
public class factorialiterative
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 5 - Exercise 2.1 - Factorial Iterative

System.out.println(factorialIterative((new Integer(8))));

} private static Integer factorialIterative(Integer num){
	Integer total = (new Integer(1));
	while(num>(new Integer(1))){
		total = total*num;
		num --;
	}
	return total;
}
}

