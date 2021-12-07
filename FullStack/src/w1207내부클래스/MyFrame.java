// SwingTest2 - MyFrame

package w1207����Ŭ����;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener {
	
	JButton btnRed = null;
	JButton btnGreen = null;
	JButton btnBlue = null;
	JButton btnMagenta = null;
	//������
	public MyFrame(String title) {
		this.setTitle(title);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//
		this.setLayout(new FlowLayout());
		
		btnRed = new JButton("red");
		btnGreen = new JButton("green");
		btnBlue = new JButton("blue");
		btnMagenta = new JButton("magenta");
		
		this.add(btnRed); // ��ư�� ����
		this.add(btnGreen); // ��ư�� ����
		this.add(btnBlue); // ��ư�� ����
		this.add(btnMagenta); // ��ư�� ����
		
		//��ư�� ������ �Ʒ� actionPerformed ȣ��
		btnRed.addActionListener(this);
		btnGreen.addActionListener(this);
		btnBlue.addActionListener(this);
		btnMagenta.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRed) {
			JButton temp = (JButton)btnRed; //�ٿ�ĳ����
			temp.setText("����!");
		}
		else if(e.getSource() == btnGreen) {
			JButton temp = (JButton)btnGreen; //�ٿ�ĳ����
			temp.setText("�׸�!");
		}
		else if(e.getSource() == btnBlue) {
			JButton temp = (JButton)btnBlue; //�ٿ�ĳ����
			temp.setText("���!");
		}
		else {
			JButton temp = (JButton)btnMagenta; //�ٿ�ĳ����
			temp.setText("����Ÿ!");
		}
		
	}

	
}
