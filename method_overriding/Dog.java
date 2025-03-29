package method_overriding;

public class Dog extends Animal {
	public String breed;
	public Dog(String breed) {
		this.breed = breed;
	}
	public void sound() {
		System.out.println("Dog is barking");
	}
}
