import javax.swing.*;
import java.awt.*;

public class JPanelDemo {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(300,100,400,200); //设置窗口大小和位置

		JPanel jp = new JPanel();
		JLabel jLabel = new JLabel("这是放在Jpanel上的标签");
		jp.setBackground(Color.white);
		jp.add(jLabel);
		jf.add(jp);
		jf.setVisible(true);

	}
}
