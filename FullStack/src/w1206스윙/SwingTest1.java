// ���� ���

package w1206����;
import javax.swing.JFrame;

public class SwingTest1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("My First Frame");
		
		//ȭ�� ũ�� ����
		frame.setSize(300,200);
		//�ݱ� ��ư ������ ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ȭ���� ���̵��� �Ѵ�.
		frame.setVisible(true);
	}
}
