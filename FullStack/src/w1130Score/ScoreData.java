package w1130Score;

public class ScoreData {
	
	private String name="";
	private String name2="";
	private String name3="";
	private String name4="";
	private String name5="";
	private String name6="";
	private String name7="";
	private String name8="";
	private String name9="";
	private String name10="";
	private String name11="";
	private String name12="";
	private String answer="";
	private String ox="";
	private int count=0;
	private int score=0;
	
	
	public ScoreData(String name, String answer) { // 생성자2
		super();
		this.name = name;
		this.answer = answer;
	}
	
	
	public ScoreData(String id, String password, String name3, String name4, String name5, String name6, String name7,
			String name8, String name9, String name10, String name11, String name12, String answer, String ox,
			int count, int score) {
		super();
		this.name = name;
		this.name2 = name2;
		this.name3 = name3;
		this.name4 = name4;
		this.name5 = name5;
		this.name6 = name6;
		this.name7 = name7;
		this.name8 = name8;
		this.name9 = name9;
		this.name10 = name10;
		this.name11 = name11;
		this.name12 = name12;
		this.answer = answer;
		this.ox = ox;
		this.count = count;
		this.score = score;
	}
	

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
	
	
	public String getName2() {
		return name2;
	}


	public void setName2(String name2) {
		this.name2 = name2;
	}


	public String getName3() {
		return name3;
	}


	public void setName3(String name3) {
		this.name3 = name3;
	}


	public String getName4() {
		return name4;
	}


	public void setName4(String name4) {
		this.name4 = name4;
	}


	public String getName5() {
		return name5;
	}


	public void setName5(String name5) {
		this.name5 = name5;
	}


	public String getName6() {
		return name6;
	}


	public void setName6(String name6) {
		this.name6 = name6;
	}


	public String getName7() {
		return name7;
	}


	public void setName7(String name7) {
		this.name7 = name7;
	}


	public String getName8() {
		return name8;
	}


	public void setName8(String name8) {
		this.name8 = name8;
	}


	public String getName9() {
		return name9;
	}


	public void setName9(String name9) {
		this.name9 = name9;
	}


	public String getName10() {
		return name10;
	}


	public void setName10(String name10) {
		this.name10 = name10;
	}


	public String getName11() {
		return name11;
	}


	public void setName11(String name11) {
		this.name11 = name11;
	}


	public String getName12() {
		return name12;
	}


	public void setName12(String name12) {
		this.name12 = name12;
	}


	public ScoreData() {  // 생성자1
		super();
		// TODO Auto-generated constructor stub
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
