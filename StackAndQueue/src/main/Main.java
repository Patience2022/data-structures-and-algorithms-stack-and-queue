package main;

import queue.MyQueue;
import stack.MyStack;

public class Main {

	public static void main(String[] args) {
	
		MyStack stack = new MyStack(1);
		
		stack.push(6);
		stack.push(7);
		System.out.println("Elements in a Stack are: ");
		stack.printElements();
		stack.pop();
		System.out.println("\nElements in a Stack after POP: ");
		stack.printElements();
		
		
//		QUEUE
		
		MyQueue queue = new MyQueue(3);
		queue.enqueue(7);
		queue.getFirst();
		queue.getLast();
		System.out.println("Length: "+queue.getLength());
		System.out.println("\nElements of the queue are: ");
		queue.printElememts();
		
		queue.dequeue();
		System.out.println("\nElements of the queue afte DEQUEUE: ");
		queue.printElememts();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
