package w1207����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//�ڹٿ��� c���� �� �ϳ��� ����
//�Լ��� ������ ���������� c���� �Լ��� ������ ���� ���⿡ �Լ��� ������ �� �ִ�.
//�Լ��� �ּҴϱ� �Լ��� ������ ���� �Լ� �ּҸ� �־�����
// �� �Լ��� ������(�ڹٰ� �̰� �ʿ� ��� ����)
//�������̽� : ���� ��ü�� ���߰� �ܺο� ��ü ���� �Լ��� �ּҸ� �ܺη� �����Ų��.
//C#, nodejs, ���̽�, ��Ʋ�� - c�� �Լ��� ������, �̰� ������ ���´�(������ *)
//�Լ� ------ ���α׷� �����̼� �ϳ��� �Լ��� ����(dll)
//window os -> msdos(os+���ø����̼� �ϳ�) ���带 ���ٰ� ������ �ϰ� ���� -> ���带 ������ ������ ��
//window os - ���α׷� ���� �� ���ÿ� ���ư� -> ��Ƽ�½�ŷ
//			  ���� ����� �Լ��� ��� �ұ�? ����κ��� dll�̶�� ���� ���� ���α׷��� �������
//			  �ٸ� �޸� ������ ���ƺ���? ������ printf�Լ��� ���� ������ �� �Լ��� ������ ����
//			  os���� ��û�� �ϸ� os�� �ּҸ� �ش�. ���� ���忡���� �Լ� ��ü�� �ʿ��� �� �ƴ϶�
//			  �Լ��� �ּҸ� ������ ������ �ʿ� - �Լ��� ������ ����, �ڹٴ� �������̽��� �ذ�
			
//���� : �̸��� ���� �Լ��� ��� ���� ���� ������ ���� �Լ�
//�ڹٴ� ���ٸ� �����ϱ� ���� ������ �������̽��� ����

@FunctionalInterface
interface Fun1{
	int calc(int a, int b);
	//�Լ��� ����� ��ȯ���� int���̰�, �� ���� int�� �Ű������� �޴� �������̽� ����
	//�������̽� �� ���� ���Ⱑ���ϴ�.
}

@FunctionalInterface
interface Fnc2{
	void showString(String msg);
}

public class LambdaTest {
	public static void main(String[] args) {
		
		//���ٽ� �Լ��� �ּҸ� f ��ü�� calc �������̽��� ������
		Fun1 f = (x,y)->{return x+y;}; //������ �Լ� ��ü�� �������
		System.out.println(f.calc(4,5));
		
		f=(x,y)->{return x-y;};
		System.out.println(f.calc(4,5));
		
		f=(x,y)->{return x*y;};
		System.out.println(f.calc(4,5));

		f=(x,y)->{return x/y;};
		System.out.println(f.calc(4,5));
		
		Fnc2 f2 = msg -> System.out.println(msg);
		
		f2.showString("Hello");
		
		
		int[] nums = new int[] {3,1,2,5,4,9,8,11,14,13,35,27,51};
		//���� ¦���� Ȧ���� �и�
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0)
				evenList.add(nums[i]);
			else
				oddList.add(nums[i]);
		}
		
		for(Integer n : evenList)
			System.out.print(n+" ");
		System.out.println();
		
		for(Integer n : oddList)
			System.out.print(n+" ");
		System.out.println();
		
		//�� ����� ������ -> �׷��� Stream�� ���ٸ� ����
		
		//�迭�� ��Ʈ�� ��ü�� ����
		IntStream stream = Arrays.stream(nums);
		//filter�� �Ű������� �Լ��� true �Ǵ� false�� ��ȯ�ϴ� �����Լ��� ���� �����ϱ�
		stream.filter((n)->{return n%2==0;}).forEach((n)->System.out.println(n));
		
		List<String> sList = Arrays.asList("���", "�ٳ���", "����", "����");
		
		sList.stream().forEach(System.out::println);
		
		sList.stream().forEach((item)->{System.out.print(item+" ");});
		System.out.println();
	}
	
}
