package com.woori.board;

// ������ 1ȸ���� ������ Ŭ������ �����.
// �ʿ�� �ϴ� ��Ҹ� �ְ� private ������ �����Ѵ�.
// getter/setter�Լ��� �������ش�.

public class BoardDto {
	private int id=0;
	private String title="";
	private String writer="";
	private String contents="";
	private String wdate="";
	private String hit="";
	
	//������ (using fields)
	public BoardDto(int id, String title, String writer, String contents) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
	}
	
	//getter : get�Լ����� ù ���ڸ� �빮��, ������ �ҹ��� / �Ű����� ����
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
