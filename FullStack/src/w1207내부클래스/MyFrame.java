// SwingTest2 - MyFrame

package w1207내부클래스;
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
	//생성자
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
		
		this.add(btnRed); // 버튼을 붙임
		this.add(btnGreen); // 버튼을 붙임
		this.add(btnBlue); // 버튼을 붙임
		this.add(btnMagenta); // 버튼을 붙임
		
		//버튼을 누르면 아래 actionPerformed 호출
		btnRed.addActionListener(this);
		btnGreen.addActionListener(this);
		btnBlue.addActionListener(this);
		btnMagenta.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRed) {
			JButton temp = (JButton)btnRed; //다운캐스팅
			temp.setText("레드!");
		}
		else if(e.getSource() == btnGreen) {
			JButton temp = (JButton)btnGreen; //다운캐스팅
			temp.setText("그린!");
		}
		else if(e.getSource() == btnBlue) {
			JButton temp = (JButton)btnBlue; //다운캐스팅
			temp.setText("블루!");
		}
		else {
			JButton temp = (JButton)btnMagenta; //다운캐스팅
			temp.setText("마젠타!");
		}
		
	}

	
}
