package queue_array;

public class Queue {
	int[] arr;
	int size;
	int front = 0, rear = -1;
	public Queue(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	public void enqueue(int data) {
		if(rear < front) {
			arr[++rear] = data;
		}else {
			if(rear == (size-1))
				System.out.println("Queue is full");
			else {
				arr[++rear] = data;
			}
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		else {
			int front_element = arr[front];
			for(int i = 0; i < rear; i++) {
				arr[i] = arr[i+1];
			}
			--rear;
				
			return front_element;
		}
	}
	
	public int peek() {
		if(isEmpty())
			return Integer.MIN_VALUE;
		else
			return arr[front];
	}
	
	public boolean isEmpty() {
		boolean result = (rear < front) ? true : false;
		return result;
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("Queue is empty");
		for(int i = front; i <= rear; i ++)
			System.out.print(arr[i]+"\t");
		System.out.println();
	}
}
