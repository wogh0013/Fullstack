package �ؽ�;

public class Hash {
	int BUCKET_SIZE=10;
	Node[] bucket = new Node[BUCKET_SIZE];
	
	//������
	public Hash()
	{
		for(int i=0; i<BUCKET_SIZE; i++)
		{
			bucket[i] = new Node();
		}
	}
	
	int getHash(String data)
	{
		int i, sum=0;
		for(i=0; i<data.length(); i++)
			sum += data.charAt(i); //sum = sum + data.charAt(i);
		return sum%BUCKET_SIZE;
	}
	
	//�� ��ġ ã��
	void insertData(String data)
	{
		int hash = getHash(data);
		Node newNode = new Node();
		newNode.data = data;
		
		newNode.next = bucket[hash].next;
		bucket[hash].next = newNode;
	}
	
	void createHashTable()
	{
		String[] words = new String[] {"�б�", "������", "����", "��������", "�����", "�ʰ���",
										"ȣ�θ���", "ü������", "�޷γ�", "���ڹ�", "������", "�ƽó���",
										"�Ƹ���", "����", "�ҽ���", "����������", "���Դ�", "������"};
		for(String w : words)
			insertData(w);
	}
	
	void display()
	{
		for(int i=0; i<BUCKET_SIZE; i++)
		{
			Node trace = bucket[i].next;
			while(trace!=null)
			{
				System.out.print(trace.data + " ");
				trace = trace.next;
			}
			System.out.println();
		}
	}
	
	void search(String key)
	{
		int hash = getHash(key);
		Node trace = bucket[hash].next;
		boolean find = false;
		
		while(trace!=null)
		{
			if(trace.data.equals(key))
			{
				find = true;
				break;
			}
			else
				trace = trace.next;
		}
		
		if(find)
			System.out.println("found");
		else
			System.out.println("not found");
		System.out.println();
	}
}
