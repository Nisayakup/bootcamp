package Bootcamp_Difficult;

public class difficul_1_binarySearch {
	
	
	
	
	class Node {
	    int key;
	    Node left, right;

	    public Node(int item) {
	        key = item;
	        left = right = null;
	    }
	}

	class BinarySearchTree {

	    Node root;

	    BinarySearchTree() {      root = null;  }

	    void insert(int key) {       root = insertRec(root, key);   }

	    Node insertRec(Node root, int key) {
	        if (root == null) {
	            root = new Node(key);
	            return root;
	        }

	        if (key < root.key)
	            root.left = insertRec(root.left, key);
	        else if (key > root.key)
	            root.right = insertRec(root.right, key);

	        return root;
	    }

	    void inorder() {
	        inorderRec(root);
	    }

	     void inorderRec(Node root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.print(root.key + " ");
	            inorderRec(root.right);
	        }
	    }

	    boolean search(int key) {     return searchRec(root, key);   }

	    boolean searchRec(Node root, int key) {
	        
	        if (root == null)        return false;
	        if (root.key == key)        return true;
	        if (root.key < key)        return searchRec(root.right, key);

	        return searchRec(root.left, key);
	    }
	}


}
