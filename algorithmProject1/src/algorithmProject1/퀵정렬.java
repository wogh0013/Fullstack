package algorithmProject1;

import java.util.Scanner;

public class 퀵정렬 {
	static int[] nums = new int[] {};
	
	static void display(int[] nums, int start, int end)
	{
		System.out.println();
		System.out.println("성적 순으로 정렬");
		int j=-3;
		for(int i=end; i>=start; i--)
		{
			System.out.printf("%d등 : %d\n", i+j, nums[i]);
			j+=2; // j = j -2;
		}
		System.out.println();
	}
	
	static void quicksort(int[] nums, int start, int end)
	{
		if(start>=end) return;
		
		int key, left, right;
		
		key = start;
		left = start + 1;
		right = end;
		
		while(left<=right)
		{
			while(left<=end && nums[left]<=nums[key]) left++;
			while(right>start && nums[right]>=nums[key]) right--;
			
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
		
		quicksort(nums, start, right-1);
		quicksort(nums, right+1, end);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력 : ");
		int count = sc.nextInt();
		nums = new int[count];
		
		for(int i=0; i<count; i++)
		{
			System.out.print("학생 " + (i+1) + " 점수 입력 : ");
			nums[i] = sc.nextInt();
		}
		
		quicksort(nums, 0, count-1);
		display(nums, 0, count-1);
	}
}
