package Quest2;

public class BSTToRightSkewed {
	
	private Node root;
	
	Node headNode = null;
	Node prevNode = null;
	
	BSTToRightSkewed(){
		this.root = null;
	}

	// inserting data in original bst
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
	
	public void rotateBSTToSkewed() {
		rotateBSTToSkewed(this.root);
	}
	
	private void rotateBSTToSkewed(Node node){
	
		// base case
		if (node == null)
			return;

		// check till we reach leaf node
		rotateBSTToSkewed(node.left);

		// pick new root node
		if(headNode == null) {
			headNode = node;
			prevNode = node;
			
		// right rotate previous node
		} else {
			prevNode.right = node;
			node.left = null;
			prevNode = node;
		}

		// perform rotation for right sub tree
		rotateBSTToSkewed(node.right);
		
		// update root node of the tree
		this.root = headNode;
	}

	// printing tree from root node with left and right nodes
	public void printTree() {
		printTree(this.root);
	}

	private void printTree(Node node) {
		
		if(node == null)
			return;
		
		// print self		
		String leftChild, rightChild;
		
		if(node.left == null)
			leftChild = "X";
		else
			leftChild = node.left.data + "";
		
		if(node.right == null)
			rightChild = "X";
		else
			rightChild = node.right.data + "";
		
		String output = "%s <- %d -> %s";
		System.out.println( String.format( output, leftChild, node.data, rightChild ) );
		
		printTree(node.left);
		printTree(node.right);
		
	}

}
