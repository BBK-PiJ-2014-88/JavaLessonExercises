public class modifiedString extends String{
	public void printEven(String str){
		for (int x = 0; x < str.length(); x++){
			if (x % 2 == 0){
				System.out.println(str.substring(x,x+1));
			}
		}

	}
}

//String is a final class, cannot be modified