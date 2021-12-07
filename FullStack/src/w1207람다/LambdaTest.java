package w1207람다;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//자바에서 c문법 중 하나를 버림
//함수도 변수나 마찬가지라서 c언어는 함수형 변수를 만들어서 여기에 함수를 저장할 수 있다.
//함수도 주소니까 함수형 변수를 만들어서 함수 주소를 넣어주자
// └ 함수형 포인터(자바가 이게 필요 없어서 버림)
//인터페이스 : 실제 객체를 감추고 외부에 객체 안의 함수들 주소를 외부로 노출시킨다.
//C#, nodejs, 파이썬, 코틀린 - c언어에 함수형 포인터, 이걸 데리고 들어온다(포인터 *)
//함수 ------ 프로그램 여럿이서 하나의 함수를 공유(dll)
//window os -> msdos(os+어플리케이션 하나) 워드를 쓰다가 엑셀을 하고 싶음 -> 워드를 내리고 엑셀을 씀
//window os - 프로그램 여러 개 동시에 돌아감 -> 멀티태스킹
//			  서로 공통된 함수를 어떻게 할까? 공통부분을 dll이라고 만들어서 원래 프로그램과 관계없는
//			  다른 메모리 공간에 놓아볼까? 엑셀이 printf함수를 쓰고 싶은데 이 함수의 몸통이 없어
//			  os한테 요청을 하면 os가 주소만 준다. 엑셀 입장에서는 함수 자체가 필요한 게 아니라
//			  함수의 주소를 저장할 변수가 필요 - 함수형 포인터 변수, 자바는 인터페이스로 해결
			
//람다 : 이름이 없는 함수를 잠깐 만들어서 쓰고 버리기 위한 함수
//자바는 람다를 구축하기 위해 무조건 인터페이스를 구축

@FunctionalInterface
interface Fun1{
	int calc(int a, int b);
	//함수의 모습이 반환값이 int형이고, 두 개의 int형 매개변수를 받는 인터페이스 노출
	//인터페이스 한 개만 노출가능하다.
}

@FunctionalInterface
interface Fnc2{
	void showString(String msg);
}

public class LambdaTest {
	public static void main(String[] args) {
		
		//람다식 함수의 주소를 f 객체의 calc 인터페이스에 전달함
		Fun1 f = (x,y)->{return x+y;}; //간단한 함수 객체를 만들었음
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
		//각각 짝수와 홀수를 분리
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
		
		//위 방법은 불편함 -> 그래서 Stream과 람다를 만듦
		
		//배열을 스트림 객체로 만듦
		IntStream stream = Arrays.stream(nums);
		//filter에 매개변수로 함수가 true 또는 false를 반환하는 람다함수를 만들어서 전달하기
		stream.filter((n)->{return n%2==0;}).forEach((n)->System.out.println(n));
		
		List<String> sList = Arrays.asList("사과", "바나나", "딸기", "포도");
		
		sList.stream().forEach(System.out::println);
		
		sList.stream().forEach((item)->{System.out.print(item+" ");});
		System.out.println();
	}
	
}
