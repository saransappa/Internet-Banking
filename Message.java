import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Message extends JFrame{
	public Message(String send) {
		Font f1 = new Font("Comic Sans MS",Font.BOLD | Font.ITALIC , 13);
		Font f2 = new Font("Segoe UI Emoji",Font.BOLD  , 13);
		Font f3 = new Font("Lucida Sans Unicode",Font.BOLD , 13);
		Font f4 = new Font("Tahoma",Font.PLAIN , 13);

		JFrame f = new JFrame("Success") ;
		ImageIcon img = new ImageIcon("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\logo.png");
		f.setIconImage(img.getImage());
		JLabel l1 = new JLabel("Funds have been successfully transferred!");
		l1.setForeground(Color.blue);
		JButton b1 = new JButton("Home");
		b1.setBackground(Color.GREEN);
		f.setVisible(true);
		f.setSize(350,150);
		f.setLayout(null);
		l1.setBounds(30,10,300,20);
		b1.setBounds(110,50,90,20);
		f.add(l1);
		f.add(b1);
		b1.setFont(f2);
		l1.setFont(f3);
		f.getContentPane().setBackground(Color.green);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				Home h=new Home(send);
			}
		});
	}
}
