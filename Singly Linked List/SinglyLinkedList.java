package singly_linked_list;

public class SinglyLinkedList {
	Node head;
	Node tail;
	static int count;

	public void insert(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
			tail = node;
			count++;
		} else {
			tail.next = node;
			count++;
		}

	}

	public void display() {
		if (head == null) {
			System.out.println("No nodes created");
		} else {
			Node temp = head;
			while (temp != tail.next) {
				System.err.print(temp.data + "--");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public void displayCount() {
		System.out.println("Number of nodes: " + count);
	}

	public void updateNode(int pos, int newData) {
		if (pos < 1 || pos > count || head == null) {
			System.out.println("Node doesn't exist");
		} else {
			int i = 1;
			Node temp = head;
			while (i != pos) {
				temp = temp.next;
				++i;
			}
			temp.data = newData;
		}

	}

	public void insertNodeInBetween(int pos, int newData) {
		if(pos < 1 || pos > count)
			System.out.println("Node doesn't exist");
		else if(head == null) {
			Node node = new Node(newData);
			head = node;
			tail = node;
			count++;
		}
		else if(pos == 1) {
			Node node = new Node(newData);
			node.next = head;
			head = node;
			count++;
		}
		else {
			int i = 1;
			Node node = new Node(newData);
			Node temp = head;
			while(i != (pos-1)) {
				temp = temp.next;
				i++;
			}
			node.next = temp.next;
			temp.next = node;
			count++;
		}
	}
	
	public void delete(int pos) {
		if(pos <1 || pos > count)
			System.out.println("Node doesn't exist");
		else if(pos == 1){
			Node temp = head;
			head = head.next;
			temp.next = null;
			count--;
		}
		else {
			Node temp = head;
			int i = 1;
			while(i != (pos-1)) {
				temp = temp.next;
				i++;
			}
			temp.next = temp.next.next;
			count--;
		}
	}
}
