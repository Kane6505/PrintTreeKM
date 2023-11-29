//Kara McMullin
//COSC 2436
//Program set 3
//references: BinarySearchTree and Node classes borrowed from previous project (Java programming class in previous semester)
public class Node <T extends Comparable<T>> implements Comparable<Node<T>> {

	//int data;
	T data;

	Node<T> left;
	Node<T> right;

	public Node(T data) {

		this.data = data;
		this.left = null;
		this.right = null;
	}

	@Override
	public int compareTo(Node<T> o) {
		return this.data.compareTo(o.data);
	}
}
