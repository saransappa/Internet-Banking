import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Transfer extends JFrame{
	static String s1,s2,s3,s4;
	public Transfer(String acc) {
		JFrame f = new JFrame("Transfer");
		JLabel l1 = new JLabel("Beneficiary name: ");
		JLabel l2 = new JLabel("Beneficiary account no.: ");
		JLabel l3 = new JLabel("Confirm beneficiary account no.: ");
		JLabel l4 = new JLabel("Amount : ");
		JLabel l5 = new JLabel("* Please cross check the details of benificiary before proceeding.");
		l5.setForeground(Color.red);
		JTextField tf1 = new JTextField();
		JTextField tf2 = new JTextField();
		JTextField tf3 = new JTextField();
		JTextField tf4 = new JTextField();
		
		ImageIcon img = new ImageIcon("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\logo.png");
		f.setIconImage(img.getImage());
		
		JPasswordField pf = new JPasswordField();
		l1.setBounds(10,10,250,20);
		tf1.setBounds(250,10,250,20);
		l2.setBounds(10,40,250,20);
		pf.setBounds(250,40,250,20);
		l3.setBounds(10,70,250,20);
		tf2.setBounds(250,70,250,20);
		l4.setBounds(10,100,250,20);
		tf3.setBounds(250,100,250,20);
		l5.setBounds(90,130,400,20);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(pf);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		tf4.setVisible(false);
		
		JButton b1 = new JButton("Submit");
		JButton b2 = new JButton("Cancel");

		b1.setBounds(220,200,100,20);
		b2.setBounds(220,240,100,20);
		f.setVisible(true);
		f.setLayout(null);
		f.add(b1);
		f.add(b2);
		b1.setBackground(Color.green);
		b2.setBackground(Color.PINK);
		f.setSize(550,350);
		f.getContentPane().setBackground(Color.orange);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				s1= tf1.getText();
				s2 = pf.getText();
				s3 = tf2.getText();
				s4 = tf3.getText();
				if(s2.equals(s3)) {
					f.setVisible(false);
					Confirm c =new Confirm(acc);
				}
				else {
					l5.setText("Account number mismatch");
					l5.setBounds(200,130,400,20);
					l1.setVisible(false);
					l2.setVisible(false);
					l3.setVisible(false);
					l4.setVisible(false);
					tf1.setVisible(false);
					tf2.setVisible(false);
					pf.setVisible(false);
					tf3.setVisible(false);
					tf4.setVisible(false);
					b1.setVisible(false);
					
				}
				
			}	
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				Home h=new Home(acc);
			}
		});
	}
}
