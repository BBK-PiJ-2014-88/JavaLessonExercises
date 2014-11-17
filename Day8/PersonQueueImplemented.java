//In very long queues , using this method will take a long time to insert
//new person to queue as has to go all the way from the first person to the end
//could make another class variable lastperson
//then whenever add a new person, last person = newly inserted person
//then when you insert a new person, the method can simply be
//lastperson.personBehind = newperson
//newperson.personInFront = old lastperson

public class PersonQueueImplemented implements PersonQueue{
	private Person firstPerson = null;
	private Person lastPerson = new Person("temp",0);

	/**
		* Adds another person to the queue.
	*/
	public void insert(Person person){
		if (firstPerson == null){
			firstPerson = person;
		}
		else{
			lastPerson = findLast(firstPerson);
			lastPerson.personBehind = person;
			person.personInFront = lastPerson;

		}

	}

    /**
	*Removes a person from the queue.
	*/
	public Person retrieve(){
		Person temp = new Person("temp",0);
		temp = firstPerson;
		firstPerson = firstPerson.personBehind;
		return temp;
	}


	private Person findLast(Person first){
		if (first.personBehind == null){
			return first;
		}
		else{
			return findLast(first.personBehind);
		}
	}

	public void printQueue(Person first){
		int count = 1;
		System.out.println("Person " + count + "in Queue is: " + first );
		count++;
		if(first.personBehind != null){
			printQueue(first.personBehind);
		}

	}


}