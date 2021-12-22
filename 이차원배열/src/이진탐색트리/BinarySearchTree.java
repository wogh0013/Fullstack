package ����Ž��Ʈ��;

public class BinarySearchTree {
	TreeNode root=null; //root�� ���������� ������ �־�� �Ѵ�.
	
	void insert(String data)
	{
		//���ο� ��带 ���� root����
		//data�� ���ؼ� ������ -> ����� �������� �̵�(null�� ã�� ������)
		//				ũ�� -> ����� ���������� �̵�(null�� ã�� ������)
		
		//���ο� ��尡 �� ��ġ ã��
		TreeNode pTrace=root;
		TreeNode pTrace2=null;
		
		while(pTrace!=null)
		{
			if(pTrace.data.equals(data)) //�ߺ�����, ������ �̹� Ű���� �����ϸ� �Լ�����
				return;
			
			pTrace2 = pTrace; //��ġ�̵�
			
			if(pTrace.data.compareTo(data)>0)
				pTrace = pTrace.left;
			else
				pTrace = pTrace.right;
		}
		//������ ������ pTrace�� ������ null�̰�,
		//���� �θ� ��ü�� pTrace2
		
		TreeNode newNode = new TreeNode(data);
		if(pTrace2==null) //ó���� root �ϳ� �߰��̴�.
			root = newNode;
		else
		{
			if(pTrace2.data.compareTo(data)>0)
				pTrace2.left = newNode;
			else
				pTrace2.right = newNode;
		}
	}
	
	void makeTree()
	{
		String[] words = {"rain", "rainbow", "cloud", "windy", "snow", "snowman", "sunny",
							"cold", "hot", "desk", "flower", "survey", "opera", "question"};
	
		
		for(String w : words)
			insert(w);
	}
	
	void inorder(TreeNode t)
	{
		if(t==null) return;
		
		inorder(t.left);
		System.out.print(t.data + " ");
		inorder(t.right);
	}
	
	void preorder(TreeNode t)
	{
		if(t==null) return;
		
		System.out.print(t.data + " ");
		preorder(t.left);
		preorder(t.right);
	}
	
	void search(String data)
	{
		TreeNode pTrace = root;
		int cnt=0;
		
		while(pTrace!=null)
		{
			cnt++;
			if(pTrace.data.equals(data))
			{
				System.out.printf("%d���� ã��\n", cnt);
				return;
			}
			
			if(pTrace.data.compareTo(data)>0)
				pTrace = pTrace.left;
			else
				pTrace = pTrace.right;
		}
		
		System.out.println("�� ã��");
	}
	
	//����
	void delete(String data) 
	{
		//1. ��ġ ã�� : �����ϰ� ���� �θ��忡 ���� ������ �ʿ��ϴ�.
		TreeNode pTrace = root;
		TreeNode pTrace2 = null;
		boolean found = false;
		
		while(pTrace!=null)
		{
			if(pTrace.data.equals(data))
			{
				found = true;
				break;
			}
			
			pTrace2 = pTrace; //��尪 ����
			if(pTrace.data.compareTo(data)>0)
				pTrace = pTrace.left;
			else
				pTrace = pTrace.right;
		}
		
		if(!found) return; //�� ã������ �Լ� ����
		
		//1. �ڽ��� �ϳ��� ���� ���
		//2. �ڽ��� �� �� �ϳ��� �ִ� ���
		//3. �ڽ��� �� �� �ִ� ���
		
		//1. �ڽ��� �ϳ��� ���� ���
		if(pTrace.left==null && pTrace.right==null)
		{
			if(pTrace.left==pTrace)  //���� �θ����� ���ʿ� �پ�������
				pTrace2.left = null; // �� ������ null
			else
				pTrace2.right = null;
			
			return;
		}
		
		//2. �ڽ��� �� �� �ϳ��� �ִ� ���
		if(pTrace.left==null || pTrace.right==null)
		{
			//�ڽ��� �� ��ġ�� �ö�´�
			if(pTrace.left!=null)
				pTrace2.left = pTrace.left;
			else
				pTrace2.right = pTrace.right;
			
			return;
		}
		
		//3. �ڽ��� �� �� �ִ� ���
		//��ġ ������ �ٽ� �ؾ� �Ѵ�. (�ƹ� ���� ��� �ٲ�ġ�� �� ����)
		//������ ������� ������ ����Ʈ������ ���� ���� ����� ã�� �ٲ�ġ���Ѵ�(�̰� ����)
		//��������� ������ ����Ʈ�� ������ �����´�.
		TreeNode pSub2 = pTrace; //�������
		TreeNode pSub1 = pTrace.right; //��������� ������ ����Ʈ��
		
		while(pSub1.left!=null)
		{
			pSub2 = pSub1;
			pSub1 = pSub1.left;
		}
		
		/*
		 * 			16		- pTrace ��������̰� pSub2
		 * 		11		20
		 * 	     	 15    22
		 * 				 17 
		 */
		pTrace.data = pSub1.data; //���� ������� 15�� 16���� �ٲ�ġ�� 
		//pSsub2�� �ٲ�ġ��� ����� �θ�
		//pSub1�� ��ü ���
		if(pSub1.right != null)
			pSub2.left = pSub1.right;
		else
			pSub2.left = null;
		
	}
}
