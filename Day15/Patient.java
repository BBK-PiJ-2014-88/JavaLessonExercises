public class Patient{
	public String name;
	public int dob;

	public Patient(String name, int dob){
		int age = 2014 - dob;
		if (age < 0 || age >= 130){
			throw new IllegalArgumentException("Invalid Date of Birth.");
		}
		this.name = name;
		this.dob = age;
	}
}