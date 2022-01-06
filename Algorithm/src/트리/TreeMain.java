package Æ®¸®;

public class TreeMain {
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.makeTree();
		
		System.out.print("inorder : "); // ±íÀÌ¿ì¼±Å½»ö(Depth First Search)
		tree.inorder(tree.root);
		System.out.println();
		
		System.out.print("preorder : "); // ±íÀÌ¿ì¼±Å½»ö(Depth First Search)
		tree.preorder(tree.root);
		System.out.println();
		
		System.out.print("postorder : "); // ±íÀÌ¿ì¼±Å½»ö(Depth First Search)
		tree.postorder(tree.root);
		System.out.println();
		
		System.out.print("levelorder : "); // ³Êºñ¿ì¼±Å½»ö(Breadth First Search)
		tree.levelorder(tree.root);
		System.out.println();
	}
}
