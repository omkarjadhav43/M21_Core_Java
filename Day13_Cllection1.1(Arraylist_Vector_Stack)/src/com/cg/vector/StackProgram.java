package com.cg.vector;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Object> s = new Stack<Object> ();
		//Push is used to add the elements in the stack.
		s.push(11);
		s.push(12);
		s.push("thor");
		System.out.println(s);
		//Pop is used to remove the elements in the stack.
		System.out.println(s.pop());
		System.out.println(s);

	}

}
