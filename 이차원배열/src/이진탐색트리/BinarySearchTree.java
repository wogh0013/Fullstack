package ����Ž��Ʈ��;

public class BinarySearchTree {
   TreeNode root=null;// root �� ���������� ������ �־�� �Ѵ� 
   
   void insert(String data)
   {
      //���ο� ��带 ���� root ���� 
      //data�� ���ؼ� ������ ����� �������� �̵��ϰ�, nullã�������� 
      //data�� ���ؼ� ũ�� ����� ���������� �̵��ϰ�, nullã��������
      
      //���ο� ��尡 �� ��ġ ã�� 
      TreeNode pTrace=root;
      TreeNode pTrace2=null;
      
      while(pTrace!=null)
      {
         if(pTrace.data.equals(data))//�ߺ�����, ������ �̹� Ű���� �����ϸ� �Լ�����
            return; 
         
         pTrace2 = pTrace; //��ġ�̵�  //////////////////////////////////////////////////////
         
         if(pTrace.data.compareTo(data)>0)  //**********************
            pTrace = pTrace.left;
         else
            pTrace = pTrace.right;
      }
      
      //������ ������ pTrace �� ������ null �̰� ���� �θ� ��ü�� pTrace2 
      
      TreeNode newNode = new TreeNode(data);
      if(pTrace2==null) //ó���� root �ϳ� �߰��̴�.
         root = newNode;
      else
      {
         if( pTrace2.data.compareTo(data)>0 ) //**********************
            pTrace2.left = newNode;
         else 
            pTrace2.right = newNode;
      }
   }
   
   void makeTree()
   {
      String []words= {"rain", "rainbow", "opera", "question", "cloud", "windy", "snow", "snowman", "sunny",
              "cold", "hot", "desk", "flower", "survey", };
      
      for(String w : words)
         insert(w);
      
   }
   
   void inorder(TreeNode t)
   {
      if(t==null) return;
      
      inorder(t.left);
      System.out.print(t.data+" ");
      inorder(t.right);
   }
   
   void preorder(TreeNode t)
   {
      if(t==null) return;
      
      System.out.print(t.data+" ");
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
            System.out.printf("%d ���� ã��\n", cnt);
            return; 
         }
         
         if(pTrace.data.compareTo(data)>0)
            pTrace = pTrace.left; 
         else
            pTrace = pTrace.right;
      }
      
      System.out.println("��ã��");
   }
   
   //���� 
   void delete(String data)
   {
      //1.��ġ ã��  �����ϰ��� �θ��忡 ���� ������ �ʿ��ϴ�
      TreeNode pTrace = root; 
      TreeNode parent = null;   //�θ��� : ���� ����� ������ ��������� �θ�� ��������� �ڽ��� �����ؾ� �Ѵ�.
      boolean isLeftChild=true; //���� �ڽ��� �ִ��� �����ĸ� ��Ÿ���� ���� ����
      
      boolean found = false; //��������� �����ϴ����� ���θ� ��Ÿ��
      while(pTrace!=null)    //root���� ��������� ã�Ƴ�����. parent �ڿ��� ��������� �θ� ����Ű�鼭 �����Ѵ�.
      {
         if(pTrace.data.equals(data)) //��������� ������ found ������=true�� �ϰ� while�� ����
         {
            found=true;
            break;
         }
         
         parent = pTrace;  //���� �� ã������ ��� ã�ƾ� ��. ���� ��带 �θ���� �����ϰ� �ڽ� �߿� �ִ��� Ȯ�� 
         if(pTrace.data.compareTo(data)>0) //ã���� �ϴ� Ű���� ����� �����ͺ��� ������ left�� �̵��ؼ� �˻��� ���
            pTrace = pTrace.left;
         else //ã���� �ϴ� Ű���� ����� �����ͺ��� ũ�� right�� �̵��ؼ� �˻��� ���
         {
            pTrace = pTrace.right;
            isLeftChild=false; //���������� �̵�
         }
      }
      
      
      if(!found) return;  //��ã������ �Լ��� �������� 
      
      
      //1.�����ڽ��� ������  
      if(pTrace.left ==null) //�������ڽ��� �θ��ʿ� �ٿ���� �Ѵ�
      {
         if(pTrace==root) //��������� root�� ��
            root = pTrace.right; //�����ڽ��� �����Ƿ� �������ڽ��� root�� �ø���
         else if(isLeftChild)//�θ����� ���ʿ� �پ������� ������ null
            parent.left = pTrace.right; //������� �θ��� ���ʿ� �� �ڽ��� ����(null���� ����)
         else
            parent.right = pTrace.right; //������� �θ��� �����ʿ� �� �������ڽ� ����   
         return;
      }
      
      // 2.������ �ڽ��� ������ 
      if(pTrace.right==null)
      {
         if(pTrace==root)
            root = pTrace.left;
         else if(isLeftChild)//�θ����� ���ʿ� �پ������� ������ null
            parent.left = pTrace.left; 
         else
            parent.right = pTrace.left;
         return;
      }
      
            
      //3.�ڽ��� �Ѵ� ������ 
      //��ġ������ �ٽ��ؾ� �Ѵ�  �׳� �ƹ����� ��� �ٲ�ġ���� �����Ѵ�  
      //������ ����� ����� ������ ����Ʈ������ ���� ���� ����� ã�� �ٲ������Ѵ� (�̰� �����Ѵ�)
      //��������� ������ ����Ʈ�� ������ �����´�
      
   
      
      //��ü�� ����� ã�´� 
      TreeNode pSubParent = pTrace; //����Ʈ���� �θ�
      TreeNode pSub = pTrace.right; //��������� ������ ����Ʈ�� 
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









