public class MobilePhone extends OldPhone{
	public MobilePhone(String brand){
		super(brand);
	}

	public void ringAlarm(String msg){
		System.out.println("Ring Ring " + msg);
	}
	public void playGame(){
		System.out.println("Playing a game");
	}
	public void printLastNumbers(){
		String[] lastNumbers = new String[10];
		for (int x = 0; x<10; x++){
			lastNumbers[x] = "Number: " + x;
		}
		for (int y = 0; y <10; y++){
			System.out.println(lastNumbers[y]);
		}
	}
	public static void main(String[] args){
		MobilePhone testingPrint = new MobilePhone("Nokia");
		testingPrint.printLastNumbers();
	}
}