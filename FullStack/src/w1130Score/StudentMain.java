package w1130Score;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student("정재호", "1234-1234");
		student.getName();
		// 내이름이 바귀면 set을 이용해서 바꿔
		//student.setScore(new Score(100));
		student.setScore(new Score(200));
		student.getScore().setStudent(student);
		
		
		int jumsu1  = student.getScore().getKorean();
		
		Score score = student.getScore();
		int jumsu2 = score.getKorean();
		
	}
}
