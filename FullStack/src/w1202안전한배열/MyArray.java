package w1202안전한배열;

public class MyArray {
	private int[] nums;
	private int capacity=10; //용량
	
	//생성자1, 생성자는 public이어야 한다
	public MyArray() {
		nums = new int[capacity];
	}
	
	//생성자2
	public MyArray(int size) {
		if(size<5)
			capacity = 5;
		else
			capacity = size;
		nums = new int[capacity];
	}
	
	
	public void setValue(int index, int value) {
		if(index<0 || index>=capacity)
			return; //오류발생 시 함수 종료
		nums[index] = value;
	}
	
	public int getValue(int index) {
		if(index<0 || index>=capacity)
			return -1; // 함수 앞에 타입이 있는 경우에는 뭐라도 보내야 한다.
					   // int인 경우 오류의 의미로 -1을 반환한다.
		return nums[index];
	}
}
