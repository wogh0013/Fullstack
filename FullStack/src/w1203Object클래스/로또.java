package w1203ObjectŬ����;
import java.util.Random;

class Lotto{
	int[] nums = new int[6];
	int count=0;
	//�̹� �����ϴ��� üũ�ϴ� �Լ� / ������ true, ������ false ��ȯ
	boolean isDuplicate(int temp) 
	{
		for(int i=0; i<count; i++) 
		{
			if(temp == nums[i])
			{
				return true; //�ߺ��� �� ������ ���⼭ �Լ� ����
			}
		}
		return false; //for ������ �����ߴٴ� ���� ����.
	}
	
	public void createLotto() 
	{
		Random rand = new Random();
		count=0;
		
		while(count<6) 
		{
			int temp = rand.nextInt(10)+1;
			if( ! isDuplicate(temp)) //�ߺ� �ȵǸ�
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

public class �ζ� {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.createLotto();
		lotto.display();
	}
}
