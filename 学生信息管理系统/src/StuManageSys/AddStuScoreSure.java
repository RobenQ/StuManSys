package StuManageSys;
import StuManageSys.AddSuccessful;
import StuManageSys.AllWays;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddStuScoreSure extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//-------------------------------------------------------------关闭界面
	public void myclose() {
		this.dispose();
	}
	
	public JLabel stubacjt2_1=new JLabel();  //基本信息录入框
	public JLabel stubacjt2_2=new JLabel();
	public JLabel stubacjt2_3=new JLabel();
	public JLabel stubacjt2_4=new JLabel();
	public JLabel stubacjt2_5=new JLabel();
	public JLabel stubacjt2_6=new JLabel();
	public JLabel stubacjt2_7=new JLabel();
	public JLabel stubacjt2_8=new JLabel();
	
	public AddStuScoreSure() {
		setTitle("学生信息管理系统--信息确定");
		ImageIcon icon=new ImageIcon(LogIn.class.getResource("LOGO2.jpg"));
		this.setIconImage(icon.getImage());
		this.setResizable(false);
		Container container=this.getContentPane();
		container.setLayout(null);
		Color cjp1=new Color(255,250,250);
		Color cjp2=new Color(255,228,225);
		container.setBackground(cjp1);
		
		//*****************************************确定录入学生基本信息功能提示
		JPanel AddStuScoreSurejp1=new JPanel();
		JLabel stubacjl1=new JLabel("核对成绩",JLabel.CENTER);
		stubacjl1.setBounds(0,0,350,60);
		stubacjl1.setFont(new Font(" ", 1, 15));
		stubacjl1.setBackground(cjp2);
		AddStuScoreSurejp1.setBounds(0,0,350,60);
		AddStuScoreSurejp1.setLayout(null);
		AddStuScoreSurejp1.add(stubacjl1);
		AddStuScoreSurejp1.setBackground(cjp2);
		
		//*****************************************录入信息提示面板
		JPanel AddStuScoreSurejp2=new JPanel();
		AddStuScoreSurejp2.setBackground(cjp1);
		AddStuScoreSurejp2.setBounds(0, 60, 350, 350);
		JLabel stubacjl2_1=new JLabel("英      语：",JLabel.CENTER);//标签提示字体设置
		JLabel stubacjl2_2=new JLabel("离散数学：",JLabel.CENTER);
		JLabel stubacjl2_3=new JLabel("数      电：",JLabel.CENTER);
		JLabel stubacjl2_4=new JLabel("模      电：",JLabel.CENTER);
		JLabel stubacjl2_5=new JLabel("大学体育：",JLabel.CENTER);
		JLabel stubacjl2_6=new JLabel("概 率 论  ：",JLabel.CENTER);
		JLabel stubacjl2_7=new JLabel("近代纲要：",JLabel.CENTER);
		JLabel stubacjl2_8=new JLabel("形势政策：",JLabel.CENTER);
		stubacjl2_1.setBounds(20, 0, 80, 40);      //标签大小
		stubacjl2_2.setBounds(20, 40, 80, 40);
		stubacjl2_3.setBounds(20, 80, 80, 40);
		stubacjl2_4.setBounds(20, 120, 80, 40);
		stubacjl2_5.setBounds(20, 160, 80, 40);
		stubacjl2_6.setBounds(20, 200, 80, 40);
		stubacjl2_7.setBounds(20, 240, 80, 40);
		stubacjl2_8.setBounds(20, 280, 80, 40);
		stubacjt2_1.setBounds(100, 5,200, 30);     //信息录入框设置
		stubacjt2_2.setBounds(100, 45, 200, 30);
		stubacjt2_3.setBounds(100, 85, 200, 30);
		stubacjt2_4.setBounds(100, 125, 200,30);
		stubacjt2_5.setBounds(100, 165, 200, 30);
		stubacjt2_6.setBounds(100, 205, 200, 30);
		stubacjt2_7.setBounds(100, 245, 200, 30);
		stubacjt2_8.setBounds(100, 285, 200, 30);
		stubacjt2_1.setEnabled(false);     //设置标签为不可用
		stubacjt2_2.setEnabled(false);
		stubacjt2_3.setEnabled(false);
		stubacjt2_4.setEnabled(false);
		stubacjt2_5.setEnabled(false);
		stubacjt2_6.setEnabled(false);
		stubacjt2_7.setEnabled(false);
		stubacjt2_8.setEnabled(false);
		AddStuScoreSurejp2.setLayout(null);          //容器布局方式
		AddStuScoreSurejp2.add(stubacjl2_1);//加入标签
		AddStuScoreSurejp2.add(stubacjl2_2);
		AddStuScoreSurejp2.add(stubacjl2_3);
		AddStuScoreSurejp2.add(stubacjl2_4);
		AddStuScoreSurejp2.add(stubacjl2_5);
		AddStuScoreSurejp2.add(stubacjl2_6);
		AddStuScoreSurejp2.add(stubacjl2_7);
		AddStuScoreSurejp2.add(stubacjl2_8);
		AddStuScoreSurejp2.add(stubacjt2_1);//加入信息录入框
		AddStuScoreSurejp2.add(stubacjt2_2);
		AddStuScoreSurejp2.add(stubacjt2_3);
		AddStuScoreSurejp2.add(stubacjt2_5);
		AddStuScoreSurejp2.add(stubacjt2_4);
		AddStuScoreSurejp2.add(stubacjt2_6);
		AddStuScoreSurejp2.add(stubacjt2_7);
		AddStuScoreSurejp2.add(stubacjt2_8);
		AddStuScoreSurejp2.setBackground(cjp1);//容器背景颜色
		
		//*****************************************后续操作
		JPanel AddStuScoreSurejp3 =new JPanel();
		JButton AddStuScoreSurejb1=new JButton("录入");
		AddStuScoreSurejb1.setFont(new Font(" ", 1, 13));
		AddStuScoreSurejb1.setBounds(60, 15, 70, 35);
		AddStuScoreSurejb1.setBackground(cjp2);
		JButton AddStuScoreSurejb2=new JButton("修改");
		AddStuScoreSurejb2.setFont(new Font(" ", 1, 13));
		AddStuScoreSurejb2.setBounds(220, 15, 70, 35);
		AddStuScoreSurejb2.setBackground(cjp1);
		AddStuScoreSurejp3.setBounds(0, 410, 350, 60);
		AddStuScoreSurejp3.setLayout(null);
		AddStuScoreSurejp3.setBackground(cjp1);
		AddStuScoreSurejp3.add(AddStuScoreSurejb1);
		AddStuScoreSurejp3.add(AddStuScoreSurejb2);
		AddStuScoreSurejb1.setFocusPainted(false);
		AddStuScoreSurejb2.setFocusPainted(false);
		
		
		container.add(AddStuScoreSurejp1);
		container.add(AddStuScoreSurejp2);
		container.add(AddStuScoreSurejp3);
		
		//================================================点击录入按钮后的界面
		class  AddStuScoreSurejb1Action implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
				int width=(int)(screensize.getWidth()-300)/2;
				int height=(int)(screensize.getHeight()-200)/2;
				myclose();
				AddSuccessful addSuccessful=new AddSuccessful();
				String s1=stubacjt2_1.getText();
				String s2=stubacjt2_2.getText();
				String s3=stubacjt2_3.getText();
				String s4=stubacjt2_4.getText();
				String s5=stubacjt2_5.getText();
				String s6=stubacjt2_6.getText();
				String s7=stubacjt2_7.getText();
				String s8=stubacjt2_8.getText();
				String sa="D:\\成绩信息.txt";
				String sb=s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" "+s7+" "+s8;
				AllWays.add(sa,sb);
				addSuccessful.setBounds( width, height, 300, 200);
				addSuccessful.setVisible(true);		
			}
		}
		AddStuScoreSurejb1.addActionListener(new  AddStuScoreSurejb1Action());
				
		//================================================点击修改按钮后的界面
		class  AddStuScoreSurejb2Action implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				myclose();				
			}
		}
		AddStuScoreSurejb2.addActionListener(new  AddStuScoreSurejb2Action());
	}
}
