package 트리;

import java.util.LinkedList;
import java.util.Queue;

//pre(전위) in(중위) post(후위) 
public class BinaryTree {
	TreeNode root; //루트노드
	
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
	
	// inorder(root) -> inorder(root.left) -> inorder(root.left.left) -> inorder(null) D 출력
	// 										  inorder(root.left.right) -> inorder(null) D E 출력
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
	
	//큐를 사용해서 level order를 하자
	//root를 큐에 넣고, root를 빼서 left, right를 큐에 넣는데,
	// null이 아닐 때, 큐가 빌 때까지 반복
	void levelorder(TreeNode start)
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(start);
		
		while( !queue.isEmpty() )
		{
			TreeNode temp = queue.poll(); //get 대신에 제거
			System.out.print(temp.data + " ");
			if( temp.left != null )
				queue.add(temp.left);
			if( temp.right != null )
				queue.add(temp.right);
		}
		System.out.println();
	}
	
	
	/*
	 * 큐를 비우고
	 * 큐에 root 추가하기
	 * 추가될 위치 찾는 과정 : levelorder
	 * {
	 * 	1. queue에서 하나 가져온다.
	 * 	2. left가 null이면 여기에 추가한다. 아니면 큐에 left를 추가
	 * 	3. right가 null이면 여기에 추가한다. 아니면 큐에 right를 추가
	 * 	4. 노드가 추가될 때까지 1~3을 반복한다.
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
			queue.add(root); //처음 root부터 계속 찾아서 비어있는 노드를 찾을 때까지 같은 동작을 반복한다.
			while(true)   //추가되면 멈추고 나온다.
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
