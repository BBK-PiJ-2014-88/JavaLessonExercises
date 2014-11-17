public class MammalAnimal extends Animal{
	public MammalAnimal(String name){
		super(name);
	}
	@Override
	public void reproduce(){
		this.giveBirth();
	}
	public void giveBirth(){
		System.out.println("After the rain, we the " + this.getName() + "'s will reproduce by giving Birth");
	}
}