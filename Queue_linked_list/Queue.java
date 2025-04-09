package queue_linked_list;

public class Queue {
	Node front;
	Node rear;
	static int count;
	
	public void enqueue(int data) {
		Node node = new Node(data);
		if(front == null) {
			front = node;
			rear = node;
			++count;
		}
		else {
			rear.next = node;
			rear = node;
			++count;
		}
	}
	
	public int dequeue() {
		if(front == null)
			return Integer.MIN_VALUE;
		else {
			int element = front.data;
			Node node = front.next;
			front.next = null;
			front = node;
			return element;
		}
	}
	
	public int peek() {
		if(front == null)
			return Integer.MIN_VALUE;
		else {
			return front.data;
		}
	}
	
	public void display() {
		if(front == null)
			System.out.println("Queue is empty");
		else {
			Node temp = front;
			while(temp != null) {
				System.out.print(temp.data+"\t");
				temp = temp.next;
			}System.out.println();
		}
	}
	
	public boolean isEmpty() {
		boolean result = (front == null) ? true : false;
		return result;
	}
}
