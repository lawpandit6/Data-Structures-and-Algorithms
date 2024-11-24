//==>Tree data structure is a hierarical data structure in which 
//  one parents can have multiple child
//==>The difference between LinkedList and Tree is , tree is hierarical ds while 
//   LinkedList is a sequential ds means one node linked to another node while 
//   this is not in Tree ,every nodes is independent in tree
//==>1st Node is called Root node.

package in.law.tree;

import java.util.ArrayList;

public class Tree {
	Node root = null;

	static class Node {
		Object data;
		Node left;
		Node right;

		public Node(Object data) {
			this.data = data;
			// TODO Auto-generated constructor stub
		}
	}

	public static void main(String[] args) {
		Tree t = new Tree();
		t.root = new Node(1);
		t.root.left = new Node(2);
		t.root.right = new Node(3);
		t.root.left.left = new Node(4);
		t.root.left.right = new Node(5);
		t.root.left.right.right = new Node(8);
		t.root.left.right.right.left = new Node(11);
		t.root.left.right.right.right = new Node(98);
		t.root.left.right.left = new Node(7);
		t.root.left.right.left.left = new Node(9);
		t.root.left.left.left = new Node(15);
		t.root.right.left = new Node(10);
		t.root.right.right = new Node(6);
		System.out.println(t.root.data);

		ArrayList<Integer> al = new ArrayList<>();
		int level = 1;// start with 1 level of a tree
		t.printLeftView(t.root, level, al);
		System.out.println(al);
	}
	
	// Print left view and right view of a tree
	
	public void printLeftView(Node root, int level, ArrayList<Integer> al) {

		if (root == null)
			return;
		if (al.size() < level)
			al.add((Integer) root.data);

		printLeftView(root.left, level + 1, al);
		printLeftView(root.right, level + 1, al);

	}

}
