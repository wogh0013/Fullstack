package com.woori.board;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
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
			System.out.printf("%s\n", board.getContents());
		}
	}
}
