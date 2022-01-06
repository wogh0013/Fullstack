package 이차원배열;

public class 이차원배열5 {
	
	public static void display(int[][] arr)
	{
		int i, j;
		
		for(i=0; i<arr.length; i++)
		{
			for(j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int i, j;
		int k=1;
		int[][] arr = new int[5][5];
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++)
				arr[i][j] = k;
				k++;
		}
		
		display(arr);
		
	}
}
