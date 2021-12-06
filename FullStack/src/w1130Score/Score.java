package w1130Score;

public class Score {

	private int korean;
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public Score(int korean) {
		super();
		this.korean = korean;
	}
	
	
}
