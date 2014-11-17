public class listOfMarks{
	public void readMarks(){
		String str = "";
		int totalMarks = -1;
		int distinctionNumber = 0;
		int passesNumber = 0;
		int failureNumber = 0;
		int invalid = 0;
		do{
			System.out.println("Input a mark. End with -1: ");
			str = System.console().readLine();
			totalMarks++;
			if (Integer.parseInt(str) > 100 || Integer.parseInt(str) < -2){
					invalid++;
			}
			else if (Integer.parseInt(str) >=70){
				distinctionNumber++;
			}
			else if (Integer.parseInt(str) >=50){
				passesNumber++;
			}
			else if (Integer.parseInt(str) >=0){
				failureNumber++;
			}
		} while (!str.equals("-1"));
		System.out.println("Number of marks: " + totalMarks);
		System.out.println("Number of distinctions: " + distinctionNumber);
		System.out.println("Number of passes: " + passesNumber);
		System.out.println("Number of failures: " + failureNumber);
		System.out.println("Number of invalid marks: " + invalid);
	}

	public static void main(String[] args){
		listOfMarks checkingListOfMarks = new listOfMarks();
		checkingListOfMarks.readMarks();
	}
}