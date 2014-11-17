public class Start{
	public static void main(String[] args){
		Start tester = new Start();
		tester.launch();
	}

	public void launch(){
		MobilePhone myPhone = new SmartPhone("Nokia Lumia"); //this side says what the object
		SmartPhone newmyPhone = (SmartPhone) myPhone;        //actually is. MobilePhone
		myPhone.playGame();							//is just a pointer, hides smartphone feature
		myPhone.call("07711723456");
		myPhone.call("0045678");
		newmyPhone.findPosition();
		newmyPhone.browseWeb("www.google.com");
		myPhone.ringAlarm("Wake up");
		myPhone.printLastNumbers();
		System.out.println(myPhone.getBrand());
		testPhone(myPhone);
		MobilePhone tester = new MobilePhone("Samsung");
		testPhone(tester);

	}

	public void testPhone(Phone phone){
		SmartPhone phone2 = (SmartPhone) phone;  //myPhone is a SmartPhone so can be casted
		phone2.playGame();                       //But mobilePhone is not a smartphone
		phone2.call("002872");					 //so cannot be casted to SmartPhone
		phone2.findPosition();
		phone2.browseWeb("www.yahoo.com");
		phone2.ringAlarm("wakey wakey");
		System.out.println(phone2.getBrand());
	}

//couldn't find symbol for SmartPhone until made copy of SmartPhone.java file into Day11 folder.
//2.2 - Start script cannot find browseWeb and findPosition methods from SmartPhone
}