//Kara McMullin
//COSC 2436
//Program set 3
//references: Stack Overflow (https://stackoverflow.com/questions/23028789/how-to-accept-strings-or-integers-in-the-same-user-input), BinarySearchTree and Node classes borrowed from previous project (Java programming class in previous semester)
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	System.out.println("Hi");





		Scanner scan = new Scanner(System.in);
		System.out.print("Enter values: ");
		String input = scan.nextLine();
		BinarySearchTree<?> tree = new BinarySearchTree<>(input);
		tree.add(10);
		tree.traverseInOrder(tree.root);




	}
}