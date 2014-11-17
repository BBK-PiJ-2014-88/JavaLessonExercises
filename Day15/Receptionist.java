import java.util.*;

public class Receptionist{
	List<Patient> patientList = new ArrayList<Patient>();
	public static void main(String[] args){
		Receptionist tester = new Receptionist();
		tester.launch();
	}

	public void launch(){
		boolean finished = false;
		System.out.println("Please enter '-1' into Patient name when you are finished inputting patients");
		while (finished != true){
			System.out.println("Please enter the Patient's Name: ");
			String name = System.console().readLine();
			if (name.equals("-1")){
				finished = true;
				break;
			}
			System.out.println("Please enter the Patient's Data of Birth: ");
			int dateOfBirth = Integer.parseInt(System.console().readLine());
			try{
				patientList.add(new Patient(name, dateOfBirth));
			}
			catch(IllegalArgumentException ex){
				System.out.println("Invalid data of Birth. Age of patient must be between 0 and 130");
			}
		}
	}
}