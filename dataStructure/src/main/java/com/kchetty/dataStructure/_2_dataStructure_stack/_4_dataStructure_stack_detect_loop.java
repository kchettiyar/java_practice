package com.kchetty.dataStructure._2_dataStructure_stack;

public class _4_dataStructure_stack_detect_loop {
	public static void main(String[] args) {
		_4_dataStructure_stack_detect_loop_1 s = new _4_dataStructure_stack_detect_loop_1();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		s.setLoop();
		System.out.println("Is it loop:- " + s.detectLoop());
		
	}
}

class _4_dataStructure_stack_detect_loop_1 {
	private class _4_Node {
		int data;
		_4_Node link;
	}
	
	private _4_Node top;
	
	public _4_dataStructure_stack_detect_loop_1() {
		this.top = null;
	}
	
	public void push(int x) {
		_4_Node temp = new _4_Node();
				
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
		
		_4_Node temp = this.top;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	
	public void setLoop() {
		_4_Node last = this.top;
		_4_Node current = this.top;
		
		while(current != null) {
			_4_Node previous = current.link;
			if(previous.link == null) {
				previous.link = last;
				return;
			}
			else
				current = previous;
		}
	}
	
	public boolean detectLoop() {
		_4_Node last = this.top;
		_4_Node current = this.top;

		while(current != null) {
			current = current.link;
			if(last == current)
				return true;
		}
		
		return false;
	}
}
