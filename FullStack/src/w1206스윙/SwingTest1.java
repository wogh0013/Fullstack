// 옛날 방식

package w1206스윙;
import javax.swing.JFrame;

public class SwingTest1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My First Frame");
		
		//화면 크기 지정
		frame.setSize(300,200);
		//닫기 버튼 누르면 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면이 보이도록 한다.
		frame.setVisible(true);
	}
}
