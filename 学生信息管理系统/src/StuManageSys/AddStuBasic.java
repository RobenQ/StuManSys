package StuManageSys;
import StuManageSys.AddStuBasicSure;
import StuManageSys.AddError;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class AddStuBasic extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//-------------------------------------------------------------�رս���
		public void myclose() {
			this.dispose();
		}
	
		public JTextField stubacjt2_1=new JTextField();  //������Ϣ¼���
		public JTextField stubacjt2_2=new JTextField();
		public JTextField stubacjt2_3=new JTextField();
		public JTextField stubacjt2_4=new JTextField();
		public JTextField stubacjt2_5=new JTextField();
		public JTextField stubacjt2_6=new JTextField();
		public JTextField stubacjt2_7=new JTextField();
		public JTextField stubacjt2_8=new JTextField();
	//============================================================���췽��
	public AddStuBasic() {
		this.setTitle("ѧ����Ϣ����ϵͳ--������Ϣ");
		ImageIcon icon=new ImageIcon(LogIn.class.getResource("LOGO2.jpg"));
		this.setIconImage(icon.getImage());
		Container container3=this.getContentPane();
		container3.setLayout(null);
		Color cjp1=new Color(255,250,250);
		Color cjp2=new Color(255,255,224);
		
		//*****************************************¼�������Ϣ������ʾ��ǩ
		JPanel stubacjp1=new JPanel();
		JLabel stubacjl1=new JLabel("¼�������Ϣ",JLabel.CENTER);
		stubacjl1.setBounds(0,0,350,60);
		stubacjl1.setFont(new Font(" ", 0, 18));
		stubacjl1.setBackground(cjp2);
		stubacjp1.setLayout(null);
		stubacjp1.setBounds(0,0,350,60);
		stubacjp1.add(stubacjl1);
		stubacjp1.setBackground(cjp2);
		
		//-------------------------------------------------- ¼����Ŀ�������
		JPanel stubacjp2_1=new JPanel();
		JPanel stubacjp2_2=new JPanel();
		JPanel stubacjp2_3=new JPanel();
		JPanel stubacjp2_4=new JPanel();
		JPanel stubacjp2_5=new JPanel();
		JPanel stubacjp2_6=new JPanel();
		JPanel stubacjp2_7=new JPanel();
		JPanel stubacjp2_8=new JPanel();
		JLabel stubacjl2_1=new JLabel("ѧ      �ţ�",JLabel.CENTER);//��ǩ��ʾ��������
		JLabel stubacjl2_2=new JLabel("��      ����",JLabel.CENTER);
		JLabel stubacjl2_3=new JLabel("��      ��",JLabel.CENTER);
		JLabel stubacjl2_4=new JLabel("��      �䣺",JLabel.CENTER);
		JLabel stubacjl2_5=new JLabel("�� �� �ţ�",JLabel.CENTER);
		JLabel stubacjl2_6=new JLabel("������ò��",JLabel.CENTER);
		JLabel stubacjl2_7=new JLabel("��ϵ��ʽ��",JLabel.CENTER);
		JLabel stubacjl2_8=new JLabel("��ͥסַ��",JLabel.CENTER);
		stubacjp2_1.setBounds(0, 60, 350, 50);      //������С
		stubacjp2_2.setBounds(0, 110, 350, 50);
		stubacjp2_3.setBounds(0, 160, 350, 50);
		stubacjp2_4.setBounds(0, 210, 350, 50);
		stubacjp2_5.setBounds(0, 260, 350, 50);
		stubacjp2_6.setBounds(0, 310, 350, 50);
		stubacjp2_7.setBounds(0, 360, 350, 50);
		stubacjp2_8.setBounds(0, 410, 350, 50);
		stubacjl2_1.setBounds(20, 0, 80, 40);      //��ǩ��С
		stubacjl2_2.setBounds(20, 0, 80, 40);
		stubacjl2_3.setBounds(20, 0, 80, 40);
		stubacjl2_4.setBounds(20, 0, 80, 40);
		stubacjl2_5.setBounds(20, 0, 80, 40);
		stubacjl2_6.setBounds(20, 0, 80, 40);
		stubacjl2_7.setBounds(20, 0, 80, 40);
		stubacjl2_8.setBounds(20, 0, 80, 40);
		stubacjt2_1.setBounds(100, 10, 200, 30);     //��Ϣ¼�������
		stubacjt2_2.setBounds(100, 10, 200, 30);
		stubacjt2_3.setBounds(100, 10, 200, 30);
		stubacjt2_4.setBounds(100, 10, 200, 30);
		stubacjt2_5.setBounds(100, 10, 200, 30);
		stubacjt2_6.setBounds(100, 10, 200, 30);
		stubacjt2_7.setBounds(100, 10, 200, 30);
		stubacjt2_8.setBounds(100, 10, 200, 30);
		stubacjp2_1.setLayout(null);          //�������ַ�ʽ
		stubacjp2_2.setLayout(null);
		stubacjp2_3.setLayout(null);
		stubacjp2_4.setLayout(null);
		stubacjp2_5.setLayout(null);
		stubacjp2_6.setLayout(null);
		stubacjp2_7.setLayout(null);
		stubacjp2_8.setLayout(null);
		stubacjp2_1.add(stubacjl2_1);//�����ǩ
		stubacjp2_2.add(stubacjl2_2);
		stubacjp2_3.add(stubacjl2_3);
		stubacjp2_4.add(stubacjl2_4);
		stubacjp2_5.add(stubacjl2_5);
		stubacjp2_6.add(stubacjl2_6);
		stubacjp2_7.add(stubacjl2_7);
		stubacjp2_8.add(stubacjl2_8);
		stubacjp2_1.add(stubacjt2_1);//������Ϣ¼���
		stubacjp2_2.add(stubacjt2_2);
		stubacjp2_3.add(stubacjt2_3);
		stubacjp2_4.add(stubacjt2_4);
		stubacjp2_5.add(stubacjt2_5);
		stubacjp2_6.add(stubacjt2_6);
		stubacjp2_7.add(stubacjt2_7);
		stubacjp2_8.add(stubacjt2_8);
		stubacjp2_1.setBackground(cjp1);//����������ɫ
		stubacjp2_2.setBackground(cjp1);
		stubacjp2_3.setBackground(cjp1);
		stubacjp2_4.setBackground(cjp1);
		stubacjp2_5.setBackground(cjp1);
		stubacjp2_6.setBackground(cjp1);
		stubacjp2_7.setBackground(cjp1);
		stubacjp2_8.setBackground(cjp1);
		
		
		//===============================================ȷ��¼����Ϣ���
		JPanel stubacjp3=new JPanel();
		stubacjp3.setBounds(0, 460, 350, 140); //¼�밴ť
		stubacjp3.setLayout(null);
		stubacjp3.setBackground(cjp1);
		JButton stubacjp3jb1=new JButton("¼��");
		stubacjp3jb1.setBackground(cjp2);
		stubacjp3jb1.setBounds(120, 30, 100, 30);
		stubacjp3.add(stubacjp3jb1);
		JButton stubacjp3jb2=new JButton("����");  //���ذ�ť
		stubacjp3jb2.setBackground(cjp1);
		stubacjp3jb2.setBounds(260, 80, 70, 20);
		stubacjp3.add(stubacjp3jb2);
		stubacjp3jb1.setFocusPainted(false);
		stubacjp3jb2.setFocusPainted(false);
		
		
		container3.add(stubacjp1);
		container3.add(stubacjp2_1);
		container3.add(stubacjp2_2);
		container3.add(stubacjp2_3);
		container3.add(stubacjp2_4);
		container3.add(stubacjp2_5);
		container3.add(stubacjp2_6);
		container3.add(stubacjp2_7);
		container3.add(stubacjp2_8);
		container3.add(stubacjp3);
		
		
		//================================================������ذ�ť��Ľ���
		class  stubacjp3jb2Action implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				myclose();
			}
		}
		 stubacjp3jb2.addActionListener(new  stubacjp3jb2Action());
		 
		//================================================���¼�밴ť��Ľ���
		 class  stubacjp3jb1Action implements ActionListener{
			 public void actionPerformed(ActionEvent e) {
				if (stubacjt2_1.getText().equals("")|stubacjt2_2.getText().equals("")|stubacjt2_3.getText().equals("")|
					stubacjt2_4.getText().equals("")|stubacjt2_5.getText().equals("")|stubacjt2_6.getText().equals("")|
					stubacjt2_7.getText().equals("")|stubacjt2_8.getText().equals("")) {
					Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
					int width=(int)(screensize.getWidth()-300)/2;
					int height=(int)(screensize.getHeight()-200)/2;
					AddError addError=new AddError();
					addError.setBounds( width, height, 300, 200);
					addError.setVisible(true);		
				}
				else {
				Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
				int width=(int)(screensize.getWidth()-350)/2;
				int height=(int)(screensize.getHeight()-600)/2;
				AddStuBasicSure sureLuRu=new AddStuBasicSure();
				sureLuRu.setAlwaysOnTop(true);
				sureLuRu.setVisible(true);
				sureLuRu.setBounds(width, height+90, 350, 510);
				sureLuRu.stubacjt2_1.setText(stubacjt2_1.getText());
				sureLuRu.stubacjt2_2.setText(stubacjt2_2.getText());
				sureLuRu.stubacjt2_3.setText(stubacjt2_3.getText());
				sureLuRu.stubacjt2_4.setText(stubacjt2_4.getText());
				sureLuRu.stubacjt2_5.setText(stubacjt2_5.getText());
				sureLuRu.stubacjt2_6.setText(stubacjt2_6.getText());
				sureLuRu.stubacjt2_7.setText(stubacjt2_7.getText());
				sureLuRu.stubacjt2_8.setText(stubacjt2_8.getText());
				}
			}
		}
		stubacjp3jb1.addActionListener(new  stubacjp3jb1Action());
	}

}
