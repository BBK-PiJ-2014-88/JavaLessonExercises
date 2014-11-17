//Trees as Sets
public interface IntSet{
	/**
	* adds a new int to the set; if it is there already, nothing happens
	*/
	public void add(int num);


	/**
	* returns true if the number is in the set, false otherwise.
	*/
	public boolean contains (int num);


	/**
	* returns the same values as the former method, but for every element that is checked
	* prints its value on the screen
	*/
	public boolean containsVerbose(int num);


	/**
	* returns a string with the values of the elements in the set separated by commas
	*/
	public String toString();

}