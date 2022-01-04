// SwingTest2 - MyFrame

package w1206����;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener {
	
	JButton button = null;
	//������
	public MyFrame(String title) {
		this.setTitle(title);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//
		this.setLayout(new FlowLayout());
		button = new JButton("��������.");
		this.add(button); // ��ư�� ����
		
		//��ư�� ������ �Ʒ� actionPerformed ȣ��
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JButton temp = (JButton)button; //�ٿ�ĳ����
			temp.setText("����!");
		}
		
	}

	
}
