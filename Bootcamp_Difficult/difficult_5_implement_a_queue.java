package Bootcamp_Difficult;

import java.util.Stack;

//import Bootcamp_Difficult.difficult_4_implement_a_stack.Stack;

public class difficult_5_implement_a_queue {
	public static void main(String[] args) 
		{
	        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();

	        // Enqueue items to the queue
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);

	        System.out.println("Queue after enqueues:");
	        queue.printQueue(); // Output: 10 20 30 40

	        // Dequeue items from the queue
	        System.out.println("Dequeued item: " + queue.dequeue()); 
	        System.out.println("Dequeued item: " + queue.dequeue()); 

	        System.out.println("Queue after dequeues:");
	        queue.printQueue(); // Output: 30 40

	        // Check if the queue is empty
	        System.out.println("Is the queue empty? " + queue.isEmpty()); 

	        // Dequeue remaining items
	        System.out.println("Dequeued item: " + queue.dequeue()); 
	        System.out.println("Dequeued item: " + queue.dequeue()); 

	        System.out.println("Queue after dequeuing all items:");
	        queue.printQueue(); 

	        System.out.println("Is the queue empty? " + queue.isEmpty()); 
	    }
	
}
	
	class QueueUsingStacks<T> {
	    private Stack stack1; // Stack used for enqueue operations
	    private Stack stack2; // Stack used for dequeue operations

	    public QueueUsingStacks() {
	        stack1 = new Stack();
	        stack2 = new Stack();
	    }

	    // Method to enqueue an element to the queue
	    public void enqueue(T item) {    stack1.push(item); }

	    // Method to dequeue an element from the queue
	    public T dequeue() {
	        if (stack2.isEmpty()) {
	        	
	            while (!stack1.isEmpty()) { stack2.push(stack1.pop()); }
	        }

	        if (stack2.isEmpty()) {
	            throw new RuntimeException("Queue is empty. Cannot dequeue.");
	        }

	        return (T) stack2.pop();
	    }

	    // Method to check if the queue is empty
	    public boolean isEmpty() {
	        return stack1.isEmpty() && stack2.isEmpty();
	    }

	    // Method to get the size of the queue
	    public int size() {
	        return stack1.size() + stack2.size();
	    }

	    // Method to print the elements of the queue
	    public void printQueue() {
	        Stack<T> tempStack1 = new Stack<>();
	        Stack<T> tempStack2 = new Stack<>();

	        while (!stack1.isEmpty()) {
	            tempStack1.push((T) stack1.pop());
	            
	            
	           
	        }

	        while (!tempStack1.isEmpty()) {
	            T item = tempStack1.pop();
	            tempStack2.push(item);
	            System.out.print(item + " ");
	        }

	        while (!stack2.isEmpty()) {
	            System.out.print(stack2.pop() + " ");
	        }

	        System.out.println();
	    }
	}

	
	




