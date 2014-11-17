public class MemoizedFibonacci{
	//arrays are 0-based, so F(1) is stored at position 0, etc
	private static int[] precalculated = null;
	public static void main(String[] args){
		System.out.println(fib(10));
		precalculated = null;
		System.out.println(fib(20));
		precalculated = null;
		System.out.println(fib(40));
		precalculated = null;
		System.out.println(fib(60));
		precalculated = null;
		System.out.println(nonMemoFib(10));
		System.out.println(nonMemoFib(20));
		System.out.println(nonMemoFib(40));
		System.out.println(nonMemoFib(60));
	}

	public static int fib(int n){
		if (precalculated == null){
			initPreCalculatedArray(n);
		}
		if (precalculated[n - 1] != -1){
			return precalculated[n - 1];
		}
		else{
			int result = fib(n - 1) + fib(n - 2);
			precalculated[n - 1] = result;
			return result;
		}
	}

	private static void initPreCalculatedArray(int size){
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++){
			precalculated[i] = -1; //to indicate "not calculated yet"
		}
		precalculated[0] = 1; //F(1)
		precalculated[1] = 1;	  //F(2)
	}

	private static int nonMemoFib(int n){
		if ((n == 1) || (n == 2)){
			return 1;
		}
		else {
			int result = nonMemoFib(n-1) + nonMemoFib(n-2);
			return result;
		}
	}

}