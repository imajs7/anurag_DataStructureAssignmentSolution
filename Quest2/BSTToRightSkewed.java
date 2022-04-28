package Quest2;

import java.util.LinkedList;
import java.util.Queue;

public class BSTToRightSkewed {
	
	private Node root;
	private Queue<Integer> queue = new LinkedList<Integer>();
	
	BSTToRightSkewed(){
		this.root = null;
	}
	
	public void insert(int data) {
		this.root = insert(this.root, data);
	}

	private Node insert(Node node, int data) {
		
		if(node == null) {
			Node newNode = new Node(data);
			return newNode;
		}
		
		if(data < node.data) {
			node.left = insert(node.left, data);
		} else if(data > node.data) {
			node.right = insert(node.right, data);
		}
		
		return node;
	}
	
	public void createNewTree() {
		createQueue();
		this.root = null;
		while(! this.queue.isEmpty()) {
			this.root = insert( this.root, this.queue.remove() );
		}
	}
	
	public void createQueue() {
		createQueue(this.root);
	}
	
	// create queue using inorder traversal
	private void createQueue(Node node) {
		if(node != null) {
			createQueue(node.left);
			this.queue.add(node.data);
			createQueue(node.right);
		}
	}

	public void printTree() {
		printTree(this.root);
	}

	private void printTree(Node node) {
		
		if(node == null)
			return;
		
		// print self
		String str = "";
		
		if(node.left == null) {
			str += "X";
		} else {
			str += node.left.data;
		}
		
		str += " <- " + node.data + " -> ";
		
		if(node.right == null) {
			str += "X";
		} else {
			str += node.right.data;
		}
		
		System.out.println(str);
		
		printTree(node.left);
		printTree(node.right);
		
	}

}