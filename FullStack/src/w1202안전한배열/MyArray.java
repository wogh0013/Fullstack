package w1202�����ѹ迭;

public class MyArray {
	private int[] nums;
	private int capacity=10; //�뷮
	
	//������1, �����ڴ� public�̾�� �Ѵ�
	public MyArray() {
		nums = new int[capacity];
	}
	
	//������2
	public MyArray(int size) {
		if(size<5)
			capacity = 5;
		else
			capacity = size;
		nums = new int[capacity];
	}
	
	
	public void setValue(int index, int value) {
		if(index<0 || index>=capacity)
			return; //�����߻� �� �Լ� ����
		nums[index] = value;
	}
	
	public int getValue(int index) {
		if(index<0 || index>=capacity)
			return -1; // �Լ� �տ� Ÿ���� �ִ� ��쿡�� ���� ������ �Ѵ�.
					   // int�� ��� ������ �ǹ̷� -1�� ��ȯ�Ѵ�.
		return nums[index];
	}
}
