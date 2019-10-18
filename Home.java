import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class Home extends JFrame {
	public Home(String acc) {
		Font f1 = new Font("Comic Sans MS",Font.BOLD| Font.ITALIC , 13);
		Font f2 = new Font("Segoe UI Emoji",Font.BOLD  , 13);
		Font f3 = new Font("Lucida Sans Unicode",Font.BOLD , 13);
		Font f4 = new Font("Tahoma",Font.PLAIN , 13);

		JFrame f = new JFrame("Home");
		JLabel l1 = new JLabel("Name : ");
		JLabel l2 = new JLabel("Account No. : ");
		JLabel l3 = new JLabel("Phone No. : ");
		JLabel l4 = new JLabel("Adddress : ");
		JLabel l5 = new JLabel("Balance  : ");
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		JLabel l6 = new JLabel("");
		JLabel l7 = new JLabel("");
		JLabel l8 = new JLabel("");
		JLabel l9 = new JLabel("");
		JLabel l10 = new JLabel("");
		JButton b1 = new JButton("Transfer");
		JButton b2 = new JButton("Logout");
		b1.setFont(f2);
		b2.setFont(f2);
		l6.setFont(f3);
		l7.setFont(f3);
		l8.setFont(f3);
		l9.setFont(f3);
		l10.setFont(f3);
		ImageIcon img = new ImageIcon("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\logo.png");
		f.setIconImage(img.getImage());
		f.getContentPane().setBackground(Color.cyan);
		try {
			File file = new File("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\"+acc+".txt");
			Scanner scan = new Scanner(file);
			String add="";
			String s = scan.next();
			l6.setText(s);
			s=scan.next();
			s=scan.next();
			s=scan.next();
			s=scan.next();
			l8.setText(s);
			s=scan.next();
			l7.setText(s);
			s=scan.next();
			l10.setText(s);
			while(scan.hasNext()) {
				add=add+scan.next();
				add=add+" ";
			}
			l9.setText(add);
			scan.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		l1.setBounds(10,10,200,30);
		l2.setBounds(10,50,200,30);
		l3.setBounds(10,90,200,30);
		l4.setBounds(10,130,200,30);
		l5.setBounds(10,170,200,30);
		l6.setBounds(200,10,200,30);
		l7.setBounds(200,50,200,30);
		l8.setBounds(200,90,200,30);
		l9.setBounds(200,130,200,30);
		l10.setBounds(200,170,200,30);
		b1.setBounds(200,210,100,30);
		b2.setBounds(200,250,100,30);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,350);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(b1);
		f.add(b2);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				Transfer t = new Transfer(acc);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void  actionPerformed(ActionEvent e) {
				f.setVisible(false);
				Login l = new Login();
			}
		});
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.red);
		
	}
}
