public class SmartPhone extends MobilePhone{
	public SmartPhone(String brand){
		super(brand);
	}
	public void browseWeb(String address){
		System.out.println("Browing " + address + " website.");
	}
	public void findPosition(){
		System.out.println("You are in London");
	}

	@Override
	public void call(String number){
		if (number.substring(0,2).equals("00")){
			System.out.println("Calling <" + number + "> through the internet to save money");
		}
		else{
			super.call(number);
		}
	}

	//4.1 - Reducing Visibility
	//if method is private in parent class, it doesn't exist to this class
	//so had to copy it and make it public so script can access it.
	//eventhough objects can see eachother's methods, cannot call a private method
	//within another class that the object is in
	//so creating an object of MobilePhone here and calling the method doesn't work here
	//eventhough object can see the method, playgame method doesn't exist to smartphone
	public void playGame(){
		System.out.println("Playing a game");
	}



}