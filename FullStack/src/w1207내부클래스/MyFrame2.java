// SwingTest2 - MyFrame

package w1207����Ŭ����;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MyFrame2 extends JFrame implements ActionListener {
	
	JButton btnRed = null;
	JButton btnGreen = null;
	JButton btnBlue = null;
	JButton btnMagenta = null;
	//������
	public MyFrame2(String title) {
		this.setTitle(title);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//
		this.setLayout(new FlowLayout());
		
		btnRed = new JButton("red");
		btnGreen = new JButton("green");
		btnBlue = new JButton("blue");
		btnMagenta = new JButton("magenta");
		
		JButton btnAnonymous = new JButton("�͸��� ��ư");
		
		this.add(btnRed); // ��ư�� ����
		this.add(btnGreen); // ��ư�� ����
		this.add(btnBlue); // ��ư�� ����
		this.add(btnMagenta); // ��ư�� ����
		
		//��ư�� ������ �Ʒ� actionPerformed ȣ��
		MyEventhandler handler = new MyEventhandler();
		btnRed.addActionListener(handler);
		btnGreen.addActionListener(handler);
		btnBlue.addActionListener(handler);
		btnMagenta.addActionListener(handler);
		
		//�͸��� Ŭ���� ���� ���̱�
		//�� ���� ��� �޾ƾ� �ϴµ� ��ӹޱ� ������, �����ϰ� ���� �������� �� ��
		btnAnonymous.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "�͸��� Ŭ���� ����ϱ�");
			}
		});
		
	}
	
	//����Ŭ����
	class MyEventhandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String msg="";
			if(e.getSource() == btnRed) {
				msg = "btnRed"; 
			}
			else if(e.getSource() == btnGreen) {
				msg = "btnGreen";
			}
			else if(e.getSource() == btnBlue) {
				msg = "btnBlue";
			}
			else {
				msg = "btnMagenta";
			}
		
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
