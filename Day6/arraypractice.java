import java.util.Scanner;
public class arraypractice
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{


int[] employeeID = new int[10];
String[] employeeNames = new String[10];

int position = 0;

while(position<10){
	System.out.println("Please enter the ID of employee: " + position);
	employeeID[position] = Integer.parseInt(System.console().readLine());
	System.out.println("Please enter the name of employee: " + position);
	employeeNames[position] = System.console().readLine();
	position++;
}

for(int y = 0; y<employeeID.length; y++){
	if (employeeID[y] <1000){
		System.out.println("ID: " + employeeID[y] + " Name: " + employeeNames[y]);
	}
}

for (int s = 0 ; s<employeeNames.length; s++){
	if (employeeNames[s].substring(0,1).equals("J")|| 
	    employeeNames[s].substring(0,1).equals("S")){
		System.out.println("ID: " + employeeID[s] + " Name: " + employeeNames[s]);	
	}
}

}}

