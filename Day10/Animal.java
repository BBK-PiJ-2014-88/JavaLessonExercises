public class Animal{
	private String name;
	public Animal(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void reproduce(){
		System.out.println("All animals can reproduce");
	}

	public void makeSound(){
		System.out.println("SOUND COMING OUT");
	}
	public void call(){
		System.out.println("<" + this.getName() + "> coming...");
	}
}