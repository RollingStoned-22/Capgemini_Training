package hashmap_implementation;

import javax.management.RuntimeErrorException;

public class HashMapImplementation {
	int size = 16;
	Entry[] buckets = new Entry[size];

	private int getbucketIndex(int key) {
		return Math.abs(Integer.hashCode(key)) / size;
	}

	public void put(int key, int value) {
		Entry newEntry = new Entry(key, value);
		int index = getbucketIndex(key);
		System.out.println("Entry is added at index: " + index);
		Entry temp = buckets[index];

		if (temp != null) {
			while (temp != null) {
				if (temp.key == key) {
					temp.value = value;
					return;
				}
				temp = temp.next;
			}

			newEntry.next = buckets[index];
			buckets[index] = newEntry;

		}
	}

	public int getValue(int key) {
		int index = getbucketIndex(key);
		Entry temp = buckets[index];
		while(temp!=null) {
			if(temp.key == key)
				return temp.value;
			temp = temp.next;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		HashMapImplementation map = new HashMapImplementation();
		map.put(10, 5);
		map.put(20, 6); 
		map.put(30, 9);
		System.out.println(map.getValue(20));
	}
}
