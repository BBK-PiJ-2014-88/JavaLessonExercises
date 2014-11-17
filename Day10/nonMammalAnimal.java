public class nonMammalAnimal extends Animal{
	public nonMammalAnimal(String name){
		super(name);
	}

	@Override
	public void reproduce(){
		this.layEggs();
	}

	public void layEggs(){
		System.out.println("After the rain, we the " + this.getName() + "'s will reproduce by laying Eggs");
	}
}