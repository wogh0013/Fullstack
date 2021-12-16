package 이차원배열;

public class 이차원배열3 {
	
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
		int[][] arr = new int[10][10];
		k=1;
		
//		arr[0][9] = k++;	// 0	9	= 9
//		
//		arr[1][8] = k++;	// 1	8	= 9
//		arr[1][9] = k++;
//		
//		arr[2][7] = k++;	// 2	7	= 9
//		arr[2][8] = k++;
//		arr[2][9] = k++;
		
		for(i=0; i<10; i++)
		{
			for(j=9-i; j<10; j++)
				arr[i][j] = k++;
		}
				
		display(arr);
		
		
		
		
	}
}
