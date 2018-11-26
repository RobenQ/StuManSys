package StuManageSys;
import StuManageSys.AllWays;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;

public class SearchStuBac extends JFrame{

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
	public JTextField SearchStuBacjp2jt1=new JTextField();
	//-------------------------------------------------------------关闭界面
		public void myclose() {
			dispose();
		}
	
	//=============================================================构造方法
	public SearchStuBac() {
		// TODO Auto-generated constructor stub
		//****************************************************登陆界面部分属性
		this.setTitle("学生信息管理系统--查询信息");
		ImageIcon icon=new ImageIcon(LogIn.class.getResource("LOGO2.jpg"));
		this.setIconImage(icon.getImage());
		Container container1=this.getContentPane();
		container1.setLayout(null);
		Color cjp1=new Color(255,250,250);
		Color cjp2=new Color(255,255,224);
		container1.setBackground(cjp1);
		
		//=================================================功能提示
		JPanel SearchStuBacjp1=new JPanel();
		JLabel SearchStuBacjp1jl1=new JLabel("查询",JLabel.CENTER);
		SearchStuBacjp1jl1.setFont(new Font("查询", 1, 18));
		SearchStuBacjp1jl1.setBounds(0, 0, 350, 60);
		SearchStuBacjp1jl1.setBackground(cjp2);
		SearchStuBacjp1.setLayout(null);
		SearchStuBacjp1.setBounds(0,0,350,60);
		SearchStuBacjp1.setBackground(cjp2);
		SearchStuBacjp1.add(SearchStuBacjp1jl1);
		
		//------------------------------------------------具体选项
		JPanel SearchStuBacjp2=new JPanel();
		SearchStuBacjp2.setBounds(0, 60, 350, 60);
		SearchStuBacjp2.setLayout(null);
		SearchStuBacjp2.setBackground(cjp1);
		JLabel SearchStuBacjp2jl1=new JLabel("查询方式：",JLabel.CENTER);
		SearchStuBacjp2jl1.setBounds(20, 5, 65, 20);
		JLabel SearchStuBacjp2jl2=new JLabel("查询内容：",JLabel.CENTER);
		SearchStuBacjp2jl2.setBounds(20, 40, 65, 20);
		SearchStuBacjp2jt1.setBounds(80, 40, 200, 20);
		JComboBox<String>jc=new JComboBox<>(new MyComboBox());
		jc.setBounds(80, 5, 200, 20);
		jc.setBackground(cjp2);
		SearchStuBacjp2.add(SearchStuBacjp2jl1);
		SearchStuBacjp2.add(SearchStuBacjp2jl2);
		SearchStuBacjp2.add(jc);
		SearchStuBacjp2.add( SearchStuBacjp2jt1);
		
		JPanel SearchStuBacjp2_1=new JPanel();
		SearchStuBacjp2_1.setBounds(0, 120, 350, 340);
		SearchStuBacjp2_1.setLayout(null);
		SearchStuBacjp2_1.setBackground(cjp1);
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
		stubacjt2_4.setBounds(0, 125, 350,40);
		stubacjt2_5.setBounds(0, 165,350, 40);
		stubacjt2_7.setBounds(0, 245,350, 40);
		stubacjt2_8.setBounds(0, 285, 350, 40);
		stubacjt2_6.setBounds(0, 205,  350, 40);
			
		
		//===============================================确定查询信息面板
		JPanel SearchStuBacjp3=new JPanel();
		SearchStuBacjp3.setBounds(0, 460, 350, 140); 
		SearchStuBacjp3.setLayout(null);
		SearchStuBacjp3.setBackground(cjp1);
		JButton SearchStuBacjp3jb1=new JButton("查询");//查询按钮
		SearchStuBacjp3jb1.setBackground(cjp2);
		SearchStuBacjp3jb1.setBounds(120, 30, 100, 30);
		SearchStuBacjp3.add(SearchStuBacjp3jb1);
		JButton  Searchjp3jb2=new JButton("返回");  //返回按钮
		Searchjp3jb2.setBackground(cjp1);
		Searchjp3jb2.setBounds(260, 80, 70, 20);
		SearchStuBacjp3.setBackground(cjp1);
		SearchStuBacjp3.add(Searchjp3jb2);
		SearchStuBacjp3jb1.setFocusPainted(false);
		Searchjp3jb2.setFocusPainted(false);
		
		
		container1.add(SearchStuBacjp1);
		container1.add(SearchStuBacjp2);
		container1.add(SearchStuBacjp2_1);
		container1.add(SearchStuBacjp3);
		
		//================================================点击返回按钮后的界面
		class  Searchjp3jb2Action implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				myclose();			
			}
		}
		Searchjp3jb2.addActionListener(new  Searchjp3jb2Action());
		
		//================================================点击查询按钮后的界面
		class SearchStuBacjp3jb1Action implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				String s1="D:\\基本信息.txt";
				AllWays allway=new AllWays();
				String s2=(String)jc.getSelectedItem();
				String ss=SearchStuBacjp2jt1.getText();
				int k=allway.read(s1);
				switch (s2) {
				case "学号":{
					int i,j,num=0;
					Vector<String> vector=new Vector<>();//===============滚动面板
					JList<String> jsp1=new JList<>(vector);	
					String labs[]=new String[300];
					j=0;
					for ( i = 0; i<k; i++) {
						if (allway.s[i].stu1.equals(ss)) {
							num=num+1;
							j=i;
							labs[i]="学  号："+allway.s[j].stu1+"   "+"姓 名："+allway.s[j].stu2+"   "+"联系方式："+allway.s[j].stu7;
							vector.add(labs[i]);
						}
					}
						if(num==1) {
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(stubacjt2_1);
							SearchStuBacjp2_1.add(stubacjt2_2);
							SearchStuBacjp2_1.add(stubacjt2_3);
							SearchStuBacjp2_1.add(stubacjt2_4);
							SearchStuBacjp2_1.add(stubacjt2_5);
							SearchStuBacjp2_1.add(stubacjt2_6);
							SearchStuBacjp2_1.add(stubacjt2_7);
							SearchStuBacjp2_1.add(stubacjt2_8);
							stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
							stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
							stubacjt2_3.setText("       性      别："+allway.s[j].stu3);
							stubacjt2_4.setText("       年      龄："+allway.s[j].stu4);
							stubacjt2_5.setText("       寝 室 号 ："+allway.s[j].stu5);
							stubacjt2_6.setText("       政治面貌："+allway.s[j].stu6);
							stubacjt2_7.setText("       联系方式："+allway.s[j].stu7);
							stubacjt2_8.setText("       家庭住址："+allway.s[j].stu8);
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
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(jsp1);
							jsp1.setBackground(cjp1);
							jsp1.setBounds(0, 5, 350, 340);
						}
					break;
				}
				case "姓名":{
					int i,j,num=0;
					Vector<String> vector=new Vector<>();//===============滚动面板
					JList<String> jsp1=new JList<>(vector);	
					String labs[]=new String[300];
					j=0;
					for ( i = 0; i<k; i++)
						if (allway.s[i].stu2.equals(ss)) {
							num=num+1;
							j=i;
							labs[i]="姓 名："+allway.s[j].stu2+"   "+"学  号："+allway.s[j].stu1+"   "+"联系方式："+allway.s[j].stu7;
							vector.add(labs[i]);
						}
						if(num==1) {
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(stubacjt2_1);
							SearchStuBacjp2_1.add(stubacjt2_2);
							SearchStuBacjp2_1.add(stubacjt2_3);
							SearchStuBacjp2_1.add(stubacjt2_4);
							SearchStuBacjp2_1.add(stubacjt2_5);
							SearchStuBacjp2_1.add(stubacjt2_6);
							SearchStuBacjp2_1.add(stubacjt2_7);
							SearchStuBacjp2_1.add(stubacjt2_8);
							stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
							stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
							stubacjt2_3.setText("       性      别："+allway.s[j].stu3);
							stubacjt2_4.setText("       年      龄："+allway.s[j].stu4);
							stubacjt2_5.setText("       寝 室 号 ："+allway.s[j].stu5);
							stubacjt2_6.setText("       政治面貌："+allway.s[j].stu6);
							stubacjt2_7.setText("       联系方式："+allway.s[j].stu7);
							stubacjt2_8.setText("       家庭住址："+allway.s[j].stu8);
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
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(jsp1);
							jsp1.setBackground(cjp1);
							jsp1.setBounds(0, 5, 350, 340);
						}
					break;
				}
				case "性别":{
					int i,j,num=0;
					Vector<String> vector=new Vector<>();//===============滚动面板
					JList<String> jsp1=new JList<>(vector);	
					String labs[]=new String[300];
					j=0;
					for ( i = 0; i<k; i++)
						if (allway.s[i].stu3.equals(ss)) {
							num=num+1;
							j=i;
							labs[i]="学      号："+allway.s[j].stu1+"   "+"姓      名："+allway.s[j].stu2+"   "+"性      别："+allway.s[j].stu3;
							vector.add(labs[i]);
						}
						if(num==1) {
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(stubacjt2_1);
							SearchStuBacjp2_1.add(stubacjt2_2);
							SearchStuBacjp2_1.add(stubacjt2_3);
							SearchStuBacjp2_1.add(stubacjt2_4);
							SearchStuBacjp2_1.add(stubacjt2_5);
							SearchStuBacjp2_1.add(stubacjt2_6);
							SearchStuBacjp2_1.add(stubacjt2_7);
							SearchStuBacjp2_1.add(stubacjt2_8);
							stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
							stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
							stubacjt2_3.setText("       性      别："+allway.s[j].stu3);
							stubacjt2_4.setText("       年      龄："+allway.s[j].stu4);
							stubacjt2_5.setText("       寝 室 号 ："+allway.s[j].stu5);
							stubacjt2_6.setText("       政治面貌："+allway.s[j].stu6);
							stubacjt2_7.setText("       联系方式："+allway.s[j].stu7);
							stubacjt2_8.setText("       家庭住址："+allway.s[j].stu8);
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
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(jsp1);
							jsp1.setBounds(0, 5, 350, 340);
							jsp1.setBackground(cjp1);
						}
					break;
				}
				case "年龄":{
					int i,j,num=0;
					Vector<String> vector=new Vector<>();//===============滚动面板
					JList<String> jsp1=new JList<>(vector);	
					String labs[]=new String[300];
					j=0;
					for ( i = 0; i<k; i++)
						if (allway.s[i].stu4.equals(ss)) {
							num=num+1;
							j=i;
							labs[i]="学      号："+allway.s[j].stu1+"   "+"姓      名："+allway.s[j].stu2+"   "+"年      龄："+allway.s[j].stu4;
							vector.add(labs[i]);
						}
						if(num==1) {
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(stubacjt2_1);
							SearchStuBacjp2_1.add(stubacjt2_2);
							SearchStuBacjp2_1.add(stubacjt2_3);
							SearchStuBacjp2_1.add(stubacjt2_4);
							SearchStuBacjp2_1.add(stubacjt2_5);
							SearchStuBacjp2_1.add(stubacjt2_6);
							SearchStuBacjp2_1.add(stubacjt2_7);
							SearchStuBacjp2_1.add(stubacjt2_8);
							stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
							stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
							stubacjt2_3.setText("       性      别："+allway.s[j].stu3);
							stubacjt2_4.setText("       年      龄："+allway.s[j].stu4);
							stubacjt2_5.setText("       寝 室 号 ："+allway.s[j].stu5);
							stubacjt2_6.setText("       政治面貌："+allway.s[j].stu6);
							stubacjt2_7.setText("       联系方式："+allway.s[j].stu7);
							stubacjt2_8.setText("       家庭住址："+allway.s[j].stu8);
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
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(jsp1);
							jsp1.setBounds(0, 5, 350, 340);
							jsp1.setBackground(cjp1);
						}
					break;
				}
				case "寝室号":{
					int i,j,num=0;
					Vector<String> vector=new Vector<>();//===============滚动面板
					JList<String> jsp1=new JList<>(vector);	
					String labs[]=new String[300];
					j=0;
					for ( i = 0; i<k; i++)
						if (allway.s[i].stu5.equals(ss)) {
							num=num+1;
							j=i;
							labs[i]="学      号："+allway.s[j].stu1+"   "+"姓      名："+allway.s[j].stu2+"   "+"寝 室 号 ："+allway.s[j].stu5;
							vector.add(labs[i]);
						}
						if(num==1) {
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(stubacjt2_1);
							SearchStuBacjp2_1.add(stubacjt2_2);
							SearchStuBacjp2_1.add(stubacjt2_3);
							SearchStuBacjp2_1.add(stubacjt2_4);
							SearchStuBacjp2_1.add(stubacjt2_5);
							SearchStuBacjp2_1.add(stubacjt2_6);
							SearchStuBacjp2_1.add(stubacjt2_7);
							SearchStuBacjp2_1.add(stubacjt2_8);
							stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
							stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
							stubacjt2_3.setText("       性      别："+allway.s[j].stu3);
							stubacjt2_4.setText("       年      龄："+allway.s[j].stu4);
							stubacjt2_5.setText("       寝 室 号 ："+allway.s[j].stu5);
							stubacjt2_6.setText("       政治面貌："+allway.s[j].stu6);
							stubacjt2_7.setText("       联系方式："+allway.s[j].stu7);
							stubacjt2_8.setText("       家庭住址："+allway.s[j].stu8);
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
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(jsp1);
							jsp1.setBounds(0, 5, 350, 340);
							jsp1.setBackground(cjp1);
						}
					break;
				}
				case "政治面貌":{
					int i,j,num=0;
					Vector<String> vector=new Vector<>();//===============滚动面板
					JList<String> jsp1=new JList<>(vector);	
					String labs[]=new String[300];
					j=0;
					for ( i = 0; i<k; i++)
						if (allway.s[i].stu6.equals(ss)) {
							num=num+1;
							j=i;
							labs[i]="学      号："+allway.s[j].stu1+"   "+"姓      名："+allway.s[j].stu2+"   "+"政治面貌："+allway.s[j].stu6;
							vector.add(labs[i]);
						}
						if(num==1) {
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(stubacjt2_1);
							SearchStuBacjp2_1.add(stubacjt2_2);
							SearchStuBacjp2_1.add(stubacjt2_3);
							SearchStuBacjp2_1.add(stubacjt2_4);
							SearchStuBacjp2_1.add(stubacjt2_5);
							SearchStuBacjp2_1.add(stubacjt2_6);
							SearchStuBacjp2_1.add(stubacjt2_7);
							SearchStuBacjp2_1.add(stubacjt2_8);
							stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
							stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
							stubacjt2_3.setText("       性      别："+allway.s[j].stu3);
							stubacjt2_4.setText("       年      龄："+allway.s[j].stu4);
							stubacjt2_5.setText("       寝 室 号 ："+allway.s[j].stu5);
							stubacjt2_6.setText("       政治面貌："+allway.s[j].stu6);
							stubacjt2_7.setText("       联系方式："+allway.s[j].stu7);
							stubacjt2_8.setText("       家庭住址："+allway.s[j].stu8);
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
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(jsp1);
							jsp1.setBounds(0, 5, 350, 340);
							jsp1.setBackground(cjp1);
						}
					break;
				}
				case "联系方式":{
					int i,j,num=0;
					Vector<String> vector=new Vector<>();//===============滚动面板
					JList<String> jsp1=new JList<>(vector);	
					String labs[]=new String[300];
					j=0;
					for ( i = 0; i<k; i++)
						if (allway.s[i].stu7.equals(ss)) {
							num=num+1;
							j=i;
							labs[i]="学      号："+allway.s[j].stu1+"   "+"姓      名："+allway.s[j].stu2+"   "+"联系方式："+allway.s[j].stu7;
							vector.add(labs[i]);
						}
						if(num==1) {
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(stubacjt2_1);
							SearchStuBacjp2_1.add(stubacjt2_2);
							SearchStuBacjp2_1.add(stubacjt2_3);
							SearchStuBacjp2_1.add(stubacjt2_4);
							SearchStuBacjp2_1.add(stubacjt2_5);
							SearchStuBacjp2_1.add(stubacjt2_6);
							SearchStuBacjp2_1.add(stubacjt2_7);
							SearchStuBacjp2_1.add(stubacjt2_8);
							stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
							stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
							stubacjt2_3.setText("       性      别："+allway.s[j].stu3);
							stubacjt2_4.setText("       年      龄："+allway.s[j].stu4);
							stubacjt2_5.setText("       寝 室 号 ："+allway.s[j].stu5);
							stubacjt2_6.setText("       政治面貌："+allway.s[j].stu6);
							stubacjt2_7.setText("       联系方式："+allway.s[j].stu7);
							stubacjt2_8.setText("       家庭住址："+allway.s[j].stu8);
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
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(jsp1);
							jsp1.setBounds(0, 5, 350, 340);
							jsp1.setBackground(cjp1);
						}
					break;
				}
				case "家庭住址":{
					int i,j,num=0;
					Vector<String> vector=new Vector<>();//===============滚动面板
					JList<String> jsp1=new JList<>(vector);	
					String labs[]=new String[300];
					j=0;
					for ( i = 0; i<k; i++)
						if (allway.s[i].stu8.equals(ss)) {
							num=num+1;
							j=i;
							labs[i]="学      号："+allway.s[j].stu1+"   "+"姓      名："+allway.s[j].stu2+"   "+"家庭住址："+allway.s[j].stu8;
							vector.add(labs[i]);
						}
						if(num==1) {
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(stubacjt2_1);
							SearchStuBacjp2_1.add(stubacjt2_2);
							SearchStuBacjp2_1.add(stubacjt2_3);
							SearchStuBacjp2_1.add(stubacjt2_4);
							SearchStuBacjp2_1.add(stubacjt2_5);
							SearchStuBacjp2_1.add(stubacjt2_6);
							SearchStuBacjp2_1.add(stubacjt2_7);
							SearchStuBacjp2_1.add(stubacjt2_8);
							stubacjt2_1.setText("       学      号："+allway.s[j].stu1);
							stubacjt2_2.setText("       姓      名："+allway.s[j].stu2);
							stubacjt2_3.setText("       性      别："+allway.s[j].stu3);
							stubacjt2_4.setText("       年      龄："+allway.s[j].stu4);
							stubacjt2_5.setText("       寝 室 号 ："+allway.s[j].stu5);
							stubacjt2_6.setText("       政治面貌："+allway.s[j].stu6);
							stubacjt2_7.setText("       联系方式："+allway.s[j].stu7);
							stubacjt2_8.setText("       家庭住址："+allway.s[j].stu8);
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
							SearchStuBacjp2_1.removeAll();
							SearchStuBacjp2_1.add(jsp1);
							jsp1.setBounds(0, 5, 350, 340);
							jsp1.setBackground(cjp1);
						}
					break;
				}
				case "查询全部":{
					int i,j;
					Vector<String> vector=new Vector<>();//===============滚动面板
					JList<String> jsp1=new JList<>(vector);	
					String labs[]=new String[300];
					
					j=0;
					if(k-1==0) {
						SearchError error=new SearchError();
						Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
						int width=(int)(screensize.getWidth()-300)/2;
						int height=(int)(screensize.getHeight()-200)/2;
						error.setBounds( width, height, 300, 200);
						error.jl1.setBounds(70, 40, 150, 30);
						error.jl1.setText("你还没有录入信息！");
						error.setVisible(true);	
					}
					else {
						for ( i = 1; i<k; i++) {
							j=i;
							labs[i]="学      号："+allway.s[j].stu1+"   "+"姓      名："+allway.s[j].stu2+"   "+"家庭住址："+allway.s[j].stu8;
							vector.add(labs[i]);
						}
					}
					SearchStuBacjp2_1.removeAll();
					SearchStuBacjp2_1.add(jsp1);
					jsp1.setBounds(0, 5, 350, 340);
					jsp1.setBackground(cjp1);
					break;
				}
				}	
			}				
		}
		SearchStuBacjp3jb1.addActionListener(new  SearchStuBacjp3jb1Action());
	}
}
class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String>{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	String selecteditem=null;
	String ways[]= {"学号","姓名","性别","年龄","寝室号","政治面貌","联系方式","查询全部"};
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