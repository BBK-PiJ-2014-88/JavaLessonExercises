public class WhichStringIsBetter{
	public static String betterString(String a, String b, TwoStringPredicate lam){
		if(lamtrue){
			return a;
		}
		else{
			return b;
		}
	}
	public static void main(String[] args){
		WhichStringIsBetter tester = new WhichStringIsBetter();
		tester.launch();
	}
	public void launch(){
		System.out.println(WhichStringIsBetter.betterString("Hello","Goodbye", (a,b) -> {
			if (a.length() > b.length()){
				return true;
			}
			else{
				return false;
			}
			}));
	}
}