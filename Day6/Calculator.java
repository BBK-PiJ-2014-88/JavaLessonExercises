public class Calculator{
	public void add(int x, int y){
		System.out.println(x+y);
	}

	public void subtract(int x, int y){
		System.out.println(x-y);
	}

	public void multiply(int x, int y){
		System.out.println(x*y);
	}

	public void divide(int x, int y){
		double x2 = (double)x;
		double y2 = (double)y;
		System.out.println(x2/y2);
	}

	public void modulus(int x, int y){
		System.out.println(x%y);
	}
}