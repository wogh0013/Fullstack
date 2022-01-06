package 이차원배열;

public class 이차원배열4 {
	
	public static void display(int[][] nums) {
		int i, j;
		
		for(i=0; i<nums.length; i++)
		{
			for(j=0; j<nums[i].length; j++)
				System.out.printf("%3d", nums[i][j]);
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int i, j, k;
		int[][] nums = new int[10][10];
		k=1;
		
//		arr[0][0] = k++;	
//		
//		arr[0][1] = k++;	
//		arr[1][1] = k++;
//		
//		arr[0][2] = k++;	
//		arr[1][2] = k++;
//		arr[2][2] = k++;
		
		for(i=0; i<10; i++)
		{
			for(j=0; j<=i; j++)
				nums[j][i] = k++;
		}
				
		display(nums);
		
		
		
		
	}
}
