package stack_array;

public class Stack {
	int[] arr;
	int top = -1;
	int size;
	Stack(int size){
		arr = new int[size];
		this.size = size;
	}
	public void push(int data) {
		if(top < (size-1))
			arr[++top] = data;
		else
			System.out.println("Stack is full");
	}
	public boolean isStackEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	public int pop() {
		if(isStackEmpty())
			return Integer.MIN_VALUE;
		else
			return arr[top--];
	}
	public int peek() {
		if(isStackEmpty())
			return Integer.MIN_VALUE;
		else
			return arr[top];
	}
}
