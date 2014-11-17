public class LibraryUserImpl extends LibraryUser{
	public LibraryUserImpl(String name){
		super(name);
	}
	public void setID(){
		this.IDnumber = LibraryUser.uniqueID;
		LibraryUser.uniqueID++;
	}
	public int getID(){
		return this.IDnumber;
	}
	public String getName(){
		return this.name;
	}
}