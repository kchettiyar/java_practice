package com.kchetty.dataStructure._2_dataStructure_stack;

public class _1_dataStructure_stack_str_reverse {
	public static void main(String[] args) {
		char chars[] = { 'C', 'A', 'M', 'Y'};
		_1_dataStructure_stack_str_Sta s = new _1_dataStructure_stack_str_Sta(chars.length);
		for(char c : chars) {
			s.push(c);
		}
		for(int i = 0; i < chars.length; i++) {
			System.out.println(s.pop());
		}
	}
}

class _1_dataStructure_stack_str_Sta {
	int _MAX;
	int _TOP;
	char _STACK[];
	
	public _1_dataStructure_stack_str_Sta(int _max) {
		this._MAX = _max;
		this._TOP = -1;
		this._STACK = new char[this._MAX];
	}
	
	public void push(char _c) {
		if(this._TOP >= (this._MAX - 1)) {
			System.out.println("Stack is full!!!");
			return;
		}
		this._STACK[++this._TOP] = _c;
	}
	
	public char pop() {
		char c = ' ';
		if(this._TOP == -1) {
			System.out.println("Stack is empty!!!");
			return c;
		}
		c = this._STACK[this._TOP];
		--this._TOP;
		return c;
	}
}
