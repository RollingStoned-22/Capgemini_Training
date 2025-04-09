package doubly_linked_list;

public class Doubly_Linked_List {
	Node head;
	Node tail;
	static int count;

	public void insertBwd(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			count++;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
			count++;
		}
	}

	public void insertFwd(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			count++;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
			count++;
		}
	}

	public void displayFwd() {
		Node temp = head;
		while (temp != tail.next) {
			System.err.print(temp.data + "\t");
			temp = temp.next;
		}
		System.out.println();
	}

	public void displayCount() {
		System.out.println("Number of nodes: " + count);
	}

	public void displayBwd() {
		Node temp = tail;
		while (temp != head.prev) {
			System.err.print(temp.data + "\t");
			temp = temp.prev;
		}
		System.out.println();
	}

	public void updateNode(int pos, int data) {
		if (head == null || pos < 1 || pos > count)
			System.out.println("Node doesn't exist");
		else if (pos == 1) {
			head.data = data;
		} else if (pos == count)
			tail.data = data;
		else {
			int i = 1;
			Node temp = head;
			while (i < pos) {
				temp = temp.next;
				++i;
			}
			temp.data = data;
		}
	}

	public void insertAt(int pos, int data) {
		if (pos < 1 || pos > count)
			System.out.println("Node doesn't exist");
		else if(head == null) {
			Node node = new Node(data);
			head = node;
			tail = node;
			count++;
		}
		else if (pos == 1) {
			Node node = new Node(data);
			head.prev = node;
			node.next = head;
			head = node;
			count++;
		} else {
			Node temp = head;
			int i = 1;
			while (i < (pos - 1)) {
				temp = temp.next;
				++i;
			}
			Node node = new Node(data);
			node.next = temp.next;
			temp.next.prev = node;
			node.prev = temp;
			temp.next = node;
			count++;
		}
	}

	public void delete(int pos) {
		if (pos < 1 || pos > count)
			System.out.println("Node doesn't exist");
		else if (pos == 1) {
			head = head.next;
			head.prev.next = null;
			head.prev = null;
			--count;
		} else if (pos == count) {
			Node temp = tail.prev;
			tail.prev = null;
			temp.next = null;
			tail = temp;
			count--;

		} else {
			int i = 1;
			Node temp = head;
			while (i < (pos - 1)) {
				temp = temp.next;
				++i;
			}
			Node node = temp.next.next;
			temp.next = node;
			node.prev = temp;
			--count;
		}

	}
}
