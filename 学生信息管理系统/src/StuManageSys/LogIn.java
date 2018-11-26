package StuManageSys;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.*;

public class LogIn extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//-------------------------------------------------------------�رս���
	public void myclose() {
		this.dispose();
	}
	
	//=============================================================���췽��
	public LogIn() {
		//****************************************************��½���沿������
		this.setTitle("ѧ����Ϣ����ϵͳ--����Ա��¼");
		Container container1=this.getContentPane();
		container1.setLayout(null);
		ImageIcon icon=new ImageIcon(LogIn.class.getResource("LOGO2.jpg"));
		this.setIconImage(icon.getImage());
		//---------------------------------------------------LoGoͼƬ�������
		JPanel jp1=new JPanel();
		java.net.URL img=LogIn.class.getResource("LOGO.png");
		ImageIcon logo=new ImageIcon(img);
		JLabel logos=new JLabel(logo);
		logos.setBounds(0,0,350,200);
		jp1.setLayout(null);
		jp1.add(logos);
		jp1.setBounds(0,0,350,200);
		Color cjp1=new Color(255,250,250);
		jp1.setBackground(cjp1);
		
		//=================================================�˺š������������
		JLabel account=new JLabel("�˺�");
		JLabel pow=new JLabel("����");
		JPanel jp2=new JPanel();
		account.setBounds(50,40,40,30);
		pow.setBounds(50,100,40,30);
		JTextField jt1=new JTextField();
		jt1.setFont(new Font("", 1, 15));
		JPasswordField jt2=new JPasswordField();
		jt2.setEchoChar('*');
		jt2.setFont(new Font("", 1, 20));
		jt1.setBounds(90,40,180,30);
		jt2.setBounds(90,100,180,30);
		jp2.setLayout(null);
		jp2.add(account);
		jp2.add(pow);
		jp2.add(jt1);
		jp2.add(jt2);
		jp2.setBounds(0,200,350,200);
		Color cjp2=new Color(255,250,250);
		jp2.setBackground(cjp2);
		
		//********************************************************��¼ʧ����ʾ
		JLabel tishi=new JLabel("�������˺ź�����");
		tishi.setFont(new Font(" ", 1, 10));
		tishi.setBackground(cjp2);
		tishi.setBounds(130,130,120,20);
		jp2.add(tishi);
		
		//--------------------------------------------------��½���˳���ť�������
		JPanel jp3=new JPanel();
		JButton sure=new JButton("��¼");
		Color cjb1=new Color(255,250,250);
		sure.setBackground(cjb1);
		sure.setFont(new Font("��¼", 1, 18));
		sure.setBounds(100, 50, 150, 50);
		jp3.setLayout(null);
		jp3.setBounds(0,400,350,200);
		jp3.add(sure);
		Color cjp3=new Color(255,250,250);
		jp3.setBackground(cjp3);
		JButton about=new JButton("����");
		about.setBackground(cjb1);
		about.setBounds(260, 130, 60, 25);
		jp3.add(about);
		
		container1.add(jp1);
		container1.add(jp2);
		container1.add(jp3);
		sure.setFocusPainted(false);//��ť����ȥ����
		about.setFocusPainted(false);//��ť����ȥ����
		
		
		class mykeyboard implements KeyListener{         //=========================���̰�enter����¼
			public void keyPressed(java.awt.event.KeyEvent enter) {
				char aa=enter.getKeyChar();
				if(aa=='\n') {
				Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
				int width=(int)(screensize.getWidth()-350)/2;
				int height=(int)(screensize.getHeight()-600)/2;
				String adminaccount=new String("RobenQ");//RobenQ
				String adminpassword = new String("1419276383");//1419276383
				String a=new String(jt2.getPassword());
				if (jt1.getText().equals(adminaccount)&&a.equals(adminpassword)) {
				FirstPage firstPage=new FirstPage();
				firstPage.setBounds(width,height,350,600);
				firstPage.setResizable(false);
				firstPage.setVisible(true);
				firstPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				myclose();
				}
				else {
					tishi.setText("�˺Ż�������󣡣�");
					tishi.setForeground(Color.RED);
				}
				}
			}

			@Override
			public void keyReleased(java.awt.event.KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(java.awt.event.KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		}
		sure.addKeyListener(new mykeyboard());
		jt1.addKeyListener(new mykeyboard());
		jt2.addKeyListener(new mykeyboard());
		about.addKeyListener(new mykeyboard());
		
		//====================================================������¼��ť�����¼�
		class sureAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				//****************************************************�����¼��Ľ���
				Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
				int width=(int)(screensize.getWidth()-350)/2;
				int height=(int)(screensize.getHeight()-600)/2;
				String adminaccount=new String("RobenQ");//RobenQ
				String adminpassword = new String("1419276383");//1419276383
				String a=new String(jt2.getPassword());
				if (jt1.getText().equals(adminaccount)&&a.equals(adminpassword)) {
				FirstPage firstPage=new FirstPage();
				firstPage.setBounds(width,height,350,600);
				firstPage.setResizable(false);
				firstPage.setVisible(true);
				firstPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				myclose();
				}
				else {
					tishi.setText("�˺Ż�������󣡣�");
					tishi.setForeground(Color.RED);
				}
			}
		}
		sure.addActionListener(new sureAction());
		
		
		//====================================================�������ڰ�ť�����¼�
				class aboutAction implements ActionListener {
					public void actionPerformed(ActionEvent e) {
						//****************************************************������ں�Ľ���
						About about=new About();
						Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
						int width=(int)(screensize.getWidth()-350)/2;
						int height=(int)(screensize.getHeight()-350)/2;
						about.setBounds(width, height+100, 350, 375);
						about.setVisible(true);
					}
				}
				about.addActionListener(new aboutAction());
	}
}
