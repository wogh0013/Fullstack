package 이차원배열;

import java.util.Scanner;

public class 이차원배열6 {
	
	public static void display1(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				arr[i][j] = i+1;
			}
		}
	}
	
	public static void display2(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				for(int j=0; j<arr.length; j++)
				{
					arr[i][j] = j+1;
				}
			}
			else
			{
				for(int j=0; j<arr.length; j++)
				{
					arr[i][j] = arr.length-j;
				}
			}
		}
	}
	
	public static void display3(int[][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int k=0;
			for(int j=0; j<arr.length; j++)
			{
				k=k+i+1;
				arr[i][j] = k;
			}
		}
	}
	
	
	public static void output(int[][] arr) {
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		int[][] arr;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n][n];
		if(m==1)
		{
			display1(arr);
			output(arr);
		}
		else if(m==2)
		{
			display2(arr);
			output(arr);	
		}
		else
		{
			display3(arr);
			output(arr);
		}	
	}
}
