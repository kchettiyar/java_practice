package com.kchetty.dataStructure._1_dataStructure_intro;

public class _2_dataStructure_stack_ex2 {
	// Stack Details

	// Stack formula is Last In First Out(LIFO) or First In Last Out(FILO)

	// Operation on Stack is insert(PUSH), delete(POP), Peek(display last/top value)
	// and display/traverse

	// Stack properties are
	// MAXSIZE (size of stack)
	// TOP (index of last inserted value and initial value is -1)
	//

	// Stack can be implemented using
	// array(Static Implementation)
	// linked list(Dynamic Implementation)
	
	public static void main(String[] args) {
		stackArrayTest();
		// stackLinkedListTest();
	}
	
	public static void stackLinkedListTest() {
		_2_Stack_LinkedList s = new _2_Stack_LinkedList();
		s.peek();
		s.pop();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		s.peek();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		// s.display();
	}
	
	public static void stackArrayTest() {
		_2_Stack_Array s = new _2_Stack_Array(4); 
		s.push(10); 
		s.push(20); 
		s.push(30);
		s.push(40);
		s.push(50);
		
		// System.out.println(s.peek());
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.display();		
	}
}

class _2_Stack_LinkedList {
	private class Node {
		int data;
		Node link;
	}
	
	private Node top;
	
	public _2_Stack_LinkedList() {
		this.top = null;
	}
	
	public void push(int x) {
		Node temp = new Node();
				
		temp.data = x;
		temp.link = top;
		top = temp;
	}
	
	public boolean isEmpty() {
		return this.top == null;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println(this.top.data);
	}
	
	public void pop() {
		if(this.top == null) {
			System.out.println("Stack is empty");
			return;
		}
		
		top = top.link;
	}
	
	public void display() {
		if(this.top == null) {
			System.out.println("Stack is empty");
			return;
		}
		
		Node temp = this.top;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	
}

class _2_Stack_Array {
	private int __MAX;
	private int __TOP;
	private int a[];

	public _2_Stack_Array(int _max) {
		this.__MAX = _max;
		this.__TOP = -1;
		a = new int[this.__MAX];
	}

	public boolean isEmpty() {
		return (this.__TOP < 0);
	}

	public boolean push(int v) {
		if (this.__TOP >= (this.__MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}

		this.a[++this.__TOP] = v;
		System.out.println(v + " pushed into stack");
		return true;
	}
	
	public int pop() {
		if(this.__TOP < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		return a[this.__TOP--];
	}
	
	public int peek() {
		if(this.__TOP < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		return this.a[this.__TOP];
	}
	
	public void display() {
		for(int i = 0; i <= this.__TOP; i++) {
			System.out.println(this.a[i]);
		}
	}
}