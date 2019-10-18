import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class Welcome {
	public Welcome() {
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
