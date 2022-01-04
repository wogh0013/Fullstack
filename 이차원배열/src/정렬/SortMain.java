package ����;

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
	
//	1. ����Ʈ ���� : �ִ�, �ּڰ� �˰����� ����
//
//	�������� : ù ��° �濡 ���� ���� ���� ��ġ��Ű��
//	         �� ��° �濡 �� ���� ���� ���� ��ġ��Ű��.
//	         �� ��° �濡 �� ���� ���� ���� ��ġ��Ű��.
//			 1���� : a[0]	a[1]~a[9]
//			 2���� : a[1]	a[2]~a[9]
//			 3���� : a[2]	a[3]~a[9] .....
	void selectSort1()
	{
		System.out.println("���� �� ...................................");
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
			System.out.printf("%3dȸ : ", (i+1));
			display(); //-> select���� ������ ��µ�.
		}
		System.out.println("���� �Ϸ�...................................");
	}
	
	void selectSort2()
	{
		System.out.println("���� �� ...................................");
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
			
			System.out.printf("%3dȸ : ", (i+1));
			display(); //-> select���� ������ ��µ�.
		}
		System.out.println("���� �Ϸ�...................................");
	}
	
	/*
	  2. ���� ����
	  	  �������� : �ڱ� ���ڸ��� ���ؼ� �� ū ���ڸ� �ڷ� ������.
	  	  0��° - 0~9
	  	  1��° - 0~8
	  	  2��° - 0~7
	  	  3��° - 0~6 ......	
	 */
	
	void bubbleSort1()
	{
		System.out.println("���� �� ...................................");
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
			System.out.printf("%3dȸ : ", (i+1));
			display();
		}
		System.out.println("���� �Ϸ�...................................");
	}
	
	void bubbleSort2() // ������ ��������
	{
		boolean flag = false;
		System.out.println("���� �� ...................................");
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
			
			System.out.printf("%3dȸ : ", (i+1));
			display();
		}
		System.out.println("���� �Ϸ�...................................");
	}
	
	/*
	  ���� ���� : �����Ͱ� �ڱ� ��ġ�� ã�Ƽ� �����ֱ�
	  - �� ���� ī�带 �����ϴ� ����� ����
	  - ���ο� ī�带 ������ ���ĵ� ī�� ���̷� �´� �ڸ��� ã�� �����ֱ⸦ �Ѵ�.
	  - �ڷ�迭�� ��� ��Ҹ� �տ������� ���ʴ�� �̹� ���ĵ� �迭�κа� ���Ͽ� ��ġ�� ã�� �����ִ´�.
	  
	 */
	void insertionSort()
	{
		int i, j;
		
		//ó���� 0�� �̹� ���ĵ� ��
		//0���濡�� 1���� �����Ͱ� �� ��ġ ã��, ������ ����� �۾�
		for(i=1; i<nums.length; i++)
		{
			int temp = nums[i]; //��ġ ã�� �������� temp�� ����
			//i��° ��ġ���� 0�� ������ ������
			j=i;
			while(j>0 && temp<nums[j-1])
			{
				nums[j] = nums[j-1]; //�ڷ� �����
				j--;
			}
			
			nums[j] = temp; //�� ��ġ�� ����
			display();
		}
	}
	
	/*
	  �� ���� : 
	  1. �������� ��´�.
	      �� ���������� ������ ��������, ũ�� ����������
	           a         40  57  15  1  12   75   5  86  89  11

������: a[0] = 40 (0��°����)
key = 0
L=1   ������ ��(�����ʻ���)�̰ų� �ƴϸ�  40 ���� ū���� ���������� �ϳ��� �����ϸ鼭 �̵��Ѵ�    1,  57
R=9   ������ ��(��������)�̰ų� �ƴϸ� 40���� �������� ���������� �ϳ��� �����ϸ鼭 �̵��Ѵ� 
    
L < R   L��ġ�� ���� R��ġ�� ���� �ٲ۴�

L > R   �ΰ��� �׷��� �������ϰ� key��ġ���� R��ġ�� ���� �ٲ��� �Ѵ�

 40  11  15  1  12   75   5  86  89  57
                     L    R

40  11  15  1  12   5    75  86  89  57
                      L    R

40  11  15  1  12   5    75  86  89  57   �ΰ��� �׷����� �ɰ�����. 
                    R    L
ù��° �׷쿡�� 40�� �� ũ�ϱ� key ��ġ�� R��ġ�� �ٲ�ġ���Ѵ� 

���ȣ�� - �Լ��� �ڱ� �ڽ��� ȣ���Ѵ� 
5  11  15  1  12   40          75  86  89  57   �ΰ��� �׷����� �ɰ�����. 
                    R          L

qsort( nums, start, R-1);
qsort(nums, L+1, end);

	 */
	void quicksort(int[] arr, int start, int end)
	{
		//�� ������ �ϳ��� �Ǹ�
		if(start >= end)
			return;
		
		int key = start; //���� ���� �ڸ�
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
				//���� �ٲ�ġ��
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}
			else
			{
				//right, key�� �ٲ�ġ��
				int temp = nums[right];
				nums[right] = nums[key];
				nums[key] = temp;
			}
		}
		display(nums);
		
		//���ȣ�� : ������ ����� ���� �׷����� ������ ��� �׷��� �����
		//			���� 1�� �� ������ ���� ������ �ݺ��Ѵ�.
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
