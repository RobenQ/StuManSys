package StuManageSys;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.*;

public class ChangeBac extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//-------------------------------------------------------------关闭界面
	public void myclose() {
		this.dispose();
	}
	public JTextField stubacjt2_1=new JTextField();  //基本信息录入框
	public JTextField stubacjt2_2=new JTextField();
	public JTextField stubacjt2_3=new JTextField();
	public JTextField stubacjt2_4=new JTextField();
	public JTextField stubacjt2_5=new JTextField();
	public JTextField stubacjt2_6=new JTextField();
	public JTextField stubacjt2_7=new JTextField();
	public JTextField stubacjt2_8=new JTextField();
	public JTextField SearchStuBacjp2jt1=new JTextField();
	
	//============================================================构造方法
		public ChangeBac() {
			this.setTitle("学生信息管理系统--基本信息");
			ImageIcon icon=new ImageIcon(LogIn.class.getResource("LOGO2.jpg"));
			this.setIconImage(icon.getImage());
			Container container3=this.getContentPane();
			container3.setLayout(null);
			Color cjp1=new Color(255,250,250);
			Color cjp2=new Color(255,255,224);
			
			//*****************************************录入基本信息功能提示标签
			JPanel stubacjp1=new JPanel();
			JLabel stubacjl1=new JLabel("修改基本信息",JLabel.CENTER);
			stubacjl1.setBounds(0,0,350,60);
			stubacjl1.setFont(new Font(" ", 0, 18));
			stubacjl1.setBackground(cjp2);
			stubacjp1.setLayout(null);
			stubacjp1.setBounds(0,0,350,60);
			stubacjp1.add(stubacjl1);
			stubacjp1.setBackground(cjp2);
			
			
			//------------------------------------------------具体选项
			JPanel SearchStuBacjp2=new JPanel();
			SearchStuBacjp2.setBounds(0, 60, 350, 60);
			SearchStuBacjp2.setLayout(null);
			SearchStuBacjp2.setBackground(cjp1);
			JLabel SearchStuBacjp2jl1=new JLabel("查询方式：",JLabel.CENTER);
			SearchStuBacjp2jl1.setBounds(40, 5, 65, 20);
			JLabel SearchStuBacjp2jl2=new JLabel("查询内容：",JLabel.CENTER);
			SearchStuBacjp2jl2.setBounds(40, 40, 65, 20);
			SearchStuBacjp2jt1.setBounds(100, 40, 200, 20);
			JComboBox<String>jc=new JComboBox<>(new MyComboBoxch());
			jc.setBounds(100, 5, 200, 20);
			jc.setBackground(cjp2);
			SearchStuBacjp2.add(SearchStuBacjp2jl1);
			SearchStuBacjp2.add(SearchStuBacjp2jl2);
			SearchStuBacjp2.add(jc);
			SearchStuBacjp2.add( SearchStuBacjp2jt1);
			
			
			//-------------------------------------------------- 录入项目放置面板
			JPanel stubacjp2_1=new JPanel();
			JPanel stubacjp2_2=new JPanel();
			JPanel stubacjp2_3=new JPanel();
			JPanel stubacjp2_4=new JPanel();
			JPanel stubacjp2_5=new JPanel();
			JPanel stubacjp2_6=new JPanel();
			JPanel stubacjp2_7=new JPanel();
			JPanel stubacjp2_8=new JPanel();
			JLabel stubacjl2_1=new JLabel("学      号：",JLabel.CENTER);//标签提示字体设置
			JLabel stubacjl2_2=new JLabel("姓      名：",JLabel.CENTER);
			JLabel stubacjl2_3=new JLabel("性      别：",JLabel.CENTER);
			JLabel stubacjl2_4=new JLabel("年      龄：",JLabel.CENTER);
			JLabel stubacjl2_5=new JLabel("寝 室 号：",JLabel.CENTER);
			JLabel stubacjl2_6=new JLabel("政治面貌：",JLabel.CENTER);
			JLabel stubacjl2_7=new JLabel("联系方式：",JLabel.CENTER);
			JLabel stubacjl2_8=new JLabel("家庭住址：",JLabel.CENTER);
			stubacjp2_1.setBounds(0, 120, 350, 42);      //容器大小
			stubacjp2_2.setBounds(0, 162, 350, 42);
			stubacjp2_3.setBounds(0, 204, 350, 42);
			stubacjp2_4.setBounds(0, 246, 350, 42);
			stubacjp2_5.setBounds(0, 288, 350, 42);
			stubacjp2_6.setBounds(0, 330, 350, 42);
			stubacjp2_7.setBounds(0, 372, 350, 42);
			stubacjp2_8.setBounds(0, 414, 350, 46);
			stubacjl2_1.setBounds(20, 0, 80, 40);      //标签大小
			stubacjl2_2.setBounds(20, 0, 80, 40);
			stubacjl2_3.setBounds(20, 0, 80, 40);
			stubacjl2_4.setBounds(20, 0, 80, 40);
			stubacjl2_5.setBounds(20, 0, 80, 40);
			stubacjl2_6.setBounds(20, 0, 80, 40);
			stubacjl2_7.setBounds(20, 0, 80, 40);
			stubacjl2_8.setBounds(20, 0, 80, 40);
			stubacjt2_1.setBounds(100, 10, 200, 30);     //信息录入框设置
			stubacjt2_2.setBounds(100, 10, 200, 30);
			stubacjt2_3.setBounds(100, 10, 200, 30);
			stubacjt2_4.setBounds(100, 10, 200, 30);
			stubacjt2_5.setBounds(100, 10, 200, 30);
			stubacjt2_6.setBounds(100, 10, 200, 30);
			stubacjt2_7.setBounds(100, 10, 200, 30);
			stubacjt2_8.setBounds(100, 10, 200, 30);
			stubacjp2_1.setLayout(null);          //容器布局方式
			stubacjp2_2.setLayout(null);
			stubacjp2_3.setLayout(null);
			stubacjp2_4.setLayout(null);
			stubacjp2_5.setLayout(null);
			stubacjp2_6.setLayout(null);
			stubacjp2_7.setLayout(null);
			stubacjp2_8.setLayout(null);
			stubacjp2_1.add(stubacjl2_1);//加入标签
			stubacjp2_2.add(stubacjl2_2);
			stubacjp2_3.add(stubacjl2_3);
			stubacjp2_4.add(stubacjl2_4);
			stubacjp2_5.add(stubacjl2_5);
			stubacjp2_6.add(stubacjl2_6);
			stubacjp2_7.add(stubacjl2_7);
			stubacjp2_8.add(stubacjl2_8);
			stubacjp2_1.add(stubacjt2_1);//加入信息录入框
			stubacjp2_2.add(stubacjt2_2);
			stubacjp2_3.add(stubacjt2_3);
			stubacjp2_4.add(stubacjt2_4);
			stubacjp2_5.add(stubacjt2_5);
			stubacjp2_6.add(stubacjt2_6);
			stubacjp2_7.add(stubacjt2_7);
			stubacjp2_8.add(stubacjt2_8);
			stubacjp2_1.setBackground(cjp1);//容器背景颜色
			stubacjp2_2.setBackground(cjp1);
			stubacjp2_3.setBackground(cjp1);
			stubacjp2_4.setBackground(cjp1);
			stubacjp2_5.setBackground(cjp1);
			stubacjp2_6.setBackground(cjp1);
			stubacjp2_7.setBackground(cjp1);
			stubacjp2_8.setBackground(cjp1);
			
			
			//===============================================确定录入信息面板
			JPanel stubacjp3=new JPanel();
			stubacjp3.setBounds(0, 460, 350, 140); //录入按钮
			stubacjp3.setLayout(null);
			stubacjp3.setBackground(cjp1);
			JButton stubacjp3jb1=new JButton("查询");
			JButton stubacjp3jb1s=new JButton("修改");
			stubacjp3jb1.setBackground(cjp2);
			stubacjp3jb1s.setBackground(cjp2);
			stubacjp3jb1.setBounds(50, 30, 100, 30);
			stubacjp3jb1s.setBounds(190, 30, 100, 30);
			stubacjp3.add(stubacjp3jb1);
			stubacjp3.add(stubacjp3jb1s);
			JButton stubacjp3jb2=new JButton("返回");  //返回按钮
			stubacjp3jb2.setBackground(cjp1);
			stubacjp3jb2.setBounds(260, 80, 70, 20);
			stubacjp3.add(stubacjp3jb2);
			stubacjp3jb1.setFocusPainted(false);
			stubacjp3jb1s.setFocusPainted(false);
			stubacjp3jb2.setFocusPainted(false);
			
			
			container3.add(stubacjp1);
			container3.add(SearchStuBacjp2);
			container3.add(stubacjp2_1);
			container3.add(stubacjp2_2);
			container3.add(stubacjp2_3);
			container3.add(stubacjp2_4);
			container3.add(stubacjp2_5);
			container3.add(stubacjp2_6);
			container3.add(stubacjp2_7);
			container3.add(stubacjp2_8);
			container3.add(stubacjp3);
			
			 if (stubacjt2_1.getText().equals("")|stubacjt2_2.getText().equals("")|stubacjt2_3.getText().equals("")|
						stubacjt2_4.getText().equals("")|stubacjt2_5.getText().equals("")|stubacjt2_6.getText().equals("")|
						stubacjt2_7.getText().equals("")|stubacjt2_8.getText().equals(""))  stubacjp3jb1s.setEnabled(false);
			//================================================点击返回按钮后的界面
			class  stubacjp3jb2Action implements ActionListener{
				public void actionPerformed(ActionEvent e) {
					myclose();
				}
			}
			 stubacjp3jb2.addActionListener(new  stubacjp3jb2Action());
			 
			//================================================点击查询按钮后的界面
			 class  stubacjp3jb1Action implements ActionListener{
				 public void actionPerformed(ActionEvent e) {
						 AllWays allway=new AllWays();
						if((stubacjp3jb1.getText()).equals("查询")) {
							String s1="D:\\基本信息.txt";
							String s2=(String)jc.getSelectedItem();
							String ss=SearchStuBacjp2jt1.getText();
							int k=allway.read(s1);
							switch (s2) {
							case "学号":{
								int i,j,num=0;
								j=0;
								for ( i = 0; i<k; i++) {
									if (allway.s[i].stu1.equals(ss)) {
										num=num+1;
										j=i;
										stubacjt2_1.setText(allway.s[j].stu1);
										stubacjt2_2.setText(allway.s[j].stu2);
										stubacjt2_3.setText(allway.s[j].stu3);
										stubacjt2_4.setText(allway.s[j].stu4);
										stubacjt2_5.setText(allway.s[j].stu5);
										stubacjt2_6.setText(allway.s[j].stu6);
										stubacjt2_7.setText(allway.s[j].stu7);
										stubacjt2_8.setText(allway.s[j].stu8);
								}
							}
								 if (stubacjt2_1.getText().equals("")|stubacjt2_2.getText().equals("")|stubacjt2_3.getText().equals("")|
											stubacjt2_4.getText().equals("")|stubacjt2_5.getText().equals("")|stubacjt2_6.getText().equals("")|
											stubacjt2_7.getText().equals("")|stubacjt2_8.getText().equals("")) {
											Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
											int width=(int)(screensize.getWidth()-300)/2;
											int height=(int)(screensize.getHeight()-200)/2;
											SearchError addError=new SearchError();
											addError.setBounds( width, height, 300, 200);
											addError.setVisible(true);
											
										}
								 else
									 stubacjp3jb1s.setEnabled(true);
								break;
							}
							case "姓名":{
								int i,j,num=0;
								j=0;
								for ( i = 0; i<k; i++)
									if (allway.s[i].stu2.equals(ss)) {
										num=num+1;
										j=i;
										stubacjt2_1.setText(allway.s[j].stu1);
										stubacjt2_2.setText(allway.s[j].stu2);
										stubacjt2_3.setText(allway.s[j].stu3);
										stubacjt2_4.setText(allway.s[j].stu4);
										stubacjt2_5.setText(allway.s[j].stu5);
										stubacjt2_6.setText(allway.s[j].stu6);
										stubacjt2_7.setText(allway.s[j].stu7);
										stubacjt2_8.setText(allway.s[j].stu8);
									}
								 if (stubacjt2_1.getText().equals("")|stubacjt2_2.getText().equals("")|stubacjt2_3.getText().equals("")|
											stubacjt2_4.getText().equals("")|stubacjt2_5.getText().equals("")|stubacjt2_6.getText().equals("")|
											stubacjt2_7.getText().equals("")|stubacjt2_8.getText().equals("")) {
											Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
											int width=(int)(screensize.getWidth()-300)/2;
											int height=(int)(screensize.getHeight()-200)/2;
											SearchError addError=new SearchError();
											addError.setBounds( width, height, 300, 200);
											addError.setVisible(true);
											
										}
								 else
									 stubacjp3jb1s.setEnabled(true);
								break;
							}
							case "联系方式":{
								int i,j,num=0;
								j=0;
								for ( i = 0; i<k; i++)
									if (allway.s[i].stu7.equals(ss)) {
										num=num+1;
										j=i;
										stubacjt2_1.setText(allway.s[j].stu1);
										stubacjt2_2.setText(allway.s[j].stu2);
										stubacjt2_3.setText(allway.s[j].stu3);
										stubacjt2_4.setText(allway.s[j].stu4);
										stubacjt2_5.setText(allway.s[j].stu5);
										stubacjt2_6.setText(allway.s[j].stu6);
										stubacjt2_7.setText(allway.s[j].stu7);
										stubacjt2_8.setText(allway.s[j].stu8);
								}
								 if (stubacjt2_1.getText().equals("")|stubacjt2_2.getText().equals("")|stubacjt2_3.getText().equals("")|
											stubacjt2_4.getText().equals("")|stubacjt2_5.getText().equals("")|stubacjt2_6.getText().equals("")|
											stubacjt2_7.getText().equals("")|stubacjt2_8.getText().equals("")) {
											Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
											int width=(int)(screensize.getWidth()-300)/2;
											int height=(int)(screensize.getHeight()-200)/2;
											SearchError addError=new SearchError();
											addError.setBounds( width, height, 300, 200);
											addError.setVisible(true);
											
										}
								break;
					}
				 }
			}
				 }
			 }
	stubacjp3jb1.addActionListener(new  stubacjp3jb1Action());
	
	 class  stubacjp3jb1sAction implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			 AllWays allway=new AllWays();
			 AllWays all=new AllWays();
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
						if((stubacjp3jb1s.getText()).equals("修改")) {
							String s1="D:\\基本信息.txt";
							String s2=(String)jc.getSelectedItem();
							String ss=SearchStuBacjp2jt1.getText();
							int k=allway.read(s1);
							switch (s2) {
							case "学号":{
								int i,j,num=0;
								j=0;
								for ( i = 0; i<k; i++) {
									if (allway.s[i].stu1.equals(ss)) {
										num=num+1;
										j=i;
										allway.s[j].stu1=stubacjt2_1.getText();
										allway.s[j].stu2=stubacjt2_2.getText();
										allway.s[j].stu3=stubacjt2_3.getText();
										allway.s[j].stu4=stubacjt2_4.getText();
										allway.s[j].stu5=stubacjt2_5.getText();
										allway.s[j].stu6=stubacjt2_6.getText();
										allway.s[j].stu7=stubacjt2_7.getText();
										allway.s[j].stu8=stubacjt2_8.getText();
									}
								}
									if(num>=1) {
										for ( i = 0; i<k; i++) {
											all.s[i]=allway.s[j];
											String exchange=new String();
											exchange=all.s[i].stu1+" "+all.s[i].stu2+" "+all.s[i].stu3+" "+all.s[i].stu4+
														" "+all.s[i].stu5+" "+all.s[i].stu6+" "+all.s[i].stu7+" "+all.s[i].stu8;
											try{
												FileWriter a=new FileWriter(s1);
												a.write(exchange);
												a.write("\r\n");
												a.close();
											}catch(Exception W){
												W.printStackTrace();
											}
										}
										SearchError error=new SearchError();
										Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
										int width=(int)(screensize.getWidth()-300)/2;
										int height=(int)(screensize.getHeight()-200)/2;
										error.jl1.setText("修改成功！");
										error.setBounds( width, height, 300, 200);
										error.setVisible(true);	
									}
									if(num==0) { 
										SearchError error=new SearchError();
										Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
										int width=(int)(screensize.getWidth()-300)/2;
										int height=(int)(screensize.getHeight()-200)/2;
										error.setBounds( width, height, 300, 200);
										error.setVisible(true);	
									}
								break;
							}
							case "姓名":{
								int i,j,num=0;
								j=0;
								for ( i = 0; i<k; i++)
									if (allway.s[i].stu2.equals(ss)) {
										num=num+1;
										j=i;
										allway.s[j].stu1=stubacjt2_1.getText();
										allway.s[j].stu2=stubacjt2_2.getText();
										allway.s[j].stu3=stubacjt2_3.getText();
										allway.s[j].stu4=stubacjt2_4.getText();
										allway.s[j].stu5=stubacjt2_5.getText();
										allway.s[j].stu6=stubacjt2_6.getText();
										allway.s[j].stu7=stubacjt2_7.getText();
										allway.s[j].stu8=stubacjt2_8.getText();
									}
									if(num>=1) {
										for ( i = 0; i<k; i++) {
											all.s[i]=allway.s[j];
											String exchange=new String();
											exchange=all.s[i].stu1+" "+all.s[i].stu2+" "+all.s[i].stu3+" "+all.s[i].stu4+
														" "+all.s[i].stu5+" "+all.s[i].stu6+" "+all.s[i].stu7+" "+all.s[i].stu8;
											try{
												FileWriter a=new FileWriter(s1);
												a.write(exchange);
												a.write("\r\n");
												a.close();
											}catch(Exception W){
												W.printStackTrace();
											}
										}
										SearchError error=new SearchError();
										Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
										int width=(int)(screensize.getWidth()-300)/2;
										int height=(int)(screensize.getHeight()-200)/2;
										error.jl1.setText("修改成功！");
										error.setBounds( width, height, 300, 200);
										error.setVisible(true);	
									}
									if(num==0) { 
										SearchError error=new SearchError();
										Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
										int width=(int)(screensize.getWidth()-300)/2;
										int height=(int)(screensize.getHeight()-200)/2;
										error.setBounds( width, height, 300, 200);
										error.setVisible(true);	
									}
								break;
							}
							case "联系方式":{
								int i,j,num=0;
								j=0;
								for ( i = 0; i<k; i++)
									if (allway.s[i].stu7.equals(ss)) {
										num=num+1;
										j=i;
										allway.s[j].stu1=stubacjt2_1.getText();
										allway.s[j].stu2=stubacjt2_2.getText();
										allway.s[j].stu3=stubacjt2_3.getText();
										allway.s[j].stu4=stubacjt2_4.getText();
										allway.s[j].stu5=stubacjt2_5.getText();
										allway.s[j].stu6=stubacjt2_6.getText();
										allway.s[j].stu7=stubacjt2_7.getText();
										allway.s[j].stu8=stubacjt2_8.getText();

									}
									if(num>=1) {
										for ( i = 0; i<k; i++) {
											all.s[i]=allway.s[j];
											String exchange=new String();
											exchange=all.s[i].stu1+" "+all.s[i].stu2+" "+all.s[i].stu3+" "+all.s[i].stu4+
														" "+all.s[i].stu5+" "+all.s[i].stu6+" "+all.s[i].stu7+" "+all.s[i].stu8;
											try{
												FileWriter a=new FileWriter(s1);
												a.write(exchange);
												a.write("\r\n");
												a.close();
											}catch(Exception W){
												W.printStackTrace();
											}
										}
										SearchError error=new SearchError();
										Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
										int width=(int)(screensize.getWidth()-300)/2;
										int height=(int)(screensize.getHeight()-200)/2;
										error.jl1.setText("修改成功！");
										error.setBounds( width, height, 300, 200);
										error.setVisible(true);	
									}
									if(num==0) { 
										SearchError error=new SearchError();
										Dimension screensize=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
										int width=(int)(screensize.getWidth()-300)/2;
										int height=(int)(screensize.getHeight()-200)/2;
										error.setBounds( width, height, 300, 200);
										error.setVisible(true);	
									}
								break;
							}
						}
					}
				}
		 }
	 }
	 stubacjp3jb1s.addActionListener(new  stubacjp3jb1sAction());
	}
}


class MyComboBoxch extends AbstractListModel<String> implements ComboBoxModel<String>{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	String selecteditem=null;
	String ways[]= {"学号","姓名","联系方式"};
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
