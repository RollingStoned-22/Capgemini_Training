package comparable_and_comparator;

import java.util.Arrays;

public class Dog implements Comparable {
	String name;
	int age;
	String breed;

	public Dog(String name, int age, String breed) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}

	public static void main(String[] args) {

		Dog d1 = new Dog("Ethan", 5, "Labrador");
		Dog d2 = new Dog("Lex", 7, "Shi Tzu");
		Dog d3 = new Dog("Oreo", 2, "Corgi");
		Dog[] dog_arr = { d1, d2, d3 };
		Arrays.sort(dog_arr, new CompareBasedOnBreed());	//sort based on Breed
		Arrays.sort(dog_arr);								//sort using compareTo()
		
		for (Dog d : dog_arr) {

			System.out.println(d);
		}

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Dog d = (Dog) o;
		if (this.name.compareToIgnoreCase(d.name) != 0)
			return this.name.compareToIgnoreCase(d.name);
		else {
			if (this.age - d.age != 0)
				return this.age - d.age;
			else
				return 0;
		}
	}

}
