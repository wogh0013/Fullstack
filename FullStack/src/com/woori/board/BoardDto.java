package com.woori.board;

// 데이터 1회분을 저장할 클래스를 만든다.
// 필요로 하는 요소를 주고 private 변수로 선언한다.
// getter/setter함수를 생성해준다.

public class BoardDto {
	private int id=0;
	private String title="";
	private String writer="";
	private String contents="";
	private String wdate="";
	private String hit="";
	
	//생성자 (using fields)
	public BoardDto(int id, String title, String writer, String contents) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
	}
	
	//getter : get함수명의 첫 글자를 대문자, 나머지 소문자 / 매개변수 없음
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}
	
}
