package w1130Score;

public class Student {

	// 이거는 정말 학생에대한 Student 클래스에 대한 나의정보
	private String name;
	private String tel;
	
	// 참고정보
	private Score score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

//	public Student(String name, String tel, Score score) {
//		super();
//		this.name = name;
//		this.tel = tel;
//		this.score = score;
//	}

	public Student(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	
	
	
	
}
