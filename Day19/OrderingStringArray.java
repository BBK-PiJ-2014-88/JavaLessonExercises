import java.util.*;

public class OrderingStringArray{
	public static void main(String[] args){
		OrderingStringArray tester = new OrderingStringArray();
		tester.launch();
	}

	public boolean containsE(String str){
		for (int x = 0; x < str.length(); x++){
			if (str.charAt(x) == 'e'){       //comparing chars, be careful
				return true;
			}
		}
		return false;
	}

	public void launch(){
		String[] stringArray = {"Hello", "Tiny", "Very large", "Largest of them all", "Medium"};
		StringSorter sortByContainsE = (strArray) -> {
			String[] result = strArray;
			for (int x = 0; x < result.length; x++){
				int min = x;
				for (int j = x+1; j < result.length; j++){
					if ((containsE(result[j])) == true){
									String temp = result[x];
									result[x] = result[j];
									result[j] = temp;
					}
				}
			}
			return result;
		};

		System.out.println("Sorting array smallest to largest");
		Arrays.sort(stringArray, (a,b) -> a.length() - b.length());
		System.out.println(Arrays.asList(stringArray));
		System.out.println();
		System.out.println("Sorting array largest to smallest");
		Arrays.sort(stringArray, (a,b) -> b.length() - a.length());
		System.out.println(Arrays.asList(stringArray));
		System.out.println();
		System.out.println("Sorting arrays by first letter");
		Arrays.sort(stringArray, (a,b) -> a.charAt(0) - b.charAt(0));   //be careful when comparing upper and lower case letters
		System.out.println(Arrays.asList(stringArray));
		System.out.println();
		System.out.println("Sorting arrays putting those that contain e first");
		stringArray = sortByContainsE.sortStringArray(stringArray);
		System.out.println(Arrays.asList(stringArray));

	}

}




/*
StringSorter smallestToLargest = (strArray) -> {             //selection sort lambda
			String[] result = strArray;
			for (int x = 0; x < result.length; x++){
				int min = x;
				for (int j = x+1; j < result.length; j++){
					if (result[j].length() < result[min].length()){
						String temp = result[x];
						result[x] = result[j];
						result[j] = temp;
					}
				}
			}
			return result;
		};
		StringSorter largestToSmallest = (strArray) -> {	//largest to smallest lambda
						String[] result = strArray;
						for (int x = 0; x < result.length; x++){
							int min = x;
							for (int j = x+1; j < result.length; j++){
								if (result[j].length() > result[min].length()){
									String temp = result[x];
									result[x] = result[j];
									result[j] = temp;
								}
							}
						}
						return result;
		};
		stringArray = smallestToLargest.sortStringArray(stringArray);
		System.out.println("Sorting array smallest to largest");
		System.out.println(Arrays.asList(stringArray));
		System.out.println();
		System.out.println("Sorting array largest to smallest");
		stringArray = largestToSmallest.sortStringArray(stringArray);
		System.out.println(Arrays.asList(stringArray));
		System.out.println();
		*/


