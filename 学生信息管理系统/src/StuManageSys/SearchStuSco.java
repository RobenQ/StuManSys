package StuManageSys;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;

public class SearchStuSco extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JLabel stubacjt2_1=new JLabel();
	public JLabel stubacjt2_2=new JLabel();
	public JLabel stubacjt2_3=new JLabel();
	public JLabel stubacjt2_4=new JLabel();
	public JLabel stubacjt2_5=new JLabel();
	public JLabel stubacjt2_6=new JLabel();
	public JLabel stubacjt2_7=new JLabel();
	public JLabel stubacjt2_8=new JLabel();
	public JTextField SearchStuScojp2jt1=new JTextField();
	
	//-------------------------------------------------------------关闭界面
			public void myclose() {
				this.dispose();
			}
			
		//=============================================================构造方法
		public SearchStuSco() {
			// TODO Auto-generated constructor stub
			//****************************************************登陆界面部分属性
			this.setTitle("学生信息管理系统--查询成绩信息");
			ImageIcon icon=new ImageIcon(LogIn.class.getResource("LOGO2.jpg"));
			this.setIconImage(icon.getImage());
			Container container1=this.getContentPane();
			container1.setLayout(null);
			Color cjp1=new Color(255,250,250);
			Color cjp2=new Color(255,228,225);
			container1.setBackground(cjp1);
			
			//=================================================功能提示面板
			JPanel SearchStuScojp1=new JPanel();
			JLabel SearchStuScojp1jl1=new JLabel("查询",JLabel.CENTER);
			SearchStuScojp1jl1.setFont(new Font("查询", 1, 18));
			SearchStuScojp1jl1.setBounds(0, 0, 350, 60);
			SearchStuScojp1jl1.setBackground(cjp2);
			SearchStuScojp1.setLayout(null);
			SearchStuScojp1.setBounds(0,0,350,60);
			SearchStuScojp1.setBackground(cjp2);
			SearchStuScojp1.add(SearchStuScojp1jl1);
			
			//------------------------------------------------具体选项
			JPanel  SearchStuScojp2=new JPanel();
			SearchStuScojp2.setBounds(0, 60, 350, 60);
			SearchStuScojp2.setLayout(null);
			SearchStuScojp2.setBackground(cjp1);
			JLabel SearchStuScojp2jl1=new JLabel("查询方式：",JLabel.CENTER);
			SearchStuScojp2jl1.setBounds(20, 5, 65, 20);
			JLabel SearchStuScojp2jl2=new JLabel("查询内容：",JLabel.CENTER);
			SearchStuScojp2jl2.setBounds(20, 40, 65, 20);
			//JTextField SearchStuScojp2jt1=new JTextField();
			SearchStuScojp2jt1.setBounds(80, 40, 200, 20);
			JComboBox<String>jc=new JComboBox<>(new MyComboBoxs());
			jc.setBounds(80, 5, 200, 20);
			jc.setBackground(cjp2);
			SearchStuScojp2.add(SearchStuScojp2jl1);
			SearchStuScojp2.add(SearchStuScojp2jl2);
			SearchStuScojp2.add(jc);
			SearchStuScojp2.add( SearchStuScojp2jt1);
			
			JPanel SearchStuScojp2_1=new JPanel();
			SearchStuScojp2_1.setBounds(0, 120, 350, 340);
			SearchStuScojp2_1.setLayout(null);
			SearchStuScojp2_1.setBackground(cjp1);
			stubacjt2_1.setEnabled(false);
			stubacjt2_2.setEnabled(false);
			stubacjt2_3.setEnabled(false);
			stubacjt2_4.setEnabled(false);
			stubacjt2_5.setEnabled(false);
			stubacjt2_6.setEnabled(false);
			stubacjt2_7.setEnabled(false);
			stubacjt2_8.setEnabled(false);
			stubacjt2_1.setBounds(0, 5,350, 40);
			stubacjt2_2.setBounds(0, 45, 350, 40);
			stubacjt2_3.setBounds(0, 85, 350,40);
			stubacjt2_3.setBounds(0, 125, 350,40);
			stubacjt2_5.setBounds(0, 165,350, 40);
			stubacjt2_7.setBounds(0, 245,350, 40);
			stubacjt2_8.setBounds(0, 285, 350, 40);
			stubacjt2_6.setBounds(0, 205,  350, 40);
			
			Vector<String> vector=new Vector<>();//===============滚动面板
			JList<String> jsp1=new JList<>(vector);
			
			//===============================================确定录入信息面板
			JPanel SearchStuScojp3=new JPanel();
			SearchStuScojp3.setBounds(0, 460, 350, 140); //录入按钮
			SearchStuScojp3.setLayout(null);
			SearchStuScojp3.setBackground(cjp1);
			JButton SearchStuScojp3jb1=new JButton("查询");
			SearchStuScojp3jb1.setBackground(cjp2);
			SearchStuScojp3jb1.setBounds(120, 30, 100, 30);
			SearchStuScojp3.add(SearchStuScojp3jb1);
			JButton SearchStuScojp3jb2=new JButton("返回");  //返回按钮
			SearchStuScojp3jb2.setBackground(cjp1);
			SearchStuScojp3jb2.setBounds(260, 80, 70, 20);
			SearchStuScojp3.setBackground(cjp1);
			SearchStuScojp3.add(SearchStuScojp3jb2);
			SearchStuScojp3jb1.setFocusPainted(false);
			SearchStuScojp3jb2.setFocusPainted(false);
			
			
			container1.add(SearchStuScojp1);
			container1.add(SearchStuScojp2);
			container1.add(SearchStuScojp2_1);
			container1.add(SearchStuScojp3);
			
			//================================================点击返回按钮后的界面
			class  SearchStuScojp3jb2Action implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					myclose();			
				}
			}
			SearchStuScojp3jb2.addActionListener(new  SearchStuScojp3jb2Action());
			
			//================================================点击查询按钮后的界面
			class SearchStuScojp3jb1Action implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					String s1="D:\\成绩信息.txt";
					AllWays allway=new AllWays();
					int k=allway.read(s1);
					String s2=(String)jc.getSelectedItem();
					String ss=SearchStuScojp2jt1.getText();
					switch (s2) {
					case "学号":{
						int i,j,num=0;
						String labs[]=new String[300];
						j=0;
						for (i = 0; i<k; i++)
							if (allway.s[i].stu1.equals(ss)) {
								num++;
								j=i;
								labs[i]="学      号："+allway.s[j].stu1+"   "+"姓      名："+allway.s[j].stu2;
								vector.add(labs[i]);
							}
							if(num==1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(stubacjt2_1);
								SearchStuScojp2_1.add(stubacjt2_2);
								SearchStuScojp2_1.add(stubacjt2_3);
								SearchStuScojp2_1.add(stubacjt2_4);
								SearchStuScojp2_1.add(stubacjt2_5);
								SearchStuScojp2_1.add(stubacjt2_6);
								SearchStuScojp2_1.add(stubacjt2_7);
								SearchStuScojp2_1.add(stubacjt2_8);
								stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
								stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
								stubacjt2_3.setText("       数      电："+allway.s[j].stu3);
								stubacjt2_4.setText("       模      电："+allway.s[j].stu4);
								stubacjt2_5.setText("       英       语："+allway.s[j].stu5);
								stubacjt2_6.setText("       概 率 论  ："+allway.s[j].stu6);
								stubacjt2_7.setText("       离散数学："+allway.s[j].stu7);
								stubacjt2_8.setText("       大学体育："+allway.s[j].stu8);
								SearchStuScojp2_1.updateUI();
							}
							if(num==0) { 
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num>1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(jsp1);
								jsp1.setBounds(0, 5, 350, 340);
								jsp1.setBackground(cjp1);
								SearchStuScojp2_1.updateUI();
							}
						break;
					}
					case "姓名":{
						int i,j,num=0;
						String labs[]=new String[300];
						j=0;
						for (i = 0; i<k; i++)
							if (allway.s[i].stu2.equals(ss)) {
								num++;
								j=i;
								labs[i]="姓      名："+allway.s[j].stu2+"   "+"学      号："+allway.s[j].stu1;
							}
							if(num==1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(stubacjt2_1);
								SearchStuScojp2_1.add(stubacjt2_2);
								SearchStuScojp2_1.add(stubacjt2_3);
								SearchStuScojp2_1.add(stubacjt2_4);
								SearchStuScojp2_1.add(stubacjt2_5);
								SearchStuScojp2_1.add(stubacjt2_6);
								SearchStuScojp2_1.add(stubacjt2_7);
								SearchStuScojp2_1.add(stubacjt2_8);
								stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
								stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
								stubacjt2_3.setText("       数      电："+allway.s[j].stu3);
								stubacjt2_4.setText("       模      电："+allway.s[j].stu4);
								stubacjt2_5.setText("       英       语："+allway.s[j].stu5);
								stubacjt2_6.setText("       概 率 论  ："+allway.s[j].stu6);
								stubacjt2_7.setText("       离散数学："+allway.s[j].stu7);
								stubacjt2_8.setText("       大学体育："+allway.s[j].stu8);
								SearchStuScojp2_1.updateUI();
							}
							if(num==0) { 
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num>1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(jsp1);
								jsp1.setBounds(0, 5, 350, 340);
								jsp1.setBackground(cjp1);
								SearchStuScojp2_1.updateUI();
							}
						break;
					}
					case "数电成绩":{
						int i,j,num=0;
						String labs[]=new String[300];
						j=0;
						for (i = 0; i<k; i++)
							if (allway.s[i].stu3.equals(ss)) {
								num++;
								j=i;
								
								labs[i]="姓      名："+allway.s[j].stu2+"   "+"学      号："+allway.s[j].stu1+"   "+"数      电："+allway.s[j].stu3;
							}
							if(num==1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(stubacjt2_1);
								SearchStuScojp2_1.add(stubacjt2_2);
								SearchStuScojp2_1.add(stubacjt2_3);
								SearchStuScojp2_1.add(stubacjt2_4);
								SearchStuScojp2_1.add(stubacjt2_5);
								SearchStuScojp2_1.add(stubacjt2_6);
								SearchStuScojp2_1.add(stubacjt2_7);
								SearchStuScojp2_1.add(stubacjt2_8);
								stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
								stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
								stubacjt2_3.setText("       数      电："+allway.s[j].stu3);
								stubacjt2_4.setText("       模      电："+allway.s[j].stu4);
								stubacjt2_5.setText("       英       语："+allway.s[j].stu5);
								stubacjt2_6.setText("       概 率 论  ："+allway.s[j].stu6);
								stubacjt2_7.setText("       离散数学："+allway.s[j].stu7);
								stubacjt2_8.setText("       大学体育："+allway.s[j].stu8);
								SearchStuScojp2_1.updateUI();
							}
							if(num==0) { 
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num>1) {
								SearchStuScojp2_1.removeAll();								SearchStuScojp2_1.add(jsp1);
								jsp1.setBounds(0, 5, 350, 340);
								jsp1.setBackground(cjp1);
								SearchStuScojp2_1.updateUI();
							}
						break;
					}
					case "模电成绩":{
						int i,j,num=0;
						String labs[]=new String[300];
						j=0;
						for (i = 0; i<k; i++)
							if (allway.s[i].stu4.equals(ss)) {
								num++;
								j=i;
								labs[i]="姓      名："+allway.s[j].stu2+"   "+"学      号："+allway.s[j].stu1+"   "+"模      电："+allway.s[j].stu4;
							}
							if(num==1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(stubacjt2_1);
								SearchStuScojp2_1.add(stubacjt2_2);
								SearchStuScojp2_1.add(stubacjt2_3);
								SearchStuScojp2_1.add(stubacjt2_4);
								SearchStuScojp2_1.add(stubacjt2_5);
								SearchStuScojp2_1.add(stubacjt2_6);
								SearchStuScojp2_1.add(stubacjt2_7);
								SearchStuScojp2_1.add(stubacjt2_8);
								stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
								stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
								stubacjt2_3.setText("       数      电："+allway.s[j].stu3);
								stubacjt2_4.setText("       模      电："+allway.s[j].stu4);
								stubacjt2_5.setText("       英       语："+allway.s[j].stu5);
								stubacjt2_6.setText("       概 率 论  ："+allway.s[j].stu6);
								stubacjt2_7.setText("       离散数学："+allway.s[j].stu7);
								stubacjt2_8.setText("       大学体育："+allway.s[j].stu8);
								SearchStuScojp2_1.updateUI();
							}
							if(num==0) { 
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num>1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(jsp1);
								jsp1.setBounds(0, 5, 350, 340);
								jsp1.setBackground(cjp1);
								SearchStuScojp2_1.updateUI();
							}
						break;
					}
					case "英语成绩":{
						int i,j,num=0;
						String labs[]=new String[300];
						j=0;
						for (i = 0; i<k; i++)
							if (allway.s[i].stu5.equals(ss)) {
								num++;
								j=i;
								labs[i]="姓      名："+allway.s[j].stu2+"   "+"学      号："+allway.s[j].stu1+"   "+"英       语："+allway.s[j].stu5;
							}
							if(num==1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(stubacjt2_1);
								SearchStuScojp2_1.add(stubacjt2_2);
								SearchStuScojp2_1.add(stubacjt2_3);
								SearchStuScojp2_1.add(stubacjt2_4);
								SearchStuScojp2_1.add(stubacjt2_5);
								SearchStuScojp2_1.add(stubacjt2_6);
								SearchStuScojp2_1.add(stubacjt2_7);
								SearchStuScojp2_1.add(stubacjt2_8);
								stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
								stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
								stubacjt2_3.setText("       数      电："+allway.s[j].stu3);
								stubacjt2_4.setText("       模      电："+allway.s[j].stu4);
								stubacjt2_5.setText("       英       语："+allway.s[j].stu5);
								stubacjt2_6.setText("       概 率 论  ："+allway.s[j].stu6);
								stubacjt2_7.setText("       离散数学："+allway.s[j].stu7);
								stubacjt2_8.setText("       大学体育："+allway.s[j].stu8);
								SearchStuScojp2_1.updateUI();
							}
							if(num==0) { 
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num>1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(jsp1);
								jsp1.setBounds(0, 5, 350, 340);
								jsp1.setBackground(cjp1);
								SearchStuScojp2_1.updateUI();
							}
						break;
					}
					case "统计与概率论成绩":{
						int i,j,num=0;
						String labs[]=new String[300];
						j=0;
						for (i = 0; i<k; i++)
							if (allway.s[i].stu6.equals(ss)) {
								num++;
								j=i;
								labs[i]="姓      名："+allway.s[j].stu2+"   "+"学      号："+allway.s[j].stu1+"   "+"概 率 论  ："+allway.s[j].stu6;
							}
							if(num==1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(stubacjt2_1);
								SearchStuScojp2_1.add(stubacjt2_2);
								SearchStuScojp2_1.add(stubacjt2_3);
								SearchStuScojp2_1.add(stubacjt2_4);
								SearchStuScojp2_1.add(stubacjt2_5);
								SearchStuScojp2_1.add(stubacjt2_6);
								SearchStuScojp2_1.add(stubacjt2_7);
								SearchStuScojp2_1.add(stubacjt2_8);
								stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
								stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
								stubacjt2_3.setText("       数      电："+allway.s[j].stu3);
								stubacjt2_4.setText("       模      电："+allway.s[j].stu4);
								stubacjt2_5.setText("       英       语："+allway.s[j].stu5);
								stubacjt2_6.setText("       概 率 论  ："+allway.s[j].stu6);
								stubacjt2_7.setText("       离散数学："+allway.s[j].stu7);
								stubacjt2_8.setText("       大学体育："+allway.s[j].stu8);
								SearchStuScojp2_1.updateUI();
							}
							if(num==0) { 
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num>1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(jsp1);
								jsp1.setBounds(0, 5, 350, 340);
								jsp1.setBackground(cjp1);
								SearchStuScojp2_1.updateUI();
							}
						break;
					}
					case "离散数学成绩":{
						int i,j,num=0;
						String labs[]=new String[300];
						j=0;
						for (i = 0; i<k; i++)
							if (allway.s[i].stu7.equals(ss)) {
								num++;
								j=i;
								labs[i]="姓      名："+allway.s[j].stu2+"   "+"学      号："+allway.s[j].stu1+"   "+"离散数学："+allway.s[j].stu7;
							}
							if(num==1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(stubacjt2_1);
								SearchStuScojp2_1.add(stubacjt2_2);
								SearchStuScojp2_1.add(stubacjt2_3);
								SearchStuScojp2_1.add(stubacjt2_4);
								SearchStuScojp2_1.add(stubacjt2_5);
								SearchStuScojp2_1.add(stubacjt2_6);
								SearchStuScojp2_1.add(stubacjt2_7);
								SearchStuScojp2_1.add(stubacjt2_8);
								stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
								stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
								stubacjt2_3.setText("       数      电："+allway.s[j].stu3);
								stubacjt2_4.setText("       模      电："+allway.s[j].stu4);
								stubacjt2_5.setText("       英       语："+allway.s[j].stu5);
								stubacjt2_6.setText("       概 率 论  ："+allway.s[j].stu6);
								stubacjt2_7.setText("       离散数学："+allway.s[j].stu7);
								stubacjt2_8.setText("       大学体育："+allway.s[j].stu8);
								SearchStuScojp2_1.updateUI();
							}
							if(num==0) { 
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num>1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(jsp1);
								jsp1.setBounds(0, 5, 350, 340);
								jsp1.setBackground(cjp1);
								SearchStuScojp2_1.updateUI();
							}
						break;
					}
					case "大学体育成绩":{
						int i,j,num=0;
						String labs[]=new String[300];
						j=0;
						for (i = 0; i<k; i++)
							if (allway.s[i].stu8.equals(ss)) {
								num++;
								j=i;
								labs[i]="姓      名："+allway.s[j].stu2+"   "+"学      号："+allway.s[j].stu1+"   "+"大学体育："+allway.s[j].stu8;
							}
							if(num==1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(stubacjt2_1);
								SearchStuScojp2_1.add(stubacjt2_2);
								SearchStuScojp2_1.add(stubacjt2_3);
								SearchStuScojp2_1.add(stubacjt2_4);
								SearchStuScojp2_1.add(stubacjt2_5);
								SearchStuScojp2_1.add(stubacjt2_6);
								SearchStuScojp2_1.add(stubacjt2_7);
								SearchStuScojp2_1.add(stubacjt2_8);
								stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
								stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
								stubacjt2_3.setText("       数      电："+allway.s[j].stu3);
								stubacjt2_4.setText("       模      电："+allway.s[j].stu4);
								stubacjt2_5.setText("       英       语："+allway.s[j].stu5);
								stubacjt2_6.setText("       概 率 论  ："+allway.s[j].stu6);
								stubacjt2_7.setText("       离散数学："+allway.s[j].stu7);
								stubacjt2_8.setText("       大学体育："+allway.s[j].stu8);
								SearchStuScojp2_1.updateUI();
							}
							if(num==0) { 
								SearchError error=new SearchError();
								Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
								int width=(int)(screensize.getWidth()-300)/2;
								int height=(int)(screensize.getHeight()-200)/2;
								error.setBounds( width, height, 300, 200);
								error.setVisible(true);	
							}
							if(num>1) {
								SearchStuScojp2_1.removeAll();
								SearchStuScojp2_1.add(jsp1);
								jsp1.setBounds(0, 5, 350, 340);
								jsp1.setBackground(cjp1);
								SearchStuScojp2_1.updateUI();
							}
						break;
					}
					}	
									
				}
			}
			SearchStuScojp3jb1.addActionListener(new  SearchStuScojp3jb1Action());
		}

}
class MyComboBoxs extends AbstractListModel<String> implements ComboBoxModel<String>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String selecteditem=null;
	String ways[]= {"学号","姓名","数电成绩","模电成绩","英语成绩","统计与概率论成绩","离散数学成绩","大学体育成绩"};
	public String getElementAt(int index) {
		return ways[index];
	}
	public int getSize() {
		return ways.length;
	}
	public void setSelectedItem(Object item) {
		selecteditem=(String)item;
	}
	public Object getSelectedItem() {
		return selecteditem;
	}
}

