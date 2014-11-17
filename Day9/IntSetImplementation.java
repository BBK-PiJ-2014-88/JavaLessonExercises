public class IntSetImplementation implements IntSet{
	int element = 0;
	IntSetImplementation right;
	IntSetImplementation left;

	public IntSetImplementation(int num){
		this.element = num;
	}

	public void add(int newNum){
		if(this.contains(newNum) == false){
			if (newNum > this.element){
				if (this.right == null){
					this.right = new IntSetImplementation(newNum);
				}
				else{
					this.right.add(newNum);
				}
			}
			else{
				if (this.left == null){
					this.left = new IntSetImplementation(newNum);
				}
				else{
					this.left.add(newNum);
				}
			}
		}
	}


	public boolean contains (int num){
		if (this.element == num){
			return true;
		}
		else if (num > this.element){
			if (this.right == null){
				return false;
			}
			else{
				return this.right.contains(num);
			}
		}
		else{
			if (this.left == null){
				return false;
			}
			else{
				return this.left.contains(num);
			}
		}
	}

	public boolean containsVerbose(int num){
			System.out.println("Checked: " + this.element);
			if (this.element == num){
				System.out.println("true");
				return true;
			}
			else if (num > this.element){
				if (this.right == null){
					System.out.println("false");
					return false;
				}
				else{
					return this.right.containsVerbose(num);
				}
			}
			else{
				if (this.left == null){
					System.out.println("false");
					return false;
				}
				else{
					return this.left.containsVerbose(num);
				}
		}
	}


	public String toString(){
		String toPrint = "";
		toPrint = toPrint + this.element + ", ";
		if (this.left != null){
			toPrint = toPrint + this.left.toString();
		}
		if (this.right != null){
			toPrint = toPrint + this.right.toString();
		}
		return toPrint.substring(0, toPrint.length());  //removes final comma
	}

	public static void main(String[] args){
		IntSetImplementation testingIntSet = new IntSetImplementation(6);
		testingIntSet.add(5);
		testingIntSet.add(9);
		testingIntSet.add(9); //checking to see duplicates cannot be added
		testingIntSet.add(3);
		testingIntSet.add(8);
		testingIntSet.add(11);
		testingIntSet.add(12);
		testingIntSet.containsVerbose(13);
		System.out.println(testingIntSet);
	}



}