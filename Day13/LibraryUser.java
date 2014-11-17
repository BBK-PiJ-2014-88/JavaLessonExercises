public abstract class LibraryUser {
	public static int uniqueID = 0;     //Every time an ID is requested for a user, it takes this value. 1 is then added to this value. Ensures uniqueness
	public static int numberOfUsers = 0;  //Keeps track of where to add new User Names to the user String Array.
	public static int uniqueAdder = 2;   //To ensure User Names are all unique, if 2 names in String array are the same, adds this
	public static String[] UserNames = {"",""};  //String Array containing User Names

	public String name;
	public int IDnumber;

	public LibraryUser(String name){
		String nameholder = name;
		for (int x = 0; x < UserNames.length; x++){
			if (UserNames[x].equals(nameholder)){
				nameholder = nameholder + uniqueAdder;
				uniqueAdder++;
				break;
			}
		}
			isNearlyFull();
			UserNames[numberOfUsers] = nameholder;
			numberOfUsers++;
			System.out.println(nameholder);
			this.name = nameholder;
	}

	abstract public void setID();
	abstract public int getID();
	abstract public String getName();

	public void isNearlyFull(){
		if (UserNames[UserNames.length -1] != (new String(""))){
			String[] temp = new String[(UserNames.length) *2];
			for (int y = 0; y < temp.length; y++){
				temp[y] = new String("");
			}
			for (int x = 0; x < UserNames.length; x++){
				temp[x] = UserNames[x];
				UserNames = temp;
			}
		}
	}
}