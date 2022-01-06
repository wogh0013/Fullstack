package Ʈ��;

import java.util.LinkedList;
import java.util.Queue;

//pre(����) in(����) post(����) 
public class BinaryTree {
	TreeNode root; //��Ʈ���
	
	void makeTree()
	{
		root = new TreeNode();
		root.data = "A";
		
		root.left = new TreeNode();
		root.left.data = "B";
		
		root.right = new TreeNode();
		root.right.data = "C";
		
		TreeNode child = root.left;
		child.left = new TreeNode();
		child.left.data = "D";
		child.right = new TreeNode();
		child.right.data = "E";
		
		child = root.right;
		child.left = new TreeNode();
		child.left.data = "F";
		child.right = new TreeNode();
		child.right.data = "G";
	}
	
	// inorder(root) -> inorder(root.left) -> inorder(root.left.left) -> inorder(null) D ���
	// 										  inorder(root.left.right) -> inorder(null) D E ���
	void inorder(TreeNode start) // LDR
	{
		if(start == null) return;
		inorder(start.left);
		System.out.print(start.data + " ");
		inorder(start.right);
	}
	
	void preorder(TreeNode start) // DLR
	{
		if(start == null) return;
		System.out.print(start.data + " ");
		preorder(start.left);
		preorder(start.right);
	}
	
	void postorder(TreeNode start) // LRD
	{
		if(start == null) return;
		postorder(start.left);
		postorder(start.right);
		System.out.print(start.data + " ");
	}
	
	//ť�� ����ؼ� level order�� ����
	//root�� ť�� �ְ�, root�� ���� left, right�� ť�� �ִµ�,
	// null�� �ƴ� ��, ť�� �� ������ �ݺ�
	void levelorder(TreeNode start)
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(start);
		
		while( !queue.isEmpty() )
		{
			TreeNode temp = queue.poll(); //get ��ſ� ����
			System.out.print(temp.data + " ");
			if( temp.left != null )
				queue.add(temp.left);
			if( temp.right != null )
				queue.add(temp.right);
		}
		System.out.println();
	}
	
	
	/*
	 * ť�� ����
	 * ť�� root �߰��ϱ�
	 * �߰��� ��ġ ã�� ���� : levelorder
	 * {
	 * 	1. queue���� �ϳ� �����´�.
	 * 	2. left�� null�̸� ���⿡ �߰��Ѵ�. �ƴϸ� ť�� left�� �߰�
	 * 	3. right�� null�̸� ���⿡ �߰��Ѵ�. �ƴϸ� ť�� right�� �߰�
	 * 	4. ��尡 �߰��� ������ 1~3�� �ݺ��Ѵ�.
	 */
	void makeTree(String data)
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		root = new TreeNode();
		root.data = data.charAt(0)+"";
		
		int i=1;
		while(i<data.length())
		{
			queue.clear();
			queue.add(root); //ó�� root���� ��� ã�Ƽ� ����ִ� ��带 ã�� ������ ���� ������ �ݺ��Ѵ�.
			while(true)   //�߰��Ǹ� ���߰� ���´�.
			{
				TreeNode temp = queue.poll(); 
				
				if( temp.left == null )
				{
					temp.left = new TreeNode();
					temp.left.data = data.charAt(i)+"";
					break;
				}
				else if( temp.right == null )
				{
					temp.right = new TreeNode();
					temp.right.data = data.charAt(i)+"";
					break;
				}
				else
				{
					queue.add(temp.left);
					queue.add(temp.right);
				}
			}
		}	
		System.out.println();
	}
}
