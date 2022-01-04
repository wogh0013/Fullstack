package w1130;
import java.util.ArrayList;

public class 컬렉션 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("커피");
		list.add("망고주스");
		list.add("오렌지주스");
		list.add("자몽에이드");
		list.add("캬라멜마키아또");
		
		System.out.println("데이터 카운트 : " + list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //저장된 데이터 가져오기
		}
		
		int pos = list.indexOf("망고주스"); // 배열 번호를 반환
		System.out.println(pos);
		
		pos = list.indexOf("딸기주스");  //자바는 함수에 뭔가 문제가 있을 때 -1 반환
		System.out.println(pos);      //참조일 때는 null값
				
		list.sort(null); // abc순, 가나다라순으로 늘어놓는 것 = 정렬(sort)
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("------삭제 후------");
		list.remove(1); //위치값
		list.remove("캬라멜마키아또"); //이름값
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("-----전체삭제 후------");
		list.clear();
		for(String s : list) {
			System.out.println(s);
		}
	}
}
