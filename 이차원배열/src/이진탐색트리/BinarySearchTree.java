package 이진탐색트리;

public class BinarySearchTree {
	TreeNode root=null; //root를 시작점으로 가지고 있어야 한다.
	
	void insert(String data)
	{
		//새로운 노드를 만들어서 root에서
		//data를 비교해서 작으면 -> 노드의 왼쪽으로 이동(null을 찾을 때까지)
		//				크면 -> 노드의 오른쪽으로 이동(null을 찾을 때까지)
		
		//새로운 노드가 들어갈 위치 찾기
		TreeNode pTrace=root;
		TreeNode pTrace2=null;
		
		while(pTrace!=null)
		{
			if(pTrace.data.equals(data)) //중복배제, 기존에 이미 키값이 존재하면 함수종료
				return;
			
			pTrace2 = pTrace; //위치이동
			
			if(pTrace.data.compareTo(data)>0)
				pTrace = pTrace.left;
			else
				pTrace = pTrace.right;
		}
		//끝나고 나오면 pTrace는 언제나 null이고,
		//실제 부모 개체는 pTrace2
		
		TreeNode newNode = new TreeNode(data);
		if(pTrace2==null) //처음에 root 하나 추가이다.
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
				System.out.printf("%d번에 찾음\n", cnt);
				return;
			}
			
			if(pTrace.data.compareTo(data)>0)
				pTrace = pTrace.left;
			else
				pTrace = pTrace.right;
		}
		
		System.out.println("못 찾음");
	}
	
	//삭제
	void delete(String data) 
	{
		//1. 위치 찾기 : 삭제하고 나면 부모노드에 대한 정보가 필요하다.
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
			
			pTrace2 = pTrace; //노드값 저장
			if(pTrace.data.compareTo(data)>0)
				pTrace = pTrace.left;
			else
				pTrace = pTrace.right;
		}
		
		if(!found) return; //못 찾았으면 함수 종료
		
		//1. 자식이 하나도 없는 경우
		//2. 자식이 둘 중 하나만 있는 경우
		//3. 자식이 둘 다 있는 경우
		
		//1. 자식이 하나도 없는 경우
		if(pTrace.left==null && pTrace.right==null)
		{
			if(pTrace.left==pTrace)  //내가 부모노드의 왼쪽에 붙어있으면
				pTrace2.left = null; // └ 왼쪽을 null
			else
				pTrace2.right = null;
			
			return;
		}
		
		//2. 자식이 둘 중 하나만 있는 경우
		if(pTrace.left==null || pTrace.right==null)
		{
			//자식이 내 위치로 올라온다
			if(pTrace.left!=null)
				pTrace2.left = pTrace.left;
			else
				pTrace2.right = pTrace.right;
			
			return;
		}
		
		//3. 자식이 둘 다 있는 경우
		//위치 배정을 다시 해야 한다. (아무 데나 골라서 바꿔치기 후 삭제)
		//삭제될 대상노드의 오른쪽 서브트리에서 가장 작은 대상을 찾아 바꿔치기한다(이걸 선택)
		//삭제대상의 오른쪽 서브트리 참조를 가져온다.
		TreeNode pSub2 = pTrace; //삭제대상
		TreeNode pSub1 = pTrace.right; //삭제대상의 오른쪽 서브트리
		
		while(pSub1.left!=null)
		{
			pSub2 = pSub1;
			pSub1 = pSub1.left;
		}
		
		/*
		 * 			16		- pTrace 삭제대상이고 pSub2
		 * 		11		20
		 * 	     	 15    22
		 * 				 17 
		 */
		pTrace.data = pSub1.data; //삭제 대상으로 15를 16으로 바꿔치고 
		//pSsub2가 바꿔치기된 대상의 부모
		//pSub1이 대체 대상
		if(pSub1.right != null)
			pSub2.left = pSub1.right;
		else
			pSub2.left = null;
		
	}
}
