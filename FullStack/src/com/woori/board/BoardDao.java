package com.woori.board;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<BoardDto> boardList = new ArrayList<BoardDto>();
	
	public BoardDao() {
		boardList.add(new BoardDto(1, "����1", "�ۼ���1", "����1"));
		boardList.add(new BoardDto(2, "����2", "�ۼ���2", "����2"));
		boardList.add(new BoardDto(3, "����3", "�ۼ���3", "����3"));
		boardList.add(new BoardDto(4, "����4", "�ۼ���4", "����4"));
		boardList.add(new BoardDto(5, "����5", "�ۼ���5", "����5"));
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
