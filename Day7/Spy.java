public class Spy{
	public static int spyCount = 0;
	int spyID;

	public Spy(int spyIdentification){
		this.spyID = spyIdentification;
		Spy.spyCount++;
		System.out.println("ID of this Spy: " + this.spyID);
		System.out.println("Number of spies so far: " + Spy.spyCount);
	}

	public void die(){
		System.out.println("Spy " + this.spyID + " has been detected and eliminated");
		Spy.spyCount--;
		System.out.println("Number of spies so far: " + Spy.spyCount);
	}
	public static void main(String[] args){
		Spy spy1 = new Spy(1);
		Spy spy2 = new Spy(2);
		Spy spy3 = new Spy(3);
		Spy spy4 = new Spy(4);
		Spy spy5 = new Spy(5);
		spy3.die();
		spy2.die();
	}

}