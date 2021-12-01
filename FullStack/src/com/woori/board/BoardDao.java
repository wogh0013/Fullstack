package com.woori.board;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
	Scanner sc = new Scanner(System.in);
	List<BoardDto> boardList = new ArrayList<BoardDto>();
	
	public BoardDao() {
		boardList.add(new BoardDto(1, "제목1", "작성자1", "내용1"));
		boardList.add(new BoardDto(2, "제목2", "작성자2", "내용2"));
		boardList.add(new BoardDto(3, "제목3", "작성자3", "내용3"));
		boardList.add(new BoardDto(4, "제목4", "작성자4", "내용4"));
		boardList.add(new BoardDto(5, "제목5", "작성자5", "내용5"));
	}
	
	void output() {
		for(BoardDto board : boardList) {
			//System.out.printf("%d %s %s %s\n", board.getId(), board.getTitle(), board.getWriter(), board.getContents());
			System.out.printf("%d\t", board.getId());
			System.out.printf("%s\t", board.getTitle());
			System.out.printf("%s\t", board.getWriter());
			System.out.printf("%s\t", board.getContents());
			System.out.printf("%d\t", board.getHit());
			System.out.printf("%s\n", board.getWdate());
		}
	}
	
	public void append() {
		int id = boardList.size() + 1;
		String title="";
		String writer="";
		String contents="";
		
		sc.nextLine(); //버퍼에 남은 쓸데없는 \n 지우기
		System.out.print("제목 : ");
		title = sc.nextLine();
		System.out.print("작성자 :  ");
		writer = sc.nextLine();
		System.out.print("내용 : ");
		contents= sc.nextLine();
		
		//dto 변수는 사라지고, 객체 주소는 boardList 안에 존재한다.
		BoardDto dto = new BoardDto(id, title, writer, contents);
		boardList.add(dto);
	}
	
	public void menuDisplay() {
		System.out.println("    메뉴    ");
		System.out.println("-----------");
		System.out.println("  1. 추가   ");
		System.out.println("  2. 출력   ");
		System.out.println("  3. 검색   ");
		System.out.println("  4. 종료   ");
		System.out.println("-----------");
		return;
	}
	
	public void search() {
		String name="";
		System.out.print("이름 : ");
		name = sc.next();
		boolean found=false;
		BoardDto findDto=null;
		
		for(BoardDto dto : boardList) {
			if(dto.getWriter().equals(name)) {
				found=true; // 이 변수를 통해 값이 바뀌면서 break문으로 중간에 빠져나왔다는 걸 알 수 있다.
				findDto = dto;
				break;
		}
	}
	//for문을 종료하고 break로 종료한 건지, 끝까지 다 간 건지 알 수 없다.
	
		if(found) {
			System.out.printf("%d\t", findDto.getId());
			System.out.printf("%s\t", findDto.getTitle());
			System.out.printf("%s\t", findDto.getWriter());
			System.out.printf("%s\t", findDto.getContents());
			System.out.printf("%d\t", findDto.getHit());
			System.out.printf("%s\t", findDto.getWdate());
		}
		else {
			System.out.printf("%s is not found\n", name);
		}
}
	
	
	public void start() {
		while(true) {
			menuDisplay();
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			switch(menu) {
				case 1: append(); break;
				case 2: output(); break;
				case 3: search(); break;
				case 0: System.out.println("프로그램을 종료합니다."); 
						return;
				default: System.out.println("ㅎㅎ");
			}
		}
	}
}
