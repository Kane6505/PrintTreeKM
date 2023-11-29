//Kara McMullin
//COSC 2436
//Program set 3
//references: basic BinarySearchTree and Node classes borrowed from previous project (Java programming class in previous semester)

import java.util.Arrays;

public class BinarySearchTree <T extends Comparable<T>> {

	Node<T> root;

	public boolean isInteger(String s)
	{
		return s.matches("-?\\d+");

	}
	public BinarySearchTree(String input) {
		System.out.println("Hi again");
		String[] inputArray = input.split(",\\s+");
		System.out.println(Arrays.toString(inputArray));


	}


	public Node<T> addRecursive(Node<T> cur, T data)
	{
		if(cur == null)
		{
			return new Node<>(data);
		}
		if(data.compareTo(cur.data) < 0)
		{
			cur.left = addRecursive(cur.left, data);
		}
		else if(data.compareTo(cur.data) > 0)
		{
			cur.right = addRecursive(cur.right, data);
		}
		else {
			return cur;
		}
		return cur;
	}

	public <T extends Comparable<T>> void add(T data)
	{
		root = addRecursive(root,data);
	}

	public void traverseInOrder(Node<?> node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.data);
			traverseInOrder(node.right);
		}
	}
}
