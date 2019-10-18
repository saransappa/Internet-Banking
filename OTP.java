import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class OTP extends JFrame{
	public OTP(String send,String rec,int amt) {
		JFrame f = new JFrame("Enter OTP");
		Font f1 = new Font("Comic Sans MS",Font.BOLD | Font.ITALIC , 13);
		Font f2 = new Font("Segoe UI Emoji",Font.BOLD  , 13);
		Font f3 = new Font("Lucida Sans Unicode",Font.BOLD , 13);
		Font f4 = new Font("Tahoma",Font.PLAIN , 13);

		ImageIcon img = new ImageIcon("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\logo.png");
		f.setIconImage(img.getImage());
		JLabel l1 = new JLabel("OTP :");
		JTextField tf = new JTextField();
		JButton b1 =new JButton("Submit");
		JButton b2 = new JButton("Cancel");
		b1.setFont(f2);
		b2.setFont(f2);
		f.setSize(300,130);
		f.setVisible(true);
		f.setLayout(null);
		l1.setBounds(50,10,50,20);
		tf.setBounds(110,10,80,20);
		tf.setFont(f4);
		b1.setBounds(40,40,80,20);
		b2.setBounds(150,40,80,20);
		b1.setBackground(Color.GREEN);
		b2.setBackground(Color.RED);
		f.add(l1);
		f.add(tf);
		f.add(b1);
		f.add(b2);
		f.getContentPane().setBackground(Color.yellow);
		Random r=new Random();
		int pin= 100000 + (int)(r.nextDouble() * 99999);
		System.out.println(pin);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ip=Integer.parseInt(tf.getText());
				if(ip==pin) {
					try {
						String add1="";
						String add2="";
						File file1 = new File("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\"+send+".txt");
						Scanner scan1 = new Scanner(file1);
						File file2 = new File("C:\\Users\\saran\\OneDrive\\Desktop\\accounts\\"+rec+".txt");
						Scanner scan2 = new Scanner(file2);
						String [] a1 = new String[8];
						String [] a2 = new String[8];
						for(int i=0;i<7;i++) {
							a1[i] = scan1.next();
							a2[i] = scan2.next();
						}
						while(scan1.hasNext()) {
							add1=add1+scan1.next();
							add1=add1+" ";
						}
						a1[7]=add1;
						while(scan2.hasNext()) {
							add2=add2+scan2.next();
							add2=add2+" ";
						}
						a2[7]=add2;
						int sendbal = Integer.parseInt(a1[6])-amt;
						int recbal = Integer.parseInt(a2[6])+amt;
						a1[6] = new Integer(sendbal).toString();
						a2[6] = new Integer(recbal).toString();
						FileWriter writer1 = new FileWriter(file1);
						FileWriter writer2 = new FileWriter(file2);
						for(int i=0;i<8;i++) {
							writer1.write(a1[i]+"\n");
							writer2.write(a2[i]+"\n");
						}
						writer1.close();
						writer2.close();
						
						scan1.close();
						scan2.close();
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
					f.setVisible(false);
					Message m = new Message(send);
				}
				else {
					l1.setText("invalid OTP");
					l1.setBounds(100,10,100,30);
					tf.setVisible(false);
					b1.setVisible(false);
					b2.setBounds(100,50,80,20);
					
					
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				Transfer t=new Transfer(send);
			}
		});
		
	}
}
