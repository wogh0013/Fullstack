package ����Ž��Ʈ��;

public class BinaryMain {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.makeTree();
		bst.preorder(bst.root);
		System.out.println();
		
		bst.search("snowman");
		bst.search("windy");
		bst.search("salt");
		
		bst.delete("rainbow"); //���� �ڽ� �ִ� ��쿡
		bst.preorder(bst.root);
	}
}


/*
						rain
				cloud			rainbow
					cold	opera	windy
						




*/