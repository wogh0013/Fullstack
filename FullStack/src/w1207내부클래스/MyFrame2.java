// SwingTest2 - MyFrame

package w1207내부클래스;
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
	//생성자
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
		
		JButton btnAnonymous = new JButton("익명의 버튼");
		
		this.add(btnRed); // 버튼을 붙임
		this.add(btnGreen); // 버튼을 붙임
		this.add(btnBlue); // 버튼을 붙임
		this.add(btnMagenta); // 버튼을 붙임
		
		//버튼을 누르면 아래 actionPerformed 호출
		MyEventhandler handler = new MyEventhandler();
		btnRed.addActionListener(handler);
		btnGreen.addActionListener(handler);
		btnBlue.addActionListener(handler);
		btnMagenta.addActionListener(handler);
		
		//익명의 클래스 만들어서 붙이기
		//└ 원래 상속 받아야 하는데 상속받기 귀찮음, 간단하게 쓰고 버리고자 할 때
		btnAnonymous.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "익명의 클래스 사용하기");
			}
		});
		
	}
	
	//내붑클래스
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
