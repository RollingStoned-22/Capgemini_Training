package method_overriding;

public class Animal_Driver {
	public static void main(String[] args) {
		Animal dog = new Animal();
//		((Dog)dog).sound();
		Tiger tiger = new Tiger();
		tiger.sound();
		Animal animal = new Dog("Shiba Inu");
		(animal).sound();
	}
}
