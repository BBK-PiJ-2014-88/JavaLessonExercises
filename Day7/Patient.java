public class Patient{
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;

	public Patient(String name, int age, String illness){
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}

	public String toString(){
		String output = "Patient name: " + this.name + " Patient age: "+ this.age +
		" Patient illness: " + this.illness;
		return output;
	}

	public void printAll(Patient currentPatient){
		System.out.println(currentPatient);
		if(currentPatient.nextPatient != null){
			currentPatient.nextPatient.printAll(currentPatient.nextPatient);
		}
	}

	public void addPatient(Patient newPatient){
		if(this.nextPatient == null){
			this.nextPatient = newPatient;
		}
		else{
			this.nextPatient.addPatient(newPatient);
		}
	}

	public static void main(String[] args){
	}

	public boolean deletePatient(Patient patient){
		if(this.nextPatient==null){
			return false;
		}
		else if(this.nextPatient.name.equals(patient.name)){
			this.nextPatient = nextPatient.nextPatient;
			return true;
		}
		else{
			return this.nextPatient.deletePatient(patient);
		}
	}

}