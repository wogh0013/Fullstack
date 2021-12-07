package com.woori.score;

public class ScoreMain {
	public static void main(String[] args) {
		ScoreDao dao = new ScoreDao();
		dao.output();
		dao.search();
		dao.sort();
	}
}
