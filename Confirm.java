import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Confirm extends JFrame{
	public Confirm(String acc) {
		super.setVisible(false);
		JFrame f = new JFrame("Confirmation");
		JLabel l1 = new JLabel("Beneficiary name: ");
		JLabel l2 = new JLabel(Transfer.s1);
		JLabel l3 = new JLabel("Beneficiary account no. :");
		JLabel l4 = new JLabel(Transfer.s2);
		JLabel l5 = new JLabel("Amount : ");
		JLabel l6 = new JLabel(Transfer.s4);
		JButton b1 = new JButton("Confirm");
		JButton b2 = new JButton("Cancel");
		ImageIcon img = new ImageIcon("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\logo.png");
		f.setIconImage(img.getImage());
		f.getContentPane().setBackground(Color.pink);
		l1.setBounds(10,10,250,30);
		l2.setBounds(260,10,250,30);
		l3.setBounds(10,50,250,30);
		l4.setBounds(260,50,250,30);
		l5.setBounds(10,90,250,30);
		l6.setBounds(260,90,250,30);
		b1.setBounds(200,130,100,30);
		b2.setBounds(200,170,100,30);
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(500,250);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(b1);
		f.add(b2);
		b1.setBackground(Color.GREEN);
		b2.setBackground(Color.RED);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file1 = new File("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\"+acc+".txt");
					Scanner scan1 = new Scanner(file1);
					File file2 = new File("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\"+Transfer.s1+".txt");
					Scanner scan2 = new Scanner(file2);
					String s="";
					for(int i=0;i<6;i++) {
						s = scan2.next();
					}
					String bal ="";
					for(int i=0;i<7;i++) {
						bal = scan1.next();
					}

					int balance = Integer.parseInt(bal);
					int amt = Integer.parseInt(Transfer.s4);
					if(!file2.exists() || !s.equals(Transfer.s2)) {
						l3.setText("Beneficiary account details invalid");	
						l1.setVisible(false);
						l2.setVisible(false);
						l4.setVisible(false);
						l5.setVisible(false);
						l6.setVisible(false);
						b1.setVisible(false);
						l3.setBounds(150,50,250,30);
					}
					else if( balance-amt < 1000) {
						l3.setText("Balance insufficient");
						l1.setVisible(false);
						l2.setVisible(false);
						l4.setVisible(false);
						l5.setVisible(false);
						l6.setVisible(false);
						b1.setVisible(false);
						l3.setBounds(200,50,250,30);
					}
					else {
						f.setVisible(false);
						OTP o = new OTP(acc,Transfer.s1,amt);
					}
					scan1.close();
					scan2.close();					
				}
				catch(FileNotFoundException exc) {
					l3.setText("Beneficiary account details invalid");	
					l1.setVisible(false);
					l2.setVisible(false);
					l4.setVisible(false);
					l5.setVisible(false);
					l6.setVisible(false);
					b1.setVisible(false);
					l3.setBounds(150,50,250,30);
				}
				catch(Exception exe) {
					exe.printStackTrace();
				}
				
			}	
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				Transfer t=new Transfer(acc);
				
			}
		});
	}

}
