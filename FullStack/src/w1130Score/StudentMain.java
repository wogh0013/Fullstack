package w1130Score;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student("����ȣ", "1234-1234");
		student.getName();
		// ���̸��� �ٱ͸� set�� �̿��ؼ� �ٲ�
		//student.setScore(new Score(100));
		student.setScore(new Score(200));
		student.getScore().setStudent(student);
		
		
		int jumsu1  = student.getScore().getKorean();
		
		Score score = student.getScore();
		int jumsu2 = score.getKorean();
		
	}
}
