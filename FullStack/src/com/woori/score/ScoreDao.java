package com.woori.score;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScoreDao {
	Scanner sc = new Scanner(System.in);
	List<ScoreDto> list = new ArrayList<ScoreDto>();
	
	public ScoreDao() {
		list = Arrays.asList(
				new ScoreDto("홍길동", 90, 90, 90),
				new ScoreDto("고길동", 80, 80, 80),
				new ScoreDto("두울리", 80, 70, 70),
				new ScoreDto("도우너", 70, 70, 70),
				new ScoreDto("마이클", 60, 60, 60),
				new ScoreDto("또우치", 50, 50, 50)
			);
	}
	
	public void output() {
		list.stream().forEach(System.out::println);
	}
	
	public void search() {
		String name = "";
		System.out.print("이름 : ");
		name = sc.next();
		
		ScoreDto dto = new ScoreDto(name, 0, 0, 0);
		List<ScoreDto> searchList = list.stream().filter((x)->{return x.equals(dto);}).toList();
		
		if(searchList.size()==0) {
			System.out.println(name+"을 찾을 수 없습니다.");
		}
		else {
			searchList.stream().forEach(System.out::println);
		}
	}
	
	public void sort() {
		List<ScoreDto> sortList = list.stream()
				.sorted((x1, x2)->{return x1.compareTo(x2);})
				.toList();
		
		sortList.stream().forEach(System.out::println);
	}
	
	
}
