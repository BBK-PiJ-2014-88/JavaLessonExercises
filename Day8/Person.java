public class Person{
	private String name = "";
	private int age = 0;
	public Person personInFront = null;
	public Person personBehind = null;

	public Person(String name, int age){
	this.name = name;
	this.age = age;
	}
	public String toString(){
			String output = "Person name: " + this.name + " Age: " + this.age;
			return output;
	}
}