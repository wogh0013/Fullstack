package w1209람다;
//변수랑 함수가 막 뒤섞여있는 혼돈의 시대 -> 변수랑 함수를 정리정돈(클래스)
//세상 모든 걸 클래스만으로 해결할 수 있는가에 대한 반성을 한다.
//작게 만들어서 쓰고 버리자(익명의 클래스, 익명의 함수를 만들어서 쓰고 버리자)
//클래스를 만들고 아주 작은 부분만 우리가 수정하면 되도록 인터페이스만 노출시킴

import java.util.Arrays;
import java.util.List;

public class 람다 {

	//usb라는 인터페이스를 통해서 모니터, 마우스, 키보드 연결
	//우리도 소프트웨어적으로 해결해보자 !
	
	@FunctionalInterface
	interface MyInterface{
		int compare(int x1, int x2); // 이 함수는 외부로 노출시키기 위한 목적이고 실체가 없다.
	}
	
	public static void main(String[] args) {
		MyInterface m1 = (x1, x2)->{return x1 - x2;};
		
		//m1의 역할은 인터페이스
		//(x1, x2)->{return x1 - x2};   실체
		
		//스트림 기반 기술
		List<String> sList = Arrays.asList("apple", "banana", "coffee",
				"grape", "milk", "cheese", "kiwi", "berry");
		
		System.out.println(sList.stream().count());
		
		//저 목록에서 a나 c로 시작하는 데이터들만 걸러서 다른 리스트로
		List<String> aList = sList.stream().filter(
				(n)->{
					if(n.startsWith("a") || n.startsWith("c"))
						return true;
					else
						return false;
				}
			).toList();
		
		System.out.println(aList);
//		 .forEach((n)->{
//				System.out.println(n);
//			});
	}
}
