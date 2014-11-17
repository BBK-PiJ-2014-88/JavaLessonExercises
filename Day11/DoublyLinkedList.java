public interface DoublyLinkedList<T>{
	/**
	* Constructs an empty List
	*/
	DoublyLinkedList();
	/**
	* Inserts a person to the list
	*/
	void insert(T element);
	/**
	* Removes the first element of the List
	*/
	T removeFirst();
	/**
	* Removes an element from the list
	*/
	T remove();
}