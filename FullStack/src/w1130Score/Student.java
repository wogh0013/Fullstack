package w1130Score;

public class Student {

	// �̰Ŵ� ���� �л������� Student Ŭ������ ���� ��������
	private String name;
	private String tel;
	
	// ��������
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
