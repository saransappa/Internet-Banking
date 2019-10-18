import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
public class Welcome {
	public Welcome() {
		Font f1 = new Font("Comic Sans MS",Font.BOLD | Font.ITALIC , 13);
		Font f2 = new Font("Segoe UI Emoji",Font.BOLD  , 13);
		Font f3 = new Font("Lucida Sans Unicode",Font.BOLD , 13);
		Font f4 = new Font("Tahoma",Font.PLAIN , 13);

		JFrame f = new JFrame("Welcome");
		ImageIcon img = new ImageIcon("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\logo.png");
		f.setIconImage(img.getImage());
		JButton l1 = new JButton();
		l1.setIcon(img);
		f.add(l1);

		f.getContentPane().add(l1,BorderLayout.CENTER);
		f.setSize(250, 300);
		f.setVisible(true);
		
		l1.setBackground(Color.white);
		
		l1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				Login l = new Login();
			}
		});
	}
}
