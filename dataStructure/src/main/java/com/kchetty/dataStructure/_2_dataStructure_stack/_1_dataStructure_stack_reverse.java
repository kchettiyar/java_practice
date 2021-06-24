package com.kchetty.dataStructure._2_dataStructure_stack;

import java.util.Scanner;

public class _1_dataStructure_stack_reverse {
	public static void main(String[] args) {
		int a[];
		System.out.println("Enter n value:- ");
		Scanner scanNVal = new Scanner(System.in);
		int inputVal = Integer.parseInt(scanNVal.nextLine());
		System.out.println("Enter Array elements:- ");
		a = new int[inputVal];
		_1_dataStructure_stack s = new _1_dataStructure_stack(inputVal);
		
		for(int i = 0; i < inputVal; i++) {
			a[i] = Integer.parseInt(scanNVal.nextLine());
			s.push(a[i]);
		}
		scanNVal.close();
		
		for(int i = 0; i < inputVal; i++) {
			a[i] = s.pop();
			System.out.println(a[i]);
		}
	}
}

class _1_dataStructure_stack {
	int _MAX;
	int _TOP;
	int _STACK[];

	public _1_dataStructure_stack(int _size) {
		this._MAX = _size;
		this._TOP = -1;
		this._STACK = new int[this._MAX];
	}

	public void push(int _value) {
		if (this._TOP >= (this._MAX - 1)) {
			System.out.println("Stack is full!!!");
			return;
		}
		this._STACK[++this._TOP] = _value;
	}

	public int pop() {
		if (this._TOP == -1) {
			System.out.println("Stack is empty!!!");
			return 0;
		}

		int val = this._STACK[this._TOP];
		--this._TOP;
		return val;
	}

}