import java.util.Scanner;
public class towersofhanoi
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{

System.out.println(towersOfHanoi(5));

} private static int towersOfHanoi(int m){
	if (m==1){
		return 1;
	}
	else if(m==2){
		return 3;
	}
	else{
		return towersOfHanoi(m-1)+ 1 + towersOfHanoi(m-1);
	}
}
}

