package Bootcamp_Difficult;
	
public class difficult_4_implement_a_stack {

	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class Stack {
	    private Node top; 

	    public Stack() {
	        top = null;
	    }

	    public void push(int data) {
	        Node newNode = new Node(data);
	        newNode.next = top; 
	        top = newNode; 
	    }

	    // Method to pop an item from the stack
	    public int pop() {
	        if (isEmpty()) {
	            throw new RuntimeException("Stack is empty. Cannot pop.");
	        }
	        int data = top.data; 
	        top = top.next; 
	        return data;
	    }

	    // Method to peek at the top item of the stack without removing it
	    public int peek() {
	        if (isEmpty()) {
	            throw new RuntimeException("Stack is empty. Cannot peek.");
	        }
	        return top.data; 
	    }

	    // Method to check if the stack is empty
	    public boolean isEmpty() {
	        return top == null; 
	    }

	    // Method to print the stack
	    public void printStack() {
	        Node current = top;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }
	}


	///////Test the Stack implementation

	public class Main {
	    public static void main(String[] args) {
	        Stack stack = new Stack();

	        // Push items onto the stack
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);

	        System.out.println("Stack after pushes:");
	        stack.printStack(); // Output: 40 30 20 10

	        // Peek at the top item of the stack
	        System.out.println("Top item (peek): " + stack.peek()); 

	        // Pop items from the stack
	        System.out.println("Popped item: " + stack.pop()); 
	        System.out.println("Popped item: " + stack.pop()); 

	        System.out.println("Stack after pops:");
	        stack.printStack(); 

	        // Check if the stack is empty
	        System.out.println("Is the stack empty? " + stack.isEmpty()); 

	        // Pop remaining items
	        stack.pop();
	        stack.pop();

	        System.out.println("Stack after popping all items:");
	        stack.printStack(); 

	        System.out.println("Is the stack empty? " + stack.isEmpty()); 
	    }
	}
}



