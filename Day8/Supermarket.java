//was having trouble because need to put tillOneQueue

public class Supermarket{

	PersonQueueImplemented tillOneQueue;

	Supermarket(){
		tillOneQueue = new PersonQueueImplemented();
	}

	public void addPerson(Person person){
		tillOneQueue.insert(person);
	}
	public Person servePerson(){
		return tillOneQueue.retrieve();
	}
	public static void main(String[] args){
		Supermarket tillOne = new Supermarket();
		tillOne.launch();

	}

	public void launch(){
		Person person1 = new Person("John",45);
		Person person2 = new Person("Ben",41);
		Person person3 = new Person("Don",75);
		Person person4 = new Person("Harry",35);
		Person person5 = new Person("Peter",15);
		tillOneQueue.insert(person1);
		tillOneQueue.insert(person2);
		tillOneQueue.insert(person3);
		tillOneQueue.insert(person4);
		tillOneQueue.insert(person5);
		tillOneQueue.printQueue(person1);
		System.out.println();
		tillOneQueue.retrieve();
		tillOneQueue.retrieve();
		tillOneQueue.printQueue(person3);
	}

}