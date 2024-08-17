package Bootcamp_Difficult;

public class difficult_2_doubly_linked {
	
	

}
class Node {
    int data;
    Node next;
    Node prev;

     public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

   public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;          tail = newNode;
        } else {
            tail.next = newNode;      newNode.prev = tail;          tail = newNode;
        }
    }

   public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public void delete(int data) {
        Node temp = head;

       //Traverse the list to find the node to delete
        while (temp != null && temp.data != data) {   temp = temp.next;      }

       // If node to be deleted is found
        if (temp != null) {        
                // If node to be deleted is the head
                if (temp == head) {   head = temp.next;       }

                // If node to be deleted is not the last node
               if (temp.next != null) {     temp.next.prev = temp.prev;        }

               // If node to be deleted is not the first node
               if (temp.prev != null) {          temp.prev.next = temp.next;        }

            // If node to be deleted is the tail
            if (temp == tail) {        tail = temp.prev;      }

            temp = null; // Help GC
        }
    }
  //Test the Doubly Linked List Implementation
    public class Main {
        public static void main(String[] args) {
            DoublyLinkedList dll = new DoublyLinkedList();

            // Append nodes to the doubly linked list
            dll.append(10);   
            dll.append(20);
            dll.append(30);
            dll.append(40);

            // Print the list forward
            System.out.println("Forward traversal:");
            dll.printForward();

            // Print the list backward
            System.out.println("Backward traversal:");
            dll.printBackward();

            // Delete a node from the list
            dll.delete(20);

            // Print the list after deletion
            System.out.println("List after deleting 20:");
            dll.printForward();
        }
    }

}
