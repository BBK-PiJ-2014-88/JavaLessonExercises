/**
* A list of prime Integers
*/

public interface PrimeDivisorList{
	/**
	*adds an Integer to the end of the list
	*A NullPointerException is thrown if a null value is added
	*A IllegalArgumentException is thrown if a non-prime number is added
	* @return void
	*
	* @throws NullPointerException if the user inserts null value
	* @throws IllegalArgumentException if the user inserts a non-prime number
	*/
	public void add(Integer num);
	/**
	*removes the integer at position from the list
	* @return the Integer at position entered by the user
	*/
	public Integer remove(int position);
}