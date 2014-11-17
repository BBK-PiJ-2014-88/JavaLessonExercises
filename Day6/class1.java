import java.util.Scanner;
public class class1
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
Point point = new Point(1,1);
System.out.println ("The point is now at " + point.x + "," + point.y);
Point remotePoint = new Point(10,20);
point.moveTo(remotePoint);
System.out.println ("The point is now at " + point.x + "," + point.y);



}}

class Point {private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	double x;
	double y;
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	double moveTo(Point remote) {
		this.x = remote.x;
		this.y = remote.y;
	}
}
