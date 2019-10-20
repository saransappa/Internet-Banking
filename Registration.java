import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.io.*;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.util.Random;
public class Registration {
public Registration() {
		Font f1 = new Font("Comic Sans MS",Font.BOLD | Font.ITALIC , 13);
		Font f2 = new Font("Segoe UI Emoji",Font.BOLD  , 13);
		Font f3 = new Font("Lucida Sans Unicode",Font.BOLD , 13);
		Font f4 = new Font("Tahoma",Font.PLAIN , 13);

		JFrame f = new JFrame("Registration Form");
		f.setSize(350, 480);
		f.setVisible(true);
		f.setBackground(Color.YELLOW);
		f.setLayout(null);
		
		ImageIcon img = new ImageIcon("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\logo.png");
		f.setIconImage(img.getImage());
		
		JLabel l0 = new JLabel("Enter your details");
		l0.setBounds(110,10,100,50);
		l0.setVisible(true);
		f.add(l0);
		l0.setFont(f2);
		f.getContentPane().setBackground(Color.cyan);
		
		JLabel l1 = new JLabel("Username :");
		l1.setBounds(50,50,100,30);
		l1.setVisible(true);
		f.add(l1);
		
		JLabel l2 = new JLabel("Password :");
		l2.setBounds(50,80,100,30);
		l2.setVisible(true);
		f.add(l2);
		
		JLabel l3 = new JLabel("Confirm   :");
		l3.setBounds(50,110,100,30);
		l3.setVisible(true);
		f.add(l3);
		
		JLabel l4 = new JLabel("Gender    :");
		l4.setBounds(50,140,100,30);
		l4.setVisible(true);
		f.add(l4);
		
		
		
		JLabel l6 = new JLabel("Country :");
		l6.setBounds(50,315,100,30);
		l6.setVisible(true);
		f.add(l6);
		
		JTextField tf = new JTextField();
		tf.setBounds(130,55,150,23);
		tf.setVisible(true);
		f.add(tf);
		tf.setFont(f4);
		
		JPasswordField pf1 = new JPasswordField();
		pf1.setBounds(130,85,150,23);
		pf1.setVisible(true);
		f.add(pf1);
		
		JPasswordField pf2 = new JPasswordField();
		pf2.setBounds(130,115,150,23);
		pf2.setVisible(true);
		f.add(pf2);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(130,145,150,23);
		r1.setVisible(true);
		
		f.add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(130,175,150,23);
		r2.setVisible(true);
		f.add(r2);
		r1.setBackground(Color.CYAN);
		r2.setBackground(Color.CYAN);
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		
		String [] country = {"","India", "USA", "UK", "Australia", "Russia"};
		JComboBox <String>  jcb1 = new JComboBox<String>(country);
		jcb1.setBounds(130,320,150,23);
		jcb1.setVisible(true);
		f.add(jcb1);
		jcb1.setFont(f2);
		
		JLabel l7 = new JLabel("Submitted Successfully!");
		l7.setBounds(95,200,200,40);
		l7.setVisible(false);
		f.add(l7);
		l7.setForeground(Color.blue);
		
		JLabel l8 = new JLabel("Address : ");
		l8.setBounds(50,200,70,30);
		f.add(l8);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(130,200,200,100);
		f.add(ta);
		ta.setFont(f4);
		
		JLabel l9 = new JLabel("Phone No. : ");
		l9.setBounds(50,350,100,30);
		f.add(l9);
		
		JTextField tf1 = new JTextField();
		tf1.setBounds(130,350,150,23);
		f.add(tf1);
		tf1.setFont(f4);
		
		JButton b2 = new JButton("Cancel");
		b2.setBounds(190,400,75,25);
		b2.setVisible(true);
		b2.setBackground(Color.ORANGE);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JButton b3 = new JButton("Login");
		b3.setBounds(123,330,75,25);
		b3.setBackground(Color.green);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				Login l =  new Login();
			}
		});
		b3.setVisible(false);
		f.add(b3);
		
		JButton b4 = new JButton("Close");
		b4.setBounds(123,360,75,25);
		b4.setBackground(Color.pink);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		b4.setVisible(false);
		f.add(b4);
		
		JButton b1 = new JButton("Submit");
		b1.setBounds(70,400,75,25);
		b1.setVisible(true);
		b1.setBackground(Color.GREEN);
		b1.setFont(f2);
		b2.setFont(f2);
		b3.setFont(f2);
		b4.setFont(f2);
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		l9.setFont(f1);
		r1.setFont(f3);
		r2.setFont(f3);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gend=new  String();
				String name = tf.getText();
				String pass=new String();
				String coun=new String();
				String phone = new String();
				String pass1 = new String(pf1.getPassword());
				String pass2 = new String(pf2.getPassword());
				if(r1.isSelected()) {
					gend="MALE";
				}
				else if(r2.isSelected()) {
					gend="FEMALE";
				}
				
				coun = (String)jcb1.getItemAt(jcb1.getSelectedIndex());
				phone = tf1.getText();
				String addr = ta.getText();
				addr= addr.replace("\n", " ");

				if(name!=""&&pf1.getText()!=""&&jcb1.getSelectedIndex()!=0&&gend!=""&&phone.length()==10 && addr!="") {
					if(!pass1.equals(pass2)) {
						f.setTitle("Submission failed");
						l7.setText("Password mismatch!");
					}
					else {
						pass=pass1;
						try {
							File file = new File("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\"+name+".txt");
							if(file.createNewFile()) {
								Random r = new Random();
								int accno = 1000000000 + (int)(r.nextDouble() * 999999999);

								FileWriter writer = new FileWriter(file);
								writer.write(name+"\n"+pass+"\n"+gend+"\n"+coun+"\n"+phone+"\n"+accno+"\n"+"2500"+"\n"+addr);
								writer.close();
							}
							else {
								f.setTitle("Submission failed");
								l7.setText("Credentials already exists");
							}
						}
						catch(Exception exc) {
							exc.printStackTrace();
						}
				}}
				else {
					f.setTitle("Submission failed");
					l7.setText("fill  all  the details");
					}
				
				
				
				l0.setVisible(false);
				l1.setVisible(false);
				l2.setVisible(false);
				l3.setVisible(false);
				l4.setVisible(false);
				l6.setVisible(false);
				l7.setVisible(true);
				tf.setVisible(false);
				pf1.setVisible(false);
				pf2.setVisible(false);
				r1.setVisible(false);
				r2.setVisible(false);
				jcb1.setVisible(false);
				b1.setVisible(false);
				b2.setVisible(false);
				b3.setVisible(true);
				b4.setVisible(true);
				ta.setVisible(false);
				tf1.setVisible(false);
				l9.setVisible(false);
				l8.setVisible(false);
			}
		});
		f.add(b1);
		f.add(b2);
	}
}
