package 이차원배열;

public class 이차원배열2 {
	
	public static void display(int[][] nums)
	{
		int i, j;
		
		for(i=0; i<nums.length; i++)
		{
			for(j=0; j<nums[i].length; j++)
				System.out.printf("%3d", nums[i][j]);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int i, j;
		
		int[][] arr = new int[][]
				{
					{1, 2, 3, 4, 0},
					{5, 6, 7, 8, 0},
					{9, 10, 11, 12, 0},
					{13, 14, 15, 16, 0},
					{0, 0, 0, 0, 0}
				};

//		가로행 합. 하드코딩		
//		arr[0][4] = arr[0][0] + arr[0][1] + arr[0][2] + arr[0][3];
//		arr[1][4] = arr[1][0] + arr[1][1] + arr[1][2] + arr[1][3];
//		arr[2][4] = arr[2][0] + arr[2][1] + arr[2][2] + arr[2][3];
//		arr[3][4] = arr[3][0] + arr[3][1] + arr[3][2] + arr[3][3];

		//가로행 합
		for(i=0; i<4; i++)
			for(j=0; j<4; j++)
				arr[i][4] = arr[i][4] + arr[i][j];
		
		
		
		//세로행 합. 하드코딩
//		arr[4][0] = arr[0][0] + arr[1][0] + arr[2][0] + arr[3][0];
//		arr[4][1] = arr[0][1] + arr[1][1] + arr[2][1] + arr[3][1];
//		arr[4][2] = arr[0][2] + arr[1][2] + arr[2][2] + arr[3][2];
//		arr[4][3] = arr[0][3] + arr[1][3] + arr[2][3] + arr[3][3];
//		arr[4][4] = arr[0][4] + arr[1][4] + arr[2][4] + arr[3][4];
		
		//세로행 합
		for(i=0; i<5; i++)
			for(j=0; j<4; j++)
				arr[4][i] = arr[4][i] + arr[j][i];
		
		display(arr);
	}
}











