// SwingTest2 - MyFrame

package w1206스윙;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener {
	
	JButton button = null;
	//생성자
	public MyFrame(String title) {
		this.setTitle(title);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//
		this.setLayout(new FlowLayout());
		button = new JButton("누르세요.");
		this.add(button); // 버튼을 붙임
		
		//버튼을 누르면 아래 actionPerformed 호출
		button.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JButton temp = (JButton)button; //다운캐스팅
			temp.setText("하이!");
		}
		
	}

	
}
