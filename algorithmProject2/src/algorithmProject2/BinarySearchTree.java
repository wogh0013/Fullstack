package algorithmProject2;

public class BinarySearchTree {
	TreeNode root=null;
	
	void insert(int key, String data)
	{ 
		TreeNode pTrace=root;
		TreeNode pTrace2=null;
		
		while(pTrace!=null)
		{
			if(pTrace.data.equals(data))
				return; 
			
			pTrace2 = pTrace; 
			
			if(pTrace.data.compareTo(data)>0)
				pTrace = pTrace.left;
			else
				pTrace = pTrace.right;
		}
		
		TreeNode newNode = new TreeNode(key, data);
		if(pTrace2==null) 
			root = newNode;
		else
		{
			if( pTrace2.data.compareTo(data)>0 )
				pTrace2.left = newNode;
			else 
				pTrace2.right = newNode;
		}
	}
	
	void inorder(TreeNode t)
	{
		if(t==null)	return;

		inorder(t.left);
		System.out.println(t.key + " " + t.data );
		inorder(t.right);
	}
	
	void search(int key)
	{
		TreeNode pTrace = root;
		int cnt=0;
		while(pTrace!=null)
		{
			cnt++;
			if(pTrace.key == key)
			{
				System.out.printf("%s\n", pTrace.data);
				return; 
			}
			
			if(pTrace.key > key)
				pTrace = pTrace.left; 
			else
				pTrace = pTrace.right;
		}
		
		System.out.println("검색하신 상품이 없습니다.");
	}
	
	void delete(int key)
	{
		TreeNode pTrace = root; 
		TreeNode parent = null;
		boolean isLeftChild=true;
		
		boolean found = false;
		while(pTrace!=null)
		{
			if(pTrace.key == key)
			{
				found=true;
				break;
			}
			
			parent = pTrace;
			if(pTrace.key>key)
				pTrace = pTrace.left;
			else
			{
				pTrace = pTrace.right;
				isLeftChild=false;
			}
		}

		if(!found) return;
		
		if(pTrace.left ==null)
		{
			if(pTrace==root)
				root = pTrace.right;
			else if(isLeftChild)
				parent.left = pTrace.right; 
			else
				parent.right = pTrace.right;	
			return;
		}

		if(pTrace.right==null)
		{
			if(pTrace==root)
				root = pTrace.left;
			else if(isLeftChild)
				parent.left = pTrace.left; 
			else
				parent.right = pTrace.left;
			return;
		}
		
		TreeNode pSubParent = pTrace;
		TreeNode pSub = pTrace.right; 
 		while(pSub.left!=null)
 		{
 			pSubParent = pSub;
 			pSub = pSub.left;
 		}
 		
 		pTrace.data = pSub.data;
 		if (pSubParent.left == pSub)
 			pSubParent.left=pSub.right;
 		else
 			pSubParent.right=pSub.right;
	}
}










