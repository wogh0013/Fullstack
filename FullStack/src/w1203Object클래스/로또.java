package w1203Object클래스;
import java.util.Random;

class Lotto{
	int[] nums = new int[6];
	int count=0;
	//이미 존재하는지 체크하는 함수 / 있으면 true, 없으면 false 반환
	boolean isDuplicate(int temp) 
	{
		for(int i=0; i<count; i++) 
		{
			if(temp == nums[i])
			{
				return true; //중복된 게 있으면 여기서 함수 종료
			}
		}
		return false; //for 끝까지 수행했다는 말은 없다.
	}
	
	public void createLotto() 
	{
		Random rand = new Random();
		count=0;
		
		while(count<6) 
		{
			int temp = rand.nextInt(10)+1;
			if( ! isDuplicate(temp)) //중복 안되면
			{
				nums[count] = temp;
				count++;
			}
		}
	}
	
	void display()
	{
		for(int n : nums)
			System.out.println(n);
	}
}

public class 로또 {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.createLotto();
		lotto.display();
	}
}
