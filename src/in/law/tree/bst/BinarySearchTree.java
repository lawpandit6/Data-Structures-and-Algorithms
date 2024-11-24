package in.law.tree.bst;

import java.util.ArrayList;

class Node {
	Object data;
	Node left;
	Node right;

	Node(Object data) {
		this.data = data;
	}
}

public class BinarySearchTree {
	static Node root = null;

	public void add(Object data) {
		Node n = new Node(data);
		if (root == null)
			root = n;
		else {
			Node temp = root;
			while (true) {
				int rootValue = (int) temp.data;
				int givenNodeValue = (int) data;
				if (givenNodeValue < rootValue) {
					if (temp.left == null) {
						temp.left = n;
						return;
					} else {
						temp = temp.left;
					}
				} else {
					if (temp.right == null) {
						temp.right = n;
						return;
					} else {
						temp = temp.right;
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		BinarySearchTree t = new BinarySearchTree();
		t.add(4);
		t.add(2);
		t.add(1);
		t.add(6);
		t.add(3);
		t.add(5);
		t.add(7);
		System.out.println("inOder===========");
		t.inOrder(root);
		System.out.println();
		System.out.println("leafNode===========");
		t.leafNode(root);
		System.out.println();
		System.out.println("min element in bst=======");
		t.minElementInBST(root);
		System.out.println("max element in bst=======");
		t.maxElementInBST(root);
		System.out.println("mirror BST=======");
		t.mirrorBST(root);
		System.out.println("inOder===========");
		t.inOrder(root);
		System.out.println();
		System.out.println("left view=========");
		ArrayList<Integer> al=new ArrayList<>();
		int level=1;//start with 1 level of a tree
		t.printLeftView(root, level, al);
		System.out.println(al);
		
	}

	// To print inOrder traversal
	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	// To print tree leaf Node
	public void leafNode(Node root) {
		if (root != null) {
			if (root.left == null && root.right == null) {
				System.out.print(root.data + " ");
			} else {
				leafNode(root.left);
				leafNode(root.right);
			}
		}
	}

	// To print minimum element in bst
	public void minElementInBST(Node root) {
		while (root.left != null) {
			root = root.left;
		}
		System.out.println(root.data);
	}

	// To print maximum element in bst
	public void maxElementInBST(Node root) {
		while (root.right != null) {
			root = root.right;
		}
		System.out.println(root.data);
	}

	// To print mirror image of Tree
	public void mirrorBST(Node root) {
		if (root != null) {
			mirrorBST(root.left);
			mirrorBST(root.right);
			swapRoot(root);
		}
	}

	public static void swapRoot(Node root) {
		if (root == null)
			return;
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
	}

	// To print a left view of a tree

	public void printLeftView(Node root, int level, ArrayList<Integer> al) {

		if (root == null)
			return;
		if (al.size() < level)
			al.add((Integer) root.data);

		printLeftView(root.left, level + 1, al);
		printLeftView(root.right, level + 1, al);

	}

}
