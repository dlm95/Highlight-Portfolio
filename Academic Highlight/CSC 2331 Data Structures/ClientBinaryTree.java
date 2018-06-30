/*
 * Lab19
 * Richard A. Clapp
 * CSC 2331-01
 * Data Structures
 */
import java.util.Iterator;

import treePackage.*;

public class ClientBinaryTree {

	public static void createTree(BinaryTree<String> rootNode) {
		
		
		// Create the nodes at level 2	
		BinaryTree<String> level2Node1 = new BinaryTree<String>();
		BinaryTree<String> level2Node2 = new BinaryTree<String>();
				
		// Create the nodes at level 3
		BinaryTree<String> level3Node1 = new BinaryTree<String>();
		BinaryTree<String> level3Node2 = new BinaryTree<String>();
		BinaryTree<String> level3Node3 = new BinaryTree<String>();
		
		// Create the nodes at level 4
		BinaryTree<String> level4Node1 = new BinaryTree<String>();
		BinaryTree<String> level4Node2 = new BinaryTree<String>();

		// Set values to the leaves at level 4
		level4Node1.setTree("F", null, null);		// no children
		level4Node2.setTree("G", null, null);		// no children
				
		// Set values to the nodes at level 3
		level3Node1.setTree("D", null, null);		// no children
		level3Node2.setTree("E", level4Node1, level4Node2);	// 2 children (F and G)
		level3Node3.setTree("H", null, null);		// no children

		// Set values to the nodes at level 2
		level2Node1.setTree("B", level3Node1, level3Node2); // 2 children (D and E)
		level2Node2.setTree("C", null, level3Node3);	// 1 child (H)
		
		// Set values to the root at level 1
		rootNode.setTree("A", level2Node1, level2Node2);	// 2 children (B and C)
				
		}
	
	public static void traverseTree(BinaryTree<String> rootNode) {
		
		System.out.println("\n\nInorder traversal:");
		System.out.println("Expected: D  B  F  E  G  A  C  H ");
		System.out.print("Actual:   ");
		Iterator<String> iter = rootNode.getInorderIterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + "  ");
		}
		System.out.println();

		System.out.println("\nPreorder traversal:");
		System.out.println("Expected: A  B  D  E  F  G  C  H");
		System.out.print("Actual:   ");
		iter = rootNode.getPreorderIterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + "  ");
		}
		System.out.println();

		System.out.println("\nPostorder traversal:");
		System.out.println("Expected: D  F  G  E  B  H  C  A ");
		System.out.print("Actual:   ");
		iter = rootNode.getPostorderIterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + "  ");
		}
		System.out.println();

		System.out.println("\nLevel order traversal:");
		System.out.println("Expected: A  B  C  D  E  H  F  G ");
		System.out.print("Actual:   ");
		iter = rootNode.getLevelOrderIterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + "  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		BinaryTree<String> rootNode = new BinaryTree<String>();
		createTree(rootNode);
		traverseTree(rootNode);
	}

}
