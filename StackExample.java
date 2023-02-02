package collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
	    Stack<Integer>stack=new Stack<>();
	    stack.push(12);
	    stack.push(45);
	    stack.push(67);
	    stack.push(99);
	    stack.push(23);
	    System.out.println(stack);
	    System.out.println(stack.pop());	   
	    System.out.println(stack);
	    System.out.println(stack.search(67));
	    int i=stack.peek();
	    System.out.println(i);
	}

}
