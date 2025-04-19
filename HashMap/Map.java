package hashmap_implementation;

public class Map extends Object {
	int size = 16;
	Entry[] buckets = new Entry[size];
	
	public int hashCode(<? extends Number> key) {
		return (Integer)obj;
	}

	private int getbucketIndex(Number key) {
		return Math.abs(Number.hashCode(key)) % size;
	}

	public void put(Integer key, Object value) {
		int index = getbucketIndex(key);
		System.out.println("Entry is added at index: "+index);
		Entry head = buckets[index];
		Entry temp = head;
		while(temp != null) {
			if(temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Entry newEntry = new Entry(key, value);
		newEntry.next = buckets[index];
		buckets[index] = newEntry;
	}
	
	public void printNode(Entry node) {
		System.out.print(node.key+"\t"+node.value+"\t");
	}
	
	public void displayMap() {
		for(int i = 0; i < size; i++) {
			Entry temp = buckets[i];
			if(temp == null)
				continue;
			while(temp != null) {
				printNode(temp);
				temp = temp.next;
			}
			System.out.println();
		}
	}
	
	public Object getValue(Object key) {
		int index = getbucketIndex(key);
		Entry temp = buckets[index];
		while(temp!=null) {
			if(temp.equals(key)) 
				return temp.value;
			temp = temp.next;
		}
		return Integer.MIN_VALUE;
	}
	
	public void delete(Object key) {
		int index = getbucketIndex(key);
		Entry temp = buckets[index];
		Entry prev = null;
		if(temp == null) {
			System.out.println("Entry doesn't exist");
			return;
		}
		while(temp != null) {
			if(temp.key.equals(key)) {
				if(prev == null) {
					prev = temp;
					buckets[index] = temp.next;
					prev.next = null;
				}
				else {
					prev.next = temp.next;
					temp.next = null;
				}
			}
			prev = temp;
			temp = temp.next;
		}
		
	}
}
