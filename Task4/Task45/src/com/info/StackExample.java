package com.info;

import java.util.Stack;

public class StackExample {
	
	Stack<Integer> stack=new Stack<>();
	
	public void add(Integer ele) {
		stack.push(ele);
	}

	public void remove() {
		System.out.println(stack.pop());
		}
	
	public void checkEmpty() {
		if(stack.empty()) {
			System.out.println("stack is empty");
		}
	}
	private void topValue() {
		System.out.println(stack.peek());
		
	}

	public static void main(String[] args) {
		StackExample obj=new StackExample();
		obj.add(5);
		obj.add(7);
		obj.add(10);
		obj.remove();
		obj.checkEmpty();
		obj.topValue();

	}

	
}
