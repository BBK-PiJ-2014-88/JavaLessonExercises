import java.util.Scanner;
public class power
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Day 5 - Exercise 5 - Power

Mathematics myMath = new Mathematics();
System.out.println(myMath.pow((new Integer(2)),(new Integer(8))));

}}

class Mathematics{private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	Integer pow(Integer base, Integer exponent){
		if (exponent .equals( (new Integer(0)))){
			return (new Integer(1));
		}
		else if (exponent .equals( (new Integer(1)))){
			return base;
		}
		else{
			return base*(pow(base, exponent - (new Integer(1))));
		}
		
	}
}
