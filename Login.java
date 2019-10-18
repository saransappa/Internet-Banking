import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class Login extends JFrame {
	public Login() {
		Font f1 = new Font("Comic Sans MS",Font.BOLD | Font.ITALIC , 13);
		Font f2 = new Font("Segoe UI Emoji",Font.BOLD  , 13);
		Font f3 = new Font("Lucida Sans Unicode",Font.BOLD , 13);
		Font f4 = new Font("Tahoma",Font.PLAIN , 13);

		JFrame f=new JFrame("Login / SignUp");
		JLabel l1=new JLabel("Username :");
		JLabel l2=new JLabel("Password :");
		JTextField tf1=new JTextField();
		JPasswordField pf=new JPasswordField();
		JButton b1=new JButton("Login");
		JButton b2=new JButton("Signup");
		JButton b3 = new JButton("Exit");
		l1.setBounds(40,10,100,30);
		l1.setForeground(Color.blue);
		l1.setFont(f1);
		l2.setBounds(40,50,100,30);
		l2.setForeground(Color.blue);
		l2.setFont(f1);
		tf1.setBounds(150,10,150,30);
		tf1.setFont(f4);
		pf.setBounds(150,50,150,30);
		b1.setBounds(70,90,100,30);
		b2.setBounds(220,90,100,30);
		b3.setBounds(140,140,100,30);
		b1.setFont(f2);
		b2.setFont(f2);
		b3.setFont(f2);
		f.setSize(400,220);
		f.setLayout(null);
		f.setVisible(true);
		f.add(l1);
		f.add(l2);
		f.add(tf1);
		f.add(pf);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		ImageIcon img = new ImageIcon("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\logo.png");
		f.setIconImage(img.getImage());
		f.getContentPane().setBackground(Color.yellow);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user=tf1.getText();
				String pass=pf.getText();
				File file=new File("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\"+user+".txt");
				if(!file.exists()) {
					JLabel l3 = new JLabel("Invalid credentials!");
					l3.setBounds(140,10,220,30);
					f.add(l3);
					
					l1.setVisible(false);
					l2.setVisible(false);
					tf1.setVisible(false);
					pf.setVisible(false);
					b1.setVisible(false);
					b2.setBounds(140,90,100,30);
					
				}
				else {
					String s="";
					try {
						Scanner scan = new Scanner(file);
						s =scan.next();
						s=scan.next();
						scan.close();
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
					if(s.equals(pass)) {
						f.setVisible(false);
						Home h = new Home(user);
					}
					else {
						JLabel l3 = new JLabel("Invalid credentials!");
						l3.setBounds(140,10,220,30);
						f.add(l3);
						
						l1.setVisible(false);
						l2.setVisible(false);
						tf1.setVisible(false);
						pf.setVisible(false);
						b1.setVisible(false);
						b2.setBounds(140,90,100,30);
						
					}
					
				}}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				Registration r = new Registration();
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				System.exit(0);
			}
		});
		b1.setBackground(Color.green);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.red);
	}
}
