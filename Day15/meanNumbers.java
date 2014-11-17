public class meanNumbers{
	private double total = 0;
	private int count;
	boolean valid = false;
	public static void main(String[] args){
		meanNumbers tester = new meanNumbers();
		tester.launch();
	}
	public void launch(){
		while (valid != true){
			try{
				System.out.println("Please input how many numbers you would like to enter: ");
				count = Integer.parseInt(System.console().readLine());
				valid = true;
			}
			catch(NumberFormatException ex){
				System.out.println("Please enter a valid number");
			}
		}

		while (count!= 0){
			try{
				inputNumbers();
			}
			catch(NumberFormatException ex){
				System.out.println("Please enter a valid number");
			}
		}
		System.out.println("Average of the inputted numbers: " + total / 10);
	}

	public void inputNumbers(){
			System.out.println("Please enter a number: ");
			String str = System.console().readLine();
			total = total + Integer.parseInt(str);
			count--;
			}
}