package 이차원배열;

class Util
{
	public static String deciToBin(int value)
	{
		String result="";
		int mok, nmg;
		// 2로 나누어서 나머지 구하고 저장하고
		// 몫이 0이 될 때까지
		
		mok = value;
		while(mok!=0)
		{
			nmg= mok%2;
			result += (char)(nmg+'0');
			mok = mok/2;
		}
		
		// r[0] <-> r[9]
		// r[1] <-> r[8]
		// r[2] <-> r[7]
		// r[3] <-> r[6]
		// r[4] <-> r[5]
		
		char[] r = result.toCharArray();
		for(int i=0; i<r.length/2; i++)
		{
			char temp = r[i];
			r[i] = r[r.length-i-1];
			r[r.length-i-1]=temp;
		}
		return String.valueOf(r);
	}
	
	public static int binToDec(String nums)
	{
		int result=0;
		for(int i=0; i<nums.length(); i++)
		{
			result = result*2 + nums.charAt(i)-'0';
		}
		return result;
	}
}

public class 이진수변환 {
	public static void main(String[] args) {
		System.out.println(Util.deciToBin(14));
	}
}
