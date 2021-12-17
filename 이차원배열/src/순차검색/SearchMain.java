package �����˻�;

class Search
{
	int[] nums = new int[] {1,3,5,9,12,15,17,20,33,34};
	
	void display()
	{
		System.out.println();
		for(int n : nums) {
			System.out.printf("%4d", n);
		}
		System.out.println();
	}
	
	// Sequential(�����˻�), Linear(�����˻�)
	void LinearSearch()
	{
		int key=33;
		boolean find = false; //boolean ���� -> � ���¿� �����ߴ� ��찡 �ִ� or ����.
		int i;								  //false�� �� ã��
		
		i=0;  // �� find�� false ����
		while( !find && i<nums.length ) //�� ã�ҵ��� or �迭�� ���� �ٴٶ�����
		{
			if(nums[i] == key)
				find = true;
			else
				i++;
		}
		
		if(find)
		{
			System.out.printf("%d�� �濡 �ֽ��ϴ�.\n", i);
		}
		else
		{
			System.out.println("ã�� �� �����ϴ�.");
		}
	}		
	
	/*	
	 * {1,3,5,9,12,15,17,20,33,34}
	 * left=0
	 * right=9
	 * mid=(0+9)/2=4
	 * nums[mid]�� 12�̴�.
	 * key=33;
	 * 0~4�� ���� ������. left = mid + 1
	 * left=5
	 * right=9
	 * mid=(5+9)/2=7
	 * nums[7]=20
	 * left=8
	 * mid=(8+9)/2=8
	 * 
	 * 
	 *  nums[mid] < key		left = mid + 1
	 *  nums[mid] > key		right = mid - 1
	 *  nums[mid] == key	ã�����ϱ� Stop	
	 */
	
	void BinarySearch()
	{
		int key=34;
		int left=0;
		int right=nums.length;
		int mid=0;
		boolean find = false;
		
		while(!find && left<right)
		{
			mid=(left+right)/2;
			
			if(nums[mid]<key)
				left=mid+1;
			else if(nums[mid]>key)
				right=mid-1;
			else
				find=true;
		}
		
		if(find)
			System.out.printf("%d�� %d�� �濡 �ֽ��ϴ�.\n", key, mid);
		else
			System.out.println("ã�� �� �����ϴ�.");
	}
	
}

	

public class SearchMain {
	public static void main(String[] args) {
		Search s = new Search();
		s.display();
		s.LinearSearch();
	}
}
