//2021 1201
package com.woori.board;
import java.time.LocalDate;

// ������ 1ȸ���� ������ Ŭ������ �����.
// �ʿ�� �ϴ� ��Ҹ� �ְ� private ������ �����Ѵ�.
// getter/setter�Լ��� �������ش�.
// �����ͺ��̽����� ������ �а� ���� �����ϸ�, �����ڸ� �� ���� ������
// �⺻�����ڿ� �Ű����������� ����

public class BoardDto {
	private int id=0;
	private String title="";
	private String writer="";
	private String contents="";
	private String wdate="";
	private int hit=0;
	
	// �⺻ ������ (super class)
	public BoardDto() {
		super();
		LocalDate localDate = LocalDate.now(); // ���糯¥
		this.wdate = localDate.toString(); // ��� Ŭ������ toString �Լ��� �� �ִ�. -> ���ڿ��� �ٲ� �� �ִ�.
	}

	// �Ű����� ������ (using fields)
	public BoardDto(int id, String title, String writer, String contents) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		
		LocalDate localDate = LocalDate.now(); // ���糯¥
		this.wdate = localDate.toString(); // ��� Ŭ������ toString �Լ��� �� �ִ�. -> ���ڿ��� �ٲ� �� �ִ�.
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
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
}
