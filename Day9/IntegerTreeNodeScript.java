public class IntegerTreeNodeScript{
	public static void main(String[] args){
		IntegerTreeNodeScript treeTester = new IntegerTreeNodeScript();
		treeTester.launch();
	}
	public void launch(){
			IntegerTreeNode treeTester = new IntegerTreeNode(6);
			treeTester.add(9);
			treeTester.add(5);
			treeTester.add(3);
			treeTester.add(8);
			treeTester.add(11);
			treeTester.add(12);
			System.out.println(treeTester);
			System.out.println(treeTester.simplifiedToString());
			System.out.println("Tree Depth: " + treeTester.depth(0));
	}
}