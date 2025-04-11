package hashmap_implementation;

public class Entry {
	Entry next;
	int value;
	int key;

	public Entry(int key, int value) {
		this.value = value;
		this.key = key;
		this.next = null;
	}
	
}
