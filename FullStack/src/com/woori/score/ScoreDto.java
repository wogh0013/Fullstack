package com.woori.score;

public class ScoreDto implements Comparable {
	private String name="";
	private int kor=0;
	private int eng=0;
	private int mat=0;
	private int total=0;
	
	public ScoreDto() {
		super();
	}

	public ScoreDto(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		calculator();
	}
	
	public int calculator() {
		this.total = this.kor + this.eng + this.mat;
		return total;
	}

	@Override
	public String toString() {
		return String.format("%s %d %d %d %d", name, kor, eng, mat, total);
	}
	
	@Override
	public boolean equals(Object obj) {
		ScoreDto temp = (ScoreDto)obj;
		return this.name.equals(temp.name);
	}

	@Override
	public int compareTo(Object o) {
		ScoreDto temp = (ScoreDto)o;
		return this.total-temp.total;
	}
	
	
	
}

