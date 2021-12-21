package 정렬;

class Sort
{
	int[] nums;
	
	void init()
	{
		nums = new int[] {3,1,9,8,6,7,5,4,2,10};
	}
	
	void display()
	{
		for(int n : nums)
		{
			System.out.printf("%3d", n);		
		}
		System.out.println();
	}
	
//	1. 셀렉트 정렬 : 최댓값, 최솟값 알고리즘을 응용
//
//	오름차순 : 첫 번째 방에 가장 작은 값을 위치시키자
//	         두 번째 방에 그 다음 작은 값을 위치시키자.
//	         세 번째 방에 그 다음 작은 값을 위치시키자.
//			 1바퀴 : a[0]	a[1]~a[9]
//			 2바퀴 : a[1]	a[2]~a[9]
//			 3바퀴 : a[2]	a[3]~a[9] .....
	void selectSort1()
	{
		System.out.println("정렬 중 ...................................");
		for(int i=0; i<nums.length-1; i++)
		{
			for(int j=i+1; j<nums.length; j++)
			{
				if(nums[i]>nums[j])
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
			System.out.printf("%3d회 : ", (i+1));
			display(); //-> select정렬 과정이 출력됨.
		}
		System.out.println("정렬 완료...................................");
	}
	
	void selectSort2()
	{
		System.out.println("정렬 중 ...................................");
		int min, pos;
		
		for(int i=0; i<nums.length-1; i++)
		{
			min = nums[i];
			pos = i;
			for(int j=i+1; j<nums.length; j++)
			{
				if(min>nums[j])
				{
					min = nums[j];
					pos = j;
				}
			}
			
			int temp = nums[i];
			nums[i] = nums[pos];
			nums[pos] = temp;
			
			System.out.printf("%3d회 : ", (i+1));
			display(); //-> select정렬 과정이 출력됨.
		}
		System.out.println("정렬 완료...................................");
	}
	
	/*
	  2. 버블 정렬
	  	  오름차순 : 자기 옆자리랑 비교해서 더 큰 숫자를 뒤로 보낸다.
	  	  0번째 - 0~9
	  	  1번째 - 0~8
	  	  2번째 - 0~7
	  	  3번째 - 0~6 ......	
	 */
	
	void bubbleSort1()
	{
		System.out.println("정렬 중 ...................................");
		for(int i=0; i<nums.length-1; i++)
		{
			for(int j=0; j<nums.length-1-i; j++)
			{
				if( nums[j] > nums[j+1])
				{
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
			System.out.printf("%3d회 : ", (i+1));
			display();
		}
		System.out.println("정렬 완료...................................");
	}
	
	void bubbleSort2() // 개선된 버블정렬
	{
		boolean flag = false;
		System.out.println("정렬 중 ...................................");
		for(int i=0; i<nums.length-1; i++)
		{
			flag = false;
			for(int j=0; j<nums.length-1-i; j++)
			{
				if( nums[j] > nums[j+1])
				{
					flag = true;
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
			if(flag == false)
				break;
			
			System.out.printf("%3d회 : ", (i+1));
			display();
		}
		System.out.println("정렬 완료...................................");
	}
	
	/*
	  삽입 정렬 : 데이터가 자기 위치를 찾아서 끼워넣기
	  - 손 안의 카드를 정렬하는 방법과 유사
	  - 새로운 카드를 기존의 정렬된 카드 사이로 맞는 자리를 찾아 끼워넣기를 한다.
	  - 자료배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열부분과 비교하여 위치를 찾아 끼워넣는다.
	  
	 */
	void insertionSort()
	{
		int i, j;
		
		//처음에 0은 이미 정렬된 거
		//0번방에서 1번방 데이터가 들어갈 위치 찾고, 나머지 땡기기 작업
		for(i=1; i<nums.length; i++)
		{
			int temp = nums[i]; //위치 찾을 변수값을 temp에 저장
			//i번째 위치부터 0에 도달할 떄까지
			j=i;
			while(j>0 && temp<nums[j-1])
			{
				nums[j] = nums[j-1]; //뒤로 땡기고
				j--;
			}
			
			nums[j] = temp; //들어갈 위치에 삽입
			display();
		}
	}
	
	/*
	  퀵 정렬 : 
	  1. 기준점을 잡는다.
	      └ 기준점보다 작으면 왼쪽으로, 크면 오른쪽으로
	           a         40  57  15  1  12   75   5  86  89  11

기준점: a[0] = 40 (0번째기준)
key = 0
L=1   범위의 끝(오른쪽상한)이거나 아니면  40 보다 큰값을 만날때까지 하나씩 증가하면서 이동한다    1,  57
R=9   범위의 끝(왼쪽하한)이거나 아니면 40보다 작은값을 만날때까지 하나식 감소하면서 이동한다 
    
L < R   L위치의 값과 R위치의 값을 바꾼다

L > R   두개의 그룹이 나눠지니가 key위치값와 R위치의 값이 바뀌어야 한다

 40  11  15  1  12   75   5  86  89  57
                     L    R

40  11  15  1  12   5    75  86  89  57
                      L    R

40  11  15  1  12   5    75  86  89  57   두개의 그룹으로 쪼개진다. 
                    R    L
첫번째 그룹에서 40이 젤 크니까 key 위치와 R위치를 바꿔치기한다 

재귀호출 - 함수가 자기 자신을 호출한다 
5  11  15  1  12   40          75  86  89  57   두개의 그룹으로 쪼개진다. 
                    R          L

qsort( nums, start, R-1);
qsort(nums, L+1, end);

	 */
	void quicksort(int[] arr, int start, int end)
	{
		//각 개수가 하나씩 되면
		if(start >= end)
			return;
		
		int key = start; //왼쪽 하한 자리
		int left = start+1;
		int right = end;
		
		while( left <= right )
		{
			while( left<=end && nums[left]<=nums[key] )
				left++;
			while( right>start && nums[right]>=nums[key] )
				right--;
			
			if(left<=right)
			{
				//서로 바꿔치기
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}
			else
			{
				//right, key를 바꿔치기
				int temp = nums[right];
				nums[right] = nums[key];
				nums[key] = temp;
			}
		}
		display(nums);
		
		//재귀호출 : 범위를 나누어서 각자 그룹으로 보내면 계속 그룹을 나누어서
		//			각자 1이 될 때까지 동일 동작을 반복한다.
		quicksort(nums, start, right-1);
		quicksort(nums, right+1, end);
	}
	
	void display(int[] nums)
	{
		for(int n : nums)
		{
			System.out.printf("%3d", n);
		}
		System.out.println();
	}
}

public class SortMain {
	public static void main(String[] args) {
		Sort sort = new Sort();
		
		sort.init();
		sort.display();
		
		sort.selectSort1();
		sort.display();
		
		sort.init();
		sort.selectSort2();
		sort.display();
		
		sort.init();
		sort.bubbleSort1();
		sort.display();
		
		sort.bubbleSort2();
		sort.display();
		
		int[] nums = new int[] {40,11,15,1,12,75,5,86,89,57};
		sort.quicksort(nums, 0, nums.length-1);
		
		sort.insertionSort();
		sort.display();
	}
}
