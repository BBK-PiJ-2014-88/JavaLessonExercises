public class PatientDoubly{
	private String name;
	private int age;
	private String illness;
	public PatientDoubly nextPatient;
	public PatientDoubly previousPatient;

	public int lengthOfList(PatientDoubly currentPatient){
			if (currentPatient.nextPatient == null){
				return 1;
			}
			else{
				return 1 + (currentPatient.nextPatient.lengthOfList(currentPatient.nextPatient));
			}
	}

	public PatientDoubly(String name, int age, String illness){
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.previousPatient = null;
	}

	public String toString(){
		String output = "Patient name: " + this.name + " Patient age: "+ this.age +
		" Patient illness: " + this.illness;
		return output;
	}

	public void printAll(PatientDoubly currentPatient){
		System.out.println(currentPatient);
		if(currentPatient.nextPatient != null){
			currentPatient.nextPatient.printAll(currentPatient.nextPatient);
		}
	}

	public void addPatient(PatientDoubly newPatient){
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