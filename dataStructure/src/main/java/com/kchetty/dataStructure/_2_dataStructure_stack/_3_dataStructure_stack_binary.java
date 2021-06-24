package com.kchetty.dataStructure._2_dataStructure_stack;

public class _3_dataStructure_stack_binary {
	public static void main(String[] args) {
		_3_dataStructure_stack_binary_1 s = new _3_dataStructure_stack_binary_1(100);
		int intialVal = 5;
		
		while (intialVal > 0) {
			s.push(intialVal % 2);
			intialVal = intialVal / 2;
		}
		
		int val = s.pop();
		System.out.print("Binary value:- ");
		while(val > -1) {
			System.out.print(val);
			val = s.pop();
		}
		
		
		// System.out.println("reminder:- " + reminder + ", value:- " + intialVal);
	}
}

class _3_dataStructure_stack_binary_1 {
	int _MAX;
	int _TOP;
	int _STACK[];

	public _3_dataStructure_stack_binary_1(int _size) {
		this._MAX = _size;
		this._TOP = -1;
		this._STACK = new int[this._MAX];
	}

	public void push(int _val) {
		if (this._TOP >= (this._MAX - 1)) {
			System.out.println("Stack is full!!!");
			return;
		}
		this._STACK[++this._TOP] = _val;
	}

	public int pop() {
		if (this._TOP == -1) {
			// System.out.println("Stack is empty!!!");
			return -1;
		}
		int v = this._STACK[this._TOP];
		--this._TOP;
		return v;
	}
}
