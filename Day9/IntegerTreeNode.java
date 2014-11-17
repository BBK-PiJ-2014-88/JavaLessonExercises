public class IntegerTreeNode{
	int value;
	IntegerTreeNode right;
	IntegerTreeNode left;

	public IntegerTreeNode(int treeValue){
		this.value = treeValue;
	}

	public String toString(){
		String toPrint = "";

		toPrint = toPrint + "[" + this.value;
		if (this.left == null && this.right == null){
			toPrint = toPrint + " L[] R[]]";
		}
		if(this.left != null && this.right == null){
			toPrint = toPrint + " L" + this.left.toString() + "]" + " R[]]";
	    }
		if (this.right != null && this.left == null){
			toPrint = toPrint + " L[] R" + this.right.toString() + "]";
		}
		if (this.left != null && this.right != null){
			toPrint = toPrint + " L" + this.left.toString() + " R" + this.right.toString() + "]";
		}

		return toPrint;
	}


	public String simplifiedToString(){
		String toPrint = "";

		toPrint = toPrint + "[" + this.value;
		if (this.left == null && this.right == null){
			toPrint = toPrint + "]";
		}
		if(this.left != null && this.right == null){
			toPrint = toPrint + this.left.simplifiedToString() + "]";
	    }
		if (this.right != null && this.left == null){
			toPrint = toPrint + "[" + this.right.simplifiedToString() + "]";
		}
		if (this.left != null && this.right != null){
			toPrint = toPrint + this.left.simplifiedToString() + this.right.simplifiedToString() + "]";
		}

		return toPrint;
	}



	public int depth(){
		if (this.left == null && this.right == null){
			return 0;
		}
		else if (this.left != null && this.right == null) {
			return 1 + this.left.depth();
		}
		else if (this.left == null && this.right != null){
			return 1 + this.right.depth();
		}
		else{
			return (Math.max(1 + this.left.depth(), 1 + this.right.depth()));
		}

	}

	public int getMax(){
		int maximum = this.value;

		while(right != null){
			maximum = right.getMax();
		}
		return maximum;

	}

	public int getMin(){
		int minimum = this.value;

		while(left != null){
			minimum = left.getMin();
		}
		return minimum;

	}

	public void add(int newNumber){
		if (newNumber > this.value){
			if (right == null){
				right = new IntegerTreeNode(newNumber);
			}
			else{
				right.add(newNumber);
			}
		}
		else{
			if (left == null){
				left = new IntegerTreeNode(newNumber);
			}
			else{
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int num){
		if (num == this.value){
			return true;
		}
		else if (num > this.value){
			if (right == null){
				return false;
			}
			else {
				return right.contains(num);
			}
		}
		else{
			if (left == null){
				return false;
			}
			else{
				return left.contains(num);
			}
		}
	}
}