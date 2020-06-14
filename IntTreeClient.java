// Written by Alexander Baker on 6/13/2020
// program that demonstrates teh use of the IntTree class
// For use with Assignment 9: Binary Trees
// ITC-155 spring quarter 2020
public class IntTreeClient {

	public static void main(String[] args) {
		
		IntTree t = new IntTree(12); // construct new IntTree binary tree
		System.out.println("Tree structure:");
		t.printSideways(); // print binary tree sideways
		System.out.println();
		t.printPreorder(); // print binary tree in preorder traversal
		t.printInorder();  // print binary tree in an inorder traversal
		t.printPostorder();// print binary tree in a postorder traversal
		System.out.println("sum:" + t.sum()); // print sum of all values stored in binary tree 't'
		System.out.println("number of levels:" + t.countLevels()); // print the number of levels in binary tree 't'
		System.out.println("number of leaves:" + t.countLeaves()); // print the number of leaves in binary tree 't'
		System.out.println();
		
		
		// Assignment 9: ch17 p.1077 e.2 Test statements
		IntTree bt = new IntTree(6);
		System.out.println("Assignment 9: ch17 p.1077 e.2");
		bt.printSideways();
		System.out.println("sum:" + bt.sum()); // should print 21
		System.out.println("number of levels:" + bt.countLevels()); // should print 3
		System.out.println("number of leaves:" + bt.countLeaves()); // should print 3
		System.out.println("number of empty branches:" + bt.countEmpty()); // should print 7
	}

}
