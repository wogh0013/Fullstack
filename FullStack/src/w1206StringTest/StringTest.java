package w1206StringTest;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class StringTest {
	public static void main(String[] args) {
		String s1 = new String("Hello java");
		
		//String 클래스는 멤버함수가 엄청나다.
		//처음에 객체를 만들면 내용을 못 바꾼다.
		for(int i=0; i<s1.length(); i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println();
			
		String s2 = s1.replace("java", "python");	
		System.out.println(s1); // s1은 그대로 출력
		System.out.println(s2); // s2는 replace된 거로 출력
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.compareTo(s2)); 
		// 음수 : s1이 s2보다 앞에 있다
		// 양수 : s1이 s2보다 뒤에 있다.
		// 0일 때 : 둘의 내용이 같다
		
		int pos = s1.indexOf("java");
		System.out.println(pos);
		
		pos = s2.indexOf("java");
		System.out.println(pos);
		
		s1 = "c:\\temp\\test.txt";
		pos = s1.indexOf(".");
		String filename = s1.substring(0, pos);
		String ext = s1.substring(pos+1);
		System.out.println("파일명 : " + filename);
		System.out.println("확장자명 : " + ext);
		
		s1 = "C:\\자바풀스택\\자바\\workspace_2021\\test.txt";
		pos = s1.lastIndexOf("\\");
		System.out.println(pos);
		
		String path = s1.substring(0, pos);
		filename = s1.substring(pos+1);
		System.out.println("파일명 : " + filename);
		System.out.println("확장자명 : " + ext);
		System.out.println(pos);
		
		
		
		StringBuffer buffer = new StringBuffer();
		//문자열을 추가할 때 String은 객체로 새로 만든다.
		//StringBuffer 내부에 배열이 있어서 필요하면 메모리를 계속 늘려간다.
		//추가연산을 많이 할 때는 StringBuffer가 더 뛰어나다.
		
		buffer.append("flower");
		buffer.append("rainbow");
		buffer.append("cloud");
		buffer.append("rain");
		buffer.append("snow");
		buffer.append("wind");
		
		buffer.setCharAt(0, 'F');
		System.out.println(buffer);
				
		//
		LocalTime lt = LocalTime.now(); //현재 시간을 밀리초까지
		System.out.println("시작시간 : " + lt);
		s1 = new String("");
		for(int i=1; i<=10000; i++)
			s1 = s1+i;
		
		System.out.println("종료시간 : " + LocalTime.now());
		
		//
		System.out.println("시작시간 : " + LocalTime.now());

		buffer = new StringBuffer();
		for(int i=1; i<10000; i++)
			buffer.append(i);
		
		System.out.println("종료시간 : " + LocalTime.now());
		
		
		//Wrapper
		//List<int> list = new ArrayList<int>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(7);         // 7 -> Integer로 전환 : 박싱
		int n = list.get(0); // Integer -> int로 전환 : 언박싱
		System.out.println(n);
		
		
	}
}

