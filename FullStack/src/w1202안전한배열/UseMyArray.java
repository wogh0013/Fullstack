package w1202안전한배열;

public class UseMyArray {
	public static void main(String[] args) {
		MyArray arr = new MyArray();
		
		arr.setValue(0, 1);
		arr.setValue(10, 11);
		
		// 1. 데이터에 단순접근
		int[] arr2 = new int[10];
//		arr2[10] = 11; // 이건 오류 발생 because 10번 방이 없으므로
		
		// 2. 함수를 이용하여 데이터에 접근
		System.out.println(arr.getValue(0));
		System.out.println(arr.getValue(10)); // 오류나도 -1 반환
		System.out.println(arr.getValue(100)); // 오류나도 -1 반환
		
		// 1보다 2를 사용하는 이유 !
		// 함수를 이용해 데이터에 접근하면, 접근권한을 비롯해 다양한 방법으로 데이터를 보호해줌
		// 이것이 함수를 사용하여 데이터에 접근하는 이유이다.
		
		MyArray arr3 = new MyArray(30);
	}
}
