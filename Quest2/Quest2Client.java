package Quest2;

public class Quest2Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BSTToRightSkewed tree = new BSTToRightSkewed();
		
		// values to create a binary search tree
		int[] input = {10, 32, 70, 65, 78, 30, 50, 31, 80, 55};
		
		//creating a bst
		for(int i = 0; i < input.length; i++) {
			tree.insert(input[i]);
		}
		
		//print original tree
		System.out.println("Original Tree");
		tree.printTree();
		
		//in place skewed tree
		tree.rotateBSTToSkewed();
		
		//print skewed tree
		System.out.println("Skewed Tree");
		tree.printTree();

	}

}
