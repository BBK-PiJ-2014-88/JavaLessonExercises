public class GenericStackImplementation<N extends Number> implements GenericStack<N>{
	private N[] contents;
	private int headIndex = 0;

	public void push(N element){
		contents[headIndex] = element;
		headIndex++;
	}

	public N pop(){
		if (headIndex == 0){
			return null;
		}
		headIndex--;
		N result = contents[headIndex];
		contents[headIndex] = null;
		return result;
	}

	public boolean isEmpty(){
		if (contents[0] == null){
			return true;
		}
		else{
			return false;
		}
	}
}

//In implementation<N extends Number> needs to come first, as second <N> relates to 1st <N>
//if first <N> is unbounded, second <N> will also be unbounded
//