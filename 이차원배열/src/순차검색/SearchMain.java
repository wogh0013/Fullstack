package 순차검색;

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
	
	// Sequential(순차검색), Linear(선형검색)
	void LinearSearch()
	{
		int key=33;
		boolean find = false; //boolean 변수 -> 어떤 상태에 도달했던 경우가 있다 or 없다.
		int i;								  //false면 못 찾음
		
		i=0;  // ┌ find가 false 동안
		while( !find && i<nums.length ) //못 찾았든지 or 배열의 끝에 다다랐든지
		{
			if(nums[i] == key)
				find = true;
			else
				i++;
		}
		
		if(find)
		{
			System.out.printf("%d번 방에 있습니다.\n", i);
		}
		else
		{
			System.out.println("찾을 수 없습니다.");
		}
	}		
	
	/*	
	 * {1,3,5,9,12,15,17,20,33,34}
	 * left=0
	 * right=9
	 * mid=(0+9)/2=4
	 * nums[mid]는 12이다.
	 * key=33;
	 * 0~4번 방은 버린다. left = mid + 1
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
	 *  nums[mid] == key	찾았으니까 Stop	
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
			System.out.printf("%d는 %d번 방에 있습니다.\n", key, mid);
		else
			System.out.println("찾을 수 없습니다.");
	}
	
}

	

public class SearchMain {
	public static void main(String[] args) {
		Search s = new Search();
		s.display();
		s.LinearSearch();
	}
}
