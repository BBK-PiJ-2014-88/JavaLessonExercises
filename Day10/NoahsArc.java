public class NoahsArc{
	public static void main(String[] args){
	NoahsArc theArc = new NoahsArc();
	theArc.launch();
	}
	public void launch(){
		System.out.println("Noah Calling all the animals. What animals are coming?");
		MammalAnimal bear = new MammalAnimal("bear");
		bear.call();
		bear.reproduce();
		nonMammalAnimal beetle = new nonMammalAnimal("beetle");
		beetle.call();
		beetle.reproduce();
		aquaticAnimal crocodile = new aquaticAnimal("crocodile");
		crocodile.call();
		crocodile.reproduce();
		MammalAnimal dog = new MammalAnimal("dog");
		dog.call();
		dog.reproduce();
		aquaticAnimal dolphin = new aquaticAnimal("dolphin");
		dolphin.call();
		dolphin.reproduce();
		flyingAnimal eagle = new flyingAnimal("eagle");
		eagle.call();
		eagle.reproduce();
		nonMammalAnimal fly = new nonMammalAnimal("fly");
		fly.call();
		fly.reproduce();
		flyingAnimal pigeon = new flyingAnimal("pigeon");
		pigeon.call();
		pigeon.reproduce();
		aquaticAnimal salmon = new aquaticAnimal("salmon");
		salmon.call();
		salmon.reproduce();
		aquaticAnimal shark = new aquaticAnimal("shark");
		shark.call();
		shark.reproduce();
		nonMammalAnimal snake = new nonMammalAnimal("snake");
		snake.call();
		snake.reproduce();
		aquaticAnimal whale = new aquaticAnimal("whale");
		whale.call();
		whale.reproduce();
		MammalAnimal monkey = new MammalAnimal("monkey");
		monkey.call();
		monkey.reproduce();


	}
}