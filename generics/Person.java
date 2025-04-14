package generics;

public class Person<T,Y> {
	T id;
	Y name;
	
	Person(T id, Y name){
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return this.id+" "+this.name;
	}
}
