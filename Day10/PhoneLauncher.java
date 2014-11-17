public class PhoneLauncher{
	public static void main(String[] args){
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch(){
		SmartPhone smartPhoneTester = new SmartPhone("Nokia Lumia");
		smartPhoneTester.call("999");
		smartPhoneTester.call("0046217"); //testing Override
		smartPhoneTester.playGame();
		smartPhoneTester.ringAlarm("Wake up!");
		smartPhoneTester.printLastNumbers();
		smartPhoneTester.browseWeb("www.google.com");
		smartPhoneTester.findPosition();
		System.out.println("Brand: " + smartPhoneTester.getBrand());
	}
}