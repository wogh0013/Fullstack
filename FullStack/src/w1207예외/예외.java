package w1207예외;

public class 예외 {
	public static void main(String[] args) {
		
		try {
			
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			//데이터베이스를 닫거나 파일을 닫거나
			System.out.println("이 부분을 반드시 거친다.");
			//오류가 발생을 했던 발생하지 않았던 반드시 해야 할 일
		}
	}
}
