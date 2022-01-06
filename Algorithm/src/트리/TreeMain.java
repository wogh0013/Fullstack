package Ʈ��;

public class TreeMain {
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.makeTree();
		
		System.out.print("inorder : "); // ���̿켱Ž��(Depth First Search)
		tree.inorder(tree.root);
		System.out.println();
		
		System.out.print("preorder : "); // ���̿켱Ž��(Depth First Search)
		tree.preorder(tree.root);
		System.out.println();
		
		System.out.print("postorder : "); // ���̿켱Ž��(Depth First Search)
		tree.postorder(tree.root);
		System.out.println();
		
		System.out.print("levelorder : "); // �ʺ�켱Ž��(Breadth First Search)
		tree.levelorder(tree.root);
		System.out.println();
	}
}
