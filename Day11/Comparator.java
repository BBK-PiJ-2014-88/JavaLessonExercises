public class Comparator {
	public int getMax(int n, int m) {
		return (int)getMax((double)n,(double)m);
	}

	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		}
		else {
			return d2;
		}
	}

	public String getMax(String number1, String number2) {
		return Integer.toString(getMax(Integer.parseInt(number1),Integer.parseInt(number2)));
	}
}
