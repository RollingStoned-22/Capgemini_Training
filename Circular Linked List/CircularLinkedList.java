package Circular_Linked_List;

public class CircularLinkedList {
	Node head;
	Node tail;
	static int count;

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
			tail.next = node;
			count++;
		} else {
			tail.next = node;
			tail = node;
			tail.next = head;
			count++;
		}
	}

	public void display() {
		if (head == null)
			System.out.println("List is empty");
		else {
			Node temp = head;
			do {
				System.out.print(temp.data + "\t");
				temp = temp.next;
			} while (temp != head);
			System.out.println();
		}

	}

	public void update(int pos, int data) {
		if (pos < 1 || pos > count)
			System.out.println("Node doesn't exist");
		else if (head == null)
			System.out.println("List is empty");
		else {
			Node temp = head;
			int i = 1;
			while (i < pos) {
				temp = temp.next;
				++i;
			}
			temp.data = data;
		}
	}

	public void insertAt(int pos, int data) {
		if (head == null)
			insert(data);
		else if (pos < 1 || pos > count) {
			System.out.println("Position doesn't exist");
			return;
		} else if (pos == 1) {
			Node node = new Node(data);
			node.next = head;
			head = node;
			tail.next = head;
			count++;
			return;
		} else if (pos == count) {
			Node node = new Node(data);
			Node temp = head;
			int i = 1;
			while (i < (count - 1)) {
				temp = temp.next;
				++i;
			}
			temp.next = node;
			node.next = tail;
			tail = node;
			count++;
		} else {
			int i = 1;
			Node temp = head;
			while (i < (pos - 1)) {
				temp = temp.next;
				i++;
			}
			Node node = new Node(data);
			node.next = temp.next;
			temp.next = node;
			count++;
		}
	}

	public void delete(int pos) {
		if (pos < 1 || pos > count) {
			System.out.println("Node doesn't exist");
			return;
		} else if (pos == 1) {
			tail.next = head.next;
			head.next = null;
			head = tail.next;
			count--;
			return;
		} else if (pos == count) {
			Node temp = head;
			int i = 1;
			while (i < (count - 1)) {
				temp = temp.next;
				++i;
			}
			temp.next = head;
			tail.next = null;
			count--;
		} else {
			int i = 1;
			Node temp = head;
			while (i < (pos - 1)) {
				temp = temp.next;
				++i;
			}
			Node node = temp.next;
			temp.next = node.next;
			node.next = null;
			count--;
		}

	}
}
