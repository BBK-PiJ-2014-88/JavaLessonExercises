import java.util.*;

public class PrimeDivisorListImpl implements PrimeDivisorList{
	List<Integer> integerList = new ArrayList<Integer>();

	public void add(Integer num){
		if (num == null){
			throw new NullPointerException("Invalid Integer inserted");
		}
		else if (isPrime(num) == false){
			throw new IllegalArgumentException("Invalid Input. Must only enter Prime numbers");
		}
		else{
			integerList.add(num);
		}
	}

	public Integer remove(int position){
		Integer removedInteger = integerList.get(position);
		integerList.remove(position);
		return removedInteger;
	}

	public boolean isPrime(Integer num){
		int dividor = 2;
		while (dividor < num){
			if (num % dividor == 0){
				return false;
			}
			else{
				dividor++;
			}
		}
		return true;
	}

	@Override
	public String toString(){
		String output = "[ ";
		for (int x = 0; x < integerList.size(); x++){
			output = output + integerList.get(x);
		}
		output = output + " ]";
		return output;
	}
}