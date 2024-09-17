package hw7Inheretance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		// Parents Class.
		animal.animalInfo();

		System.out.println("\n");

		System.out.println("\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		// Single inheritance.

		mammal.animalInfo();

		System.out.println("\n");
		Birds birds = new Birds();
		// child class .
		birds.birdsInfo();

		birds.animalInfo();

		System.out.println("\n");
		BullDog bullDog = new BullDog();
		bullDog.bulldogInfo();
		bullDog.animalInfo();

		System.out.println("\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.animalInfo();

		System.out.println("\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.animalInfo();

		System.out.println("\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.animalInfo();

		System.out.println("\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.animalInfo();

		// Mammal,Reptile,and Bird extends to animal. its a Hierarchical inheritance.
		// Bulldog extends Dog, dog extends Mammal,Mammal extends to animal. Its a Multilevel inheritance.
		// Mammal extends to Animal.Its a Single inheritance.
	}

}
