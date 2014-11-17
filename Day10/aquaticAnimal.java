public class aquaticAnimal extends nonMammalAnimal{
	public aquaticAnimal(String name){
		super(name);
	}


	@Override
	public void call(){
		System.out.println("<" + this.getName() + "> will not come...");
	}
}