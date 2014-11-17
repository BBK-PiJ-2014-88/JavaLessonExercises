public class RestrictedSmartPhone extends SmartPhone{
	RestrictedSmartPhone(String brand){
		super(brand);
	}
	@Override
	private void playGame(){
		System.out.println("Playing a game");
	}
}

//cannot Override - attempting to assign weaker access privileges; was public