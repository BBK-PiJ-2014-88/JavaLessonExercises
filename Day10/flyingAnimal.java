public class flyingAnimal extends nonMammalAnimal{
	public flyingAnimal(String name){
		super(name);
	}
	@Override
	public void call(){
		System.out.println("<" + this.getName() + "> now flying, will come later when tired...");
	}

}