public class UserImpl implements User{
	private String name;
	private int ID;
	public UserImpl(String name){
		this.name = name;
	}
	public void setID(int x){
		this.ID = x;
	}
	public int getID(){
		return this.ID;
	}
	public String getName(){
		return this.name;
	}

}