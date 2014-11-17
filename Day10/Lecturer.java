// Lecturer.java
/**
* A lecturer has both teaching and research responsibilities
*/
public class Lecturer extends Teacher {
	public void doResearch(String topic) {
		System.out.println("Doing research on: " + topic);
	}

	public Lecturer(String name){
		super(name);
	}

	public static void main(String[] args){
		Lecturer Dumbledore = new Lecturer("Albus");
		System.out.println(Dumbledore.getName());
		Dumbledore.teach("Science");
		Dumbledore.doResearch("Computer Science");
	}
}
