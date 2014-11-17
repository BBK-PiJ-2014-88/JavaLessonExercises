public interface GenericStack<N extends Number>{
	/**
	* pushes an element onto the top of the stack
	*/
	void push(N element);
	/**
	* Removes the element at the top of the stack
	*/
	N pop();
	/**
	*Tests if stack is empty
	*/
	boolean isEmpty();
}