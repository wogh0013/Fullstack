package w1130Q;

public class ScoreData {
	private String name="";
	private String answer="";
	private String ox="";
	private int count=0;
	private int score=0;
	
	
	public void calculate(String jungdap) {
		this.ox = "";
		this.count=0;
		
		for(int i=0; i<10; i++) {
			if(this.answer.charAt(i) == jungdap.charAt(i)) {
				this.ox += "O"; // this.ox = this.ox + "O";
				this.count++;
			}
			else {
				this.ox += "X";
			}
		}
		this.score = this.count*10;
	}
	
	
	public ScoreData() {  // 생성자1
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ScoreData(String name, String answer) { // 생성자2
		super();
		this.name = name;
		this.answer = answer;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getOx() {
		return ox;
	}
	public void setOx(String ox) {
		this.ox = ox;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		//출력은 못함 -> printf 사용 x
		//문자열로 반환 String.format 함수가 printf와 유사 ! 서식문자열을 만든다.
		return String.format("%s %s %s %d %d", name, answer, ox, count, score);
	}
	
}
