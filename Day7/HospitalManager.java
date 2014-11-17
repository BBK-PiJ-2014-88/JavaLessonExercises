public class HospitalManager{
	public Patient patientListStart = null;

	public static void main(String[] args){
		HospitalManager hm = new HospitalManager();
		hm.launch();
	}



	public void launch(){
		//adding 10 elements
		Patient firstPatient = new Patient("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
		Patient anotherPatient = new Patient("Sam",18,"High Fever");
		patientListStart.addPatient(anotherPatient);
		Patient anotherPatient2 = new Patient("Tom",78,"Cancer");
		patientListStart.addPatient(anotherPatient2);
		Patient anotherPatient3 = new Patient("Harry",48,"Obesity");
		patientListStart.addPatient(anotherPatient3);
		Patient anotherPatient4 = new Patient("Manuel",28,"Aids");
		patientListStart.addPatient(anotherPatient4);
		Patient anotherPatient5 = new Patient("Robert",35,"Ebola");
		patientListStart.addPatient(anotherPatient5);
		Patient anotherPatient6 = new Patient("Takahito",28,"Kidney stones");
		patientListStart.addPatient(anotherPatient6);
		Patient anotherPatient7 = new Patient("Samuel",58,"Diabetes");
		patientListStart.addPatient(anotherPatient7);
		Patient anotherPatient8 = new Patient("Chelsea",18,"Broken leg");
		patientListStart.addPatient(anotherPatient8);
		Patient anotherPatient9 = new Patient("Katerina",45,"Infection");
		patientListStart.addPatient(anotherPatient9);
		//going through the list, printing contents of each element
		patientListStart.printAll(patientListStart);
		//will delete a few elements from the list
		patientListStart.deletePatient(anotherPatient4);
		patientListStart.deletePatient(anotherPatient7);
		//printing all elements again to make sure they have been deleted
		System.out.println();
		patientListStart.printAll(patientListStart);
	}
}