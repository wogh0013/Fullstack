package ������;

import java.util.Scanner;

public class ������ {
	static int[] nums = new int[] {13, 1, 15, 17, 6, 9, 8, 7, 4, 11};
	
	static void display(int[] nums, int start, int end)
	{
		for(int i=start; i<=end; i++)
			System.out.printf("%3d", nums[i]);
		System.out.println();
	}
	
	//�������� ���ȣ���� ����ϴ� �˰���
	static void quicksort(int[] nums, int start, int end)
	{
		//start~end ������ ������ �ؾ� �� ������ �ȴ�.
		if(start>=end) return; //�迭�� ���صǴٰ� ��Ұ� �ϳ��� �Ǹ� �׸��ϰ� �����Ѵ�.
		
		//1.������ : �ۼ��� ������� ���� �� �ִ�.
		int key, left, right; //key(�������� ��ġ), left(������ ���� ����), right(������ ������ ����)
		
		key = start; //���� 0�� �ָ� �ȵȴ�.
		left = start + 1;
		right = end;
		
		while(left<=right)
		{
			//left�� ���� ������ �����ų�, ���ذ����� ū ���� �����ų�
			while(left<=end && nums[left] <= nums[key]) left++; //������ ��� �� �ִ�.
			while(right>start && nums[right] >= nums[key]) right--; //������ ��� �� �ִ�.
			
			// 0 && A : ������ 0, ���� ������ �� �ʿ�X
			// 1 || A : ������ 1, ���� ������ �� �ʿ�X
			
			if(left<=right)
			{
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
			}
			else
			{
				int temp = nums[key];
				nums[key] = nums[right];
				nums[right] = temp;
			}
		}
		
//		display(nums, 0, right-1);
//		System.out.println();
//		display(nums, right+1, end);
		quicksort(nums, start, right-1);
		quicksort(nums, right+1, end);
	}
	
	public static void main(String[] args) {
//		display(nums, 0, 9);
//		display(nums, 3, 7);
//		display(nums, 6, 9);
//		
//		quicksort(nums, 0, 9);
//		display(nums, 0, 9);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л����ڴ� : ");
		int count = sc.nextInt();
		nums = new int[count];
		
		for(int i=0; i<count; i++)
		{
			System.out.print("���� : ");
			nums[i] = sc.nextInt();
		}
		
		quicksort(nums, 0, count-1);
		display(nums, 0, count-1);
	}
}
