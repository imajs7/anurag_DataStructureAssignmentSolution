package Quest2;

public class Quest2Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BSTToRightSkewed tree = new BSTToRightSkewed();
		
		// values to create a binary search tree
		int[] input = {50, 30, 10, 60, 55};
		
		//creating a bst
		for(int i = 0; i < input.length; i++) {
			tree.insert(input[i]);
		}
		
		//print original tree
		System.out.println("Original Tree");
		tree.printTree();
		
		//create a new skewed bst
		tree.createNewTree();
		
		//print skewed tree
		System.out.println("Skewed Tree");
		tree.printTree();

	}

}
